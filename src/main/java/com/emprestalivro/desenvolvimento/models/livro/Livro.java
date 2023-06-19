package com.emprestalivro.desenvolvimento.models.livro;

import java.util.ArrayList;

import com.emprestalivro.desenvolvimento.models.estante.Estante;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_Livro")
@Table(name = "livro")
public class Livro  {
    protected String titulo;
    protected String editora;
    protected String iSBN;
    protected int ano;


    public Livro(String titulo, String editora, String iSBN, int ano) {
        this.titulo = titulo;
        this.editora = editora;
        this.iSBN = iSBN;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return iSBN;
    }

    public void setISBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

}

/*public class Biblioteca {
    static Scanner leitor = new ArrayList<Livro> listaLivros =new ArrayList<Livro>();
    
    public static void main(String[] args) {
    int op = 0;
    Autor au = new Autor(null, null);

   

    Livro fis = new Livro("null", "null", "null", 30, 230, "null");
    Livro fis1 = new Livro("null", "null", "null", 40, 450, "null");
    Livro fis2 = new Livro("null", "null", "null", 30, 430, "null");
    

    
    System.out.println();

    System.out.println(listaLivros);
      do{
        System.out.println("digite uma opçao");

        switch(op){
            case 1:
                cadastrarLivro();
        }
      }while(op != 0);
    }
} */