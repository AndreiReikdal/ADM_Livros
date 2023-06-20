package com.emprestalivro.desenvolvimento.models.usuarios;


import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;

@Entity
@DiscriminatorValue(value = "cliente")
public class Cliente extends Pessoa {
    
    public Cliente() {
       
    }

    private String cpf;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<Emprestimo> emprestimos;

    
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

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    @Override
    public String toString() {
        return "Cliente: nome = " + nome + ", idade = " + idade + ", cpf = " + cpf;
    }
}


