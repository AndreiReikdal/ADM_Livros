package app;
import java.util.ArrayList;
import java.util.Scanner;

import models.*;
import models.autores.Autor;

public class Biblioteca {
    static Scanner leitor = new 
    ArrayList<Livro> listaLivros =new ArrayList<Livro>();
    
    public static void main(String[] args) {
    int op = 0;
    Autor au = new Autor(null, null);

    LivroDigital dig  = new LivroDigital("kar", "null", "null", 10, "null");
    LivroDigital dig1  = new LivroDigital("null", "null", "null", 60, "null");
    LivroDigital dig2  = new LivroDigital("null", "null", "null", 20, "null");

    LivroFisico fis = new LivroFisico("null", "null", "null", 30, 230, "null");
    LivroFisico fis1 = new LivroFisico("null", "null", "null", 40, 450, "null");
    LivroFisico fis2 = new LivroFisico("null", "null", "null", 30, 430, "null");
    

    
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
}
