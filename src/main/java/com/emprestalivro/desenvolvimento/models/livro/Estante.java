package com.emprestalivro.desenvolvimento.models.livro;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.emprestalivro.desenvolvimento.models.livro.Livro;
import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;

@Entity
@DiscriminatorValue(value = "estante")
public class Estante extends Livro {
    private String genero;
    private String cor;
    private String tamanho;



    public Estante(String titulo, String editora, String iSBN, int ano, String genero, String cor, String tamanho) {
        super(titulo, editora, iSBN, ano);
        this.genero = genero;
        this.cor = cor;
        this.tamanho = tamanho;
    }
    @OneToMany
    @JoinColumn(name = "emprestimo_id")
    private Emprestimo emprestimo;

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

    @Override
    public String toString() {
        return "Estante [genero=" + genero + ", cor=" + cor + ", tamanho=" + tamanho + "]";
    }
    
}
    
