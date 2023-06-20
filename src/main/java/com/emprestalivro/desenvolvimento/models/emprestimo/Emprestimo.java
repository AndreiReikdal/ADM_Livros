package com.emprestalivro.desenvolvimento.models.emprestimo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.emprestalivro.desenvolvimento.models.livro.Estante;
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
   
    @ManyToOne
    @JoinColumn(name = "livro_id")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "estante_id")
    private Estante estante;

    // Construtores, getters e setters

    public Emprestimo() {
    }

    


    public Emprestimo(Cliente cliente, Estante estante) {
        this.cliente = cliente;
        this.estante = estante;
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
        return cliente;
    }

    public void setUsuario(Cliente pessoa) {
        this.cliente = pessoa;
    }

    public Estante getEstante() {
        return estante;
    }

    public void setEstante(Estante estante) {
        this.estante = estante;
    }

    public static void salvarEmprestimo(Emprestimo emprestimo1) {
    }

    public void setCliente(Cliente novoCliente) {
    }

    @Override
    public String toString() {
        return "Emprestimo [id=" + id + ", livro=" + livro + ", pessoa=" + cliente + ", estante=" + estante + "]";
    }
    
}



