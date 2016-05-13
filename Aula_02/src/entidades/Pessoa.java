package entidades;

import exercao.CpfVazioException;
import exercao.NomeVazioException;

public class Pessoa {
    
    public String nome;
    public String cpf;

    
    public void setNome(String nome)throws NomeVazioException{
        if (nome.trim().isEmpty())
        	throw new NomeVazioException();
    	this.nome =nome;
    }
     
    public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws CpfVazioException{
    	if(cpf.trim().isEmpty())
            throw new CpfVazioException();
        this.cpf = cpf;

    }
}
