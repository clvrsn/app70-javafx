package br.com.blol.app70.exceptions;

public class ExceptionBank  extends Exception {
	
	private static final long serialVersionUID = 1L;
	private String msg;
	
	public ExceptionBank(String msg){
		this.msg = msg;
	}
	public String getMessage(){
		return msg;
	}
	
}
