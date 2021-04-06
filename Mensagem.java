package Exercício_02_E_03;

public  abstract  class  Mensagem {
	private  String texto;
	private  String emailRemetente;
	 anonimo booleano privado ;
	
	
	public  Message () {
		this ( " " , " " , falso );
	}


	public  Message ( String  texto , String  email , boolean  anonimo ) {
		isso . texto = texto;
		isso . emailRemetente = email;
		isso . anonimo = anonimo;
	}
	
	public  abstract  String  getTextoCompleto ();
	
	public  String  getTexto () {
		return texto;
	}


	public  void  setTexto ( String  texto ) {
		isso . texto = texto;
	}


	public  String  getEmailRemetente () {
		return emailRemetente;
	}


	public  void  setEmailRemetente ( String  emailRemetente ) {
		isso . emailRemetente = emailRemetente;
	}


	public  boolean  ehAnonima () {
		devolva  isso . anonimo;
	}


	@Sobrepor
	public  String  toString () {
		return  " texto = "  + texto +  " \ n emailRemetente = "  + emailRemetente +  " \ n anonimo = "  + anonimo + " \ n " ;
	}
	
	
}
