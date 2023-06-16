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
    
    
}
