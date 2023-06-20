package com.biblioteca.modelos;

import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "administrador")
public class Administrador extends Pessoa {
    

    
    private String senha;


    // Construtor vazio
    public Administrador(){
    }

    public Administrador(String nome, int idade ,String senha) {
        super(nome, idade);
        this.senha = senha;
    }


    @Override
    public String toString() {
        return "\nAdministrador:  nome = " + nome +" idade = " + idade +   "Senha = " + senha +"\n\n";
    }

    public String getsenhas() {
        return senha;
    }

    public void setsenhas(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    
    
}
