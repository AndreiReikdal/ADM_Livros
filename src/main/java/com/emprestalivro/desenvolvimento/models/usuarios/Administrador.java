package com.emprestalivro.desenvolvimento.models.usuarios;
import java.util.List;
import javax.persistence.*;
import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;
import com.emprestalivro.desenvolvimento.models.livro.Livro;

@Entity
@DiscriminatorValue(value = "administrador")
public class Administrador extends Pessoa {
    protected long id;
    private String cpf;
    private String senha;
    


    @OneToMany(mappedBy = "administrador", fetch = FetchType.EAGER)
    private List<Livro> listaLivros;
    private List<Emprestimo> listaEmprestimos;

    public Administrador() {
    }

    public Administrador(String nome, int idade, String cpf,String senha) {
        super(nome, idade);
        this.senha = senha;
        this.cpf = cpf;
        
    }

    

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public List<Emprestimo> getListaEmprestimos() {
        return listaEmprestimos;
    }

    public void setListaEmprestimos(List<Emprestimo> listaEmprestimos) {
        this.listaEmprestimos = listaEmprestimos;
    }

    

    public Object getSenhaObject() {
        return senha;
    }

    
    
    @Override
    public String toString() {
        return "\nAdministrador: nome = " + nome + " idade = " + idade + " cpf = " + cpf +" senha = "+ senha + "\n\n";
    }
}

