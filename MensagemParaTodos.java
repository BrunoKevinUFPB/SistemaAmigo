package Exercício_02_E_03;

public  class  MensagemParaTodos  extends  Mensagem {
	
	
	public  MensagemParaTodos () {
		this ( " " , " " , falso );
	}
	public  MensagemParaTodos ( String  texto , String  emailRemetente , boolean  ehAnonima ) {
		super (texto, emailRemetente, ehAnonima);
	}
	
	public  String  getTextoCompleto () {
		if ( super . ehAnonima ()) {
			return  " Mensagem para todos \ n Texto: " +  super . getTexto ();
		} else {
			voltar  " Mensagem de "  +  super . getEmailRemetente () +  " Para todos \ n "  + " Texto: "  +  super . getTexto ();
		}
		
		
	}
	
	
}