package exercao;

public class CpfVazioException extends Exception  {
	
	private static final long serialVersionUID = 1L;
	public CpfVazioException(){
		super("o CPF invalido, não pode ser vazio");
	}
}



