package com.emprestalivro.desenvolvimento.models.estante;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.emprestalivro.desenvolvimento.models.livro.Livro;

@Entity
@DiscriminatorValue(value = "estante")
public class Estante extends Livro {
    private String genero;
    private String cor;
    private String tamanho;
/*@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;

    @ManyToOne
    @JoinColumn(name = "dono_id") */
    

    public Estante(String titulo, String editora, String iSBN, int ano, String genero, String cor, String tamanho) {
        super(titulo, editora, iSBN, ano);
        this.genero = genero;
        this.cor = cor;
        this.tamanho = tamanho;
    }

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
    
