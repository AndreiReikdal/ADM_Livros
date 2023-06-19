package com.emprestalivro.desenvolvimento.models.emprestimo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.emprestalivro.desenvolvimento.models.estante.Estante;
import com.emprestalivro.desenvolvimento.models.livro.Livro;
import com.emprestalivro.desenvolvimento.models.usuarios.Cliente;
import com.emprestalivro.desenvolvimento.models.usuarios.Pessoa;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Outros atributos da classe Emprestimo

    @OneToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Pessoa pessoa;

    @OneToOne
    @JoinColumn(name = "estante_id")
    private Estante estante;

    // Construtores, getters e setters

    public Emprestimo() {
    }

    public Emprestimo(Livro livro, Pessoa pessoa, Estante estante) {
        this.livro = livro;
        this.pessoa = pessoa ;
        this.estante = estante;
    }

    public Emprestimo(Estante e1, Cliente c1) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setUsuario(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    public static void salvarEmprestimo(Emprestimo emprestimo1) {
    }
}



