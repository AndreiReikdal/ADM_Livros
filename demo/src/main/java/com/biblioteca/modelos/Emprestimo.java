package com.biblioteca.modelos;

import java.util.List;

import javax.persistence.*;


@Entity
public class Emprestimo {


    // Declaração dos atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;
    
    protected String codigo;
   
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;
    


    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    // Construtor vazio
    public Emprestimo(){

    }

    public Emprestimo(String codigo) {
        this.codigo = codigo;
        
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Emprestimo [id=" + id + ", codigo=" + codigo + "]";
    }


   




    
}