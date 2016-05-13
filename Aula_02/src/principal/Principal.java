package principal;

import java.util.Scanner;

import entidades.Contato;
import exercao.NomeVazioException;

public class Principal {

	public static void main(String[] args) throws Exception {
	
		try{
		Scanner teclado = new Scanner(System.in);
		
		// É O OBJETO Contato obj = new Contato();
		Contato obj = new Contato();
		
		System.out.println("Digite o nome: ");
		obj.setNome(teclado.nextLine());
		
		System.out.println("Digite o CPF: ");
		obj.setCpf(teclado.nextLine());
		
		System.out.println("Digite o endereço: ");
		obj.setEndereco(teclado.nextLine());
		
		System.out.println("Digite o telefone: ");
		obj.setTelefone(teclado.nextLine());
		
		System.out.println("Digite o sexo: ");
		obj.setSexo(teclado.nextLine());
		
		
	}catch(Exception e){
		System.out.println("Erro: " + e.getMessage());
	}
	}
}
	

	

