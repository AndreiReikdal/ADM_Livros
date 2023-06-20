package com.biblioteca.modelos;

import java.util.List;

import javax.persistence.*;


@Entity
public class Livro {


    // Declaração dos atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    protected String titulo, isbn, editora;
    

    protected int ano;


    @OneToMany(mappedBy = "livro", fetch = FetchType.EAGER)
    private List<Emprestimo> emprestimos;

    
    

    // Construtor vazio
    public Livro(){

    }

    public Livro(String titulo, String editora, String isbn, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.isbn = isbn;
        this.ano = ano;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Livro [id=" + id + ", titulo=" + titulo + ", isbn=" + isbn + ", editora=" + editora + ", genero="
                 + ", ano=" + ano + "]";
    }

  





    
}