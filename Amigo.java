package Exercício_02_E_03;

public  class  Amigo {
	private  String nome;
	 String privada de email;
	private  String emailSorteado;
	
	
	
	public  Amigo ( String  amigo , String  emailAmigo ) {
		isso . nome = amigo;
		isso . email = emailAmigo;
	}



	public  String  getNome () {
		return nome;
	}



	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}



	public  String  getEmail () {
		email de retorno ;
	}



	public  void  setEmail ( String  email ) {
		isso . email = email;
	}



	public  String  getEmailSorteado () {
		return emailSorteado;
	}



	public  void  setEmailSorteado ( String  emailSorteado ) {
		isso . emailSorteado = emailSorteado;
	}



	@Sobrepor
	public  String  toString () {
		return  " nome = "  + nome +  " \ n email = "  + email +  " \ n emailSorteado = "  + emailSorteado;
	}
	
	
}
