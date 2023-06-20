package com.biblioteca.modelos;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "Cliente")
public class Cliente extends Pessoa {
    

    
    private String cpf;


    // Construtor vazio
    public Cliente(){
    }

    public Cliente(String nome, int idade,String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }


    @Override
    public String toString() {
        return "\nCliente:  nome = " + nome +" idade = " + idade +" CPF = " + cpf +"\n\n";
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }



    
    
}
