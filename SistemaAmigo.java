package Exercício_02_E_03;

import  java.util.ArrayList ;
import  java.util.List ;

public  class  SistemaAmigo {
	List < Mensagem > Mensagens;
	Lista < Amigo > amigos;
	privado  int quantMensagensEnviadas =  0 ;
	
	
	
	public  SistemaAmigo () {
		isso . mensagens =  novo  ArrayList <> ();
		isso . amigos = novo  ArrayList <> ();
	}
	
	public  void  cadastraAmigo ( String  nomeAmigo , String  emailAmigo ) throws  AmigoJaExisteException {
		Amigo novoAmigo =  novo  Amigo (nomeAmigo, emailAmigo);
		booleano amigoExiste =  false ;
		para ( Amigo a : amigos) {
			if (a . getEmail () . equalsIgnoreCase (emailAmigo)) {
				amigoExiste =  true ;
			}
		}
		
		if (amigoExiste) {
			lançar  novo  AmigoJaExisteException ( " Amigo já cadastrado no sistema " );
		} else {
			isso . amigos . adicionar (novoAmigo);
		}
		
		
		
	}
	
	public  Amigo  pesquisaAmigo ( String  nomeAmigo ) {
		Amigo amigoAchado =  null ;
		para ( Amigo amigos : amigos) {
			if (amigos . getNome () . equalsIgnoreCase (nomeAmigo)) {
				amigoAchado = amigos;
			}
		}
		return amigoAchado;
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
		booleano amigoAchado =  false ;
		para ( Amigo amigo : amigos) {
			if (amigo . getEmail () . equalsIgnoreCase (emailDaPessoa)) {
				amigoAchado =  true ;
				
				if (amigo . getEmailSorteado () ==  null ) {
					lançar  novo  AmigoNaoSorteadoException ( " Amigo n ramos sorteado " );
				}
				
				voltar amigo . getEmailSorteado ();
			}
		}
		
		if ( ! amigoAchado) {
			lançar  novo  AmigoInexistenteException ( " Amigo inexistente. " );
		}
		
		
		
		return  null ;
	}
	
	public  void  configuraAmigoSecretoDe ( String  emailDaPessoa , String  emailAmigoSorteado ) throws  AmigoInexistenteException {
		booleano amigoAchado =  false ;
		para ( Amigo amigo : amigos) {
			if (amigo . getEmail () . equalsIgnoreCase (emailDaPessoa)) {
				amigo . setEmailSorteado (emailAmigoSorteado);
				amigoAchado =  true ;
			}
		}
		
		if ( ! amigoAchado) {
			lançar  novo  AmigoInexistenteException ( " Amigo Inexistente no sistema. " );
		}
		
	}
	
}
