package model.exceptions;

public class DomainException extends RuntimeException{

	//Declarar a vers�o de uma classe serializable
	private static final long serialVersionUID = 1L;
	
	//Permite que eu possa instanciar uma exce��o personalizada
	//passando uma mensagem para ela
	public DomainException(String msg) {
		super(msg);
	}
}
