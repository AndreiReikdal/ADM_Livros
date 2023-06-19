package com.emprestalivro.desenvolvimento.models.usuarios;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;
import com.emprestalivro.desenvolvimento.models.livro.Livro;


@Entity
@DiscriminatorValue(value = "administrador")
public class Administrador extends Pessoa {
    private String cpf;
    private Object senhaObject;
    private List<Livro> listaLivros;
    private List<Emprestimo> listaEmprestimos;

    public Administrador() {
    }

    public Administrador(String nome, int idade, String cpf,Object senhaObject) {
        super(nome, idade);
        this.senhaObject = senhaObject;
        this.cpf = cpf;
        this.listaLivros = new ArrayList<>();
        this.listaEmprestimos = new ArrayList<>();
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
        return senhaObject;
    }

    public void setSenhaObject(Object senhaObject) {
        this.senhaObject = senhaObject;
    }
    @Override
    public String toString() {
        return "\nAdministrador: nome = " + nome + " idade = " + idade + " cpf = " + cpf +" senha = "+ senhaObject + "\n\n";
    }
}

