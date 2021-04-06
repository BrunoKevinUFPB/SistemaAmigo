package Exercício_02_E_03;

public  class  MensagemParaAlguem  extends  Mensagem {
	private  String emailDestinatario;
	
	public  MensagemParaAlguem ( String  texto , String  email , boolean  ehAnonimo ) {
		super (texto, email, ehAnonimo);
		isso . emailDestinatario = email;
	}
	
	public  String  getDestinatario () {
		devolva  isso . emailDestinatario;
	}

	public  void  setEmailDestinatario ( String  emailDestinatario ) {
		isso . emailDestinatario = emailDestinatario;
	}
	
	
	public  String  getTextoCompleto () {
		return  " Mensagem para: " + this . emailDestinatario +  " \ n Texto da mensagem: " + getTexto ();
	}
}
