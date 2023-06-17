package com.emprestalivro.desenvolvimento;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.h2.tools.Server;
import models.*;

public class Biblioteca {
    public static void main(String[] args) {
        // Código da aplicação
        Livro livro = new Livro();
        livro.setNome("O Senhor dos Anéis");
        livro.setISBN("9780544003415");
        Estante estante = new Estante();
        estante.setGenero("Fantasia");
        estante.setCor("Marrom");
        estante.setTamanho("Grande");
        livro.setEstante(estante);

        System.out.println("Informações do Livro:");
        System.out.println("Nome: " + livro.getNome());
        System.out.println("ISBN: " + livro.getISBN());
        System.out.println("Estante: " + livro.getEstante().getGenero() + ", " + 
        livro.getEstante().getCor() + ", " + livro.getEstante().getTamanho());
    
    
    
    
    }







    }

