package exercao;

public class CpfVazioException extends Exception  {
	
	private static final long serialVersionUID = 1L;
	public CpfVazioException(){
		super("o CPF invalido, n�o pode ser vazio");
	}
}



