package model.exceptions;

public class DomainException extends RuntimeException{

	//Declarar a versão de uma classe serializable
	private static final long serialVersionUID = 1L;
	
	//Permite que eu possa instanciar uma exceção personalizada
	//passando uma mensagem para ela
	public DomainException(String msg) {
		super(msg);
	}
}
