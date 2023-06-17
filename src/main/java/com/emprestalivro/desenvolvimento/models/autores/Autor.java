package com.emprestalivro.desenvolvimento.models.autores;

public class Autor {
    protected String nome;
    protected String nacionalidade;
    protected int qtdlivro;
    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getNacionalidade() {
        return nacionalidade;
    }


    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }


    public int getQtdlivro() {
        return qtdlivro;
    }


    public void setQtdlivro(int qtdlivro) {
        this.qtdlivro = qtdlivro;
    }


    @Override
    public String toString() {
        return "Autor [nome=" + nome + ", nacionalidade=" + nacionalidade + "]";
    }
    

    
}
