
package exercao;

public class NomeVazioException extends Exception  {
	
	private static final long serialVersionUID = 1L;
	public NomeVazioException(){
		super("o Nome invalido, n�o pode ser vazio");
	}
}



