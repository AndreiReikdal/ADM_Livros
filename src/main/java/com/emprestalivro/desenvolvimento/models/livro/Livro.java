package models;
import java.util.ArrayList;
import models.autores.*;

public class Livro {
    protected String titulo;
    protected String editora;
    protected String iSBN;
    protected int ano;
    public  ArrayList<Autor> listaAutor = new ArrayList<Autor>();
    public Livro(String titulo, String editora, String iSBN, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.iSBN = iSBN;
        this.ano = ano;
    }
    public class Livro {
    private String nome;
    private String ISBN;
    private Estante estante;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }
}

// Pasta models - Estante.java

public class Estante {
    private String genero;
    private String cor;
    private String tamanho;

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
    
}
