package entidades;

import java.util.ArrayList;
import java.util.List;

//HERANÇA
public class Contato extends Pessoa{
	//ATRIBUTOS
	private String endereco;
	private List<Telefone>telefones;
	private String sexo;
	
	public Contato () {
		telefones = new ArrayList<Telefone>();
		
	}	
	
	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	//SHIFT + ALT + S  --- DEPOIS GENERAR OS GETS SETTERS
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	private String imprimeTelefones (){
		String imprimir;
				for (Telefone obj : this.telefones){
					imprimir = imprimir + obj.toString();
					
				}
		
				return imprimir;
	}
	
	public String toString(){
		return "Contato : " +
	           "Nome: "+ this.getNome()+
			   "CPF: " + this.getCpf()+
			   "Endereço" + this.endereco +
			   "Telefones" + this.imprimeTelefones () +
			   "Sexo" + this.sexo;
		
	}
}
