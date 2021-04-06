package Exercício_02_E_03;

import  javax.swing.JOptionPane ;

public  class  TestaSistemaAmigoGUI {
	public  static  void  main ( String [] args ) {
		int maxMensagens =  Inteiro . parseInt ( JOptionPane . showInputDialog ( null , " Digite o número de mensagens permitidas: " ));
		SistemaAmigo sistema =  novo  SistemaAmigo (maxMensagens);
		
		participantes int =  Inteiro . parseInt ( JOptionPane . showInputDialog ( null , " Digite o número de participantes: " ));
		
		para ( int i = 0 ; i < participantes; i ++ ) {
			String nomeAmigo =  JOptionPane . showInputDialog ( " Digite o nome do amigo: "  + i);
			String emailAmigo =  JOptionPane . showInputDialog ( " Digite o email do amigo: " + i);
			sistema . cadastraAmigo (nomeAmigo, emailAmigo);
		}
		
		para ( int i = 0 ; i < participantes; i ++ ) {
			String emailDaPessoa =  JOptionPane . showInputDialog ( " Digite o email do amigo número " + i);
			String emailAmigoSorteado =  JOptionPane . showInputDialog ( " Digite o email do par do amigo " + emailDaPessoa);
			tente {
				sistema . configuraAmigoSecretoDe (emailDaPessoa, emailAmigoSorteado);
				JOptionPane . showMessageDialog ( null , " Cadastrado com sucesso! " );
			} catch ( AmigoInexistenteException e) {
				JOptionPane . showMessageDialog ( nulo , e . getMessage ());
			
		}
		
	}
		
	String texto =  JOptionPane . showInputDialog ( " Digite o texto da mensagem: " );
	String emailRemetente =  JOptionPane . showInputDialog ( " Digite o seu email: " );
	boolean ehAnonima =  Boolean . parseBoolean ( JOptionPane . showInputDialog ( " true ou false " ));
	sistema . enviarMensagemParaTodos (texto, emailRemetente, ehAnonima);
		
	}
}
