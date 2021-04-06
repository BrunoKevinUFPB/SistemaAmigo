import  java.util.ArrayList ;
import  java.util.HashMap ;
import  java.util.List ;
import  java.util.Map ;

public  class  SistemaAmigoMap {
	List < Mensagem > Mensagens;
	Mapeie < String , Amigo > amigos;
	
	public  SistemaAmigoMap () {
		isso . mensagens =  novo  ArrayList <> ();
		isso . amigos = novo  HashMap <> ();
	}
	
	public  void  cadastraAmigo ( String  nomeAmigo , String  emailAmigo ) throws  AmigoJaExisteException {
		Amigo novoAmigo =  novo  Amigo (nomeAmigo, emailAmigo);
		if ( this . amigos . containsKey (emailAmigo)) {
			lançar  novo  AmigoJaExisteException ( " J  cadastrado no sistema " );
		} else {
			isso . amigos . colocar (emailAmigo, novoAmigo);
		}
		
		
		
	}
	
	public  Amigo  pesquisaAmigo ( String  emailAmigo ) throws  AmigoInexistenteException {
		Amigo amigoAchado =  isso . amigos . get (emailAmigo);
		if (amigoAchado ==  null ) {
			lançar  novo  AmigoInexistenteException ( " Amigo n o encontrado no sistema. " );
		} else {
			
			return amigoAchado;
		}
	}

	
	public  void  enviarMensagemParaTodos ( String  texto , String  emailRemetente , boolean  ehAnonima ) {
		MensagemParaTodos novaMensagem =  novo  MensagemParaTodos (texto, emailRemetente, ehAnonima);
		isso . mensagens . adicionar (novaMensagem);
	}
	
	public  void  enviarMensagemParaAlguem ( String  texto , String  emailRemetente , String  emailDestinatario , boolean  ehAnonima ) {
		MensagemParaAlguem novaMensagem =  novo  MensagemParaAlguem (texto, emailRemetente, ehAnonima);
		isso . mensagens . adicionar (novaMensagem);
	}
	
	
	
	
	public  List < Mensagem >  pesquisaMensagensAnonimas () {
		ArrayList < Mensagem > mensagensAnonimas =  new  ArrayList <> ();
		para ( Mensagem msg : mensagens) {
			if (msg . ehAnonima ()) {
				mensagensAnonimas . adicionar (msg);
			}
		}
		return mensagensAnonimas;
	}
	
	public  List < Mensagem >  pesquisaTodasAsMensagens () {
		List < Mensagem > msgs =  new  ArrayList <> ();
		
		para ( Mensagem msg : mensagens) {
			msgs . adicionar (msg);
		}
		
		return msgs;
	}
	public  String  pesquisaAmigoSecretoDe ( String  emailDaPessoa ) throws  AmigoInexistenteException , AmigoNaoSorteadoException {
		Amigo amigoSecreto =  isso . amigos . get (emailDaPessoa);
		
		if (amigoSecreto . getEmailSorteado () ==  null ) {
			lançar  novo  AmigoNaoSorteadoException ( " O amigo pesquisado n o tem um amigo secreto " );
		}
		
		voltar amigoSecreto . getEmailSorteado ();
	}
	
	public  void  configuraAmigoSecretoDe ( String  emailDaPessoa , String  emailAmigoSorteado ) throws  AmigoInexistenteException {
		Amigo amigoAchado =  isso . amigos . get (emailDaPessoa);
		if (amigoAchado ==  null ) {
			lançar  novo  AmigoInexistenteException ( " Amigo Inexistente no sistema. " );
		} else {
			amigoAchado . setEmailSorteado (emailAmigoSorteado);
		}
		
	}
	
}