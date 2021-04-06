package Exercício_02_E_03;

import  java.util.ArrayList ;
import  java.util.List ;

public  class  TestaAmigo {
	public  static  void  main ( String [] args ) {
		// Instancia
		SistemaAmigo sistema =  novo  SistemaAmigo ();
		Mensagem msg =  novo  MensagemParaTodos ();
		
		// cadastrando
		sistema . cadastraAmigo ( " Jos  " , " Jose@gmail.com " );
		sistema . cadastraAmigo ( " Maria " , " Maria@gmail.com " );
		
		// excessoes
		tente {
			sistema . configuraAmigoSecretoDe ( " Jose@gmail.com " , " Maria@gmail.com " );
			sistema . configuraAmigoSecretoDe ( " Maria@gmail.com " , " Jose@gmail.com " );
			Sistema . para fora . println ( " Configurado com sucesso. " );
		} catch ( AmigoInexistenteException e) {
			Sistema . para fora . println (e . getMessage ());
		}
		
		tente {
			sistema . configuraAmigoSecretoDe ( " Maria@gmail.com " , " Jose@gmail.com " );
			Sistema . para fora . println ( " Configurado com sucesso. " );
			
		} catch ( AmigoInexistenteException e) {
			Sistema . para fora . println (e . getMessage ());
			
		}
		
		
		// enviando msg anonima
		
		sistema . enviarMensagemParaAlguem ( " bom dia " , " Maria@gmail.com " , " Jose@gmail.com " , verdadeiro );
		sistema . enviarMensagemParaTodos ( " bom dia amigos " , " Maria@gmail.com " , verdadeiro );
		
		List < Mensagem > msgs = sistema . pesquisaMensagensAnonimas ();
		
		para ( Mensagem msgA : msgs) {
			Sistema . para fora . println (msgA . getTextoCompleto ());
		}
		
		
		tente {
			sistema . pesquisaAmigoSecretoDe ( " Jose@gmail.com " );
			Sistema . para fora . println ( " OK! " );
			
		} catch ( AmigoNaoSorteadoException e) {
			Sistema . para fora . println (e . getMessage ());
		} catch ( AmigoInexistenteException e) {
			Sistema . para fora . println (e . getMessage ());
		}
		
		
	}
}