package com.emprestalivro.desenvolvimento.models.usuarios;

import java.util.ArrayList;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;

@Entity
public class Cliente extends Pessoa {
    private String cpf;

    @OneToMany(mappedBy = "cliente")
    private static List<Emprestimo> emprestimos;

    public Cliente() {
    }

    public Cliente(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public static List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        Cliente.emprestimos = emprestimos;
    }

    @Override
    public String toString() {
        return "\nCliente: nome = " + nome + " idade = " + idade + " cpf = " + cpf + "\n\n";
    }
}

