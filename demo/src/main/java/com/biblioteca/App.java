package com.biblioteca;  
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.biblioteca.dao.PessoaDAO;  
import com.biblioteca.dao.LivroDAO;
import com.biblioteca.dao.EmprestimoDAO;


import com.biblioteca.modelos.*;

import net.bytebuddy.agent.builder.AgentBuilder.CircularityLock.Default;

public class App 
{
    static Scanner leitor = new Scanner(System.in);

    static LivroDAO lDao = new LivroDAO();
    static PessoaDAO pDao = new PessoaDAO();
    static EmprestimoDAO eDao = new EmprestimoDAO();

    
    public static void main( String[] args )
    {


        

             int op = 0;
             

        do{
                System.out.print(" ---------MENU--------\n");
                System.out.print("1 - Crie PESSOA\n");
                System.out.print("2 - Crie LIVRO\n");
                System.out.print("3 - Fazer emprestimo\n");
                System.out.print("4 - CRUD   LIVRO\n");
                System.out.print("5 - CRUD   PESSOA\n");
                System.out.print("6 - DEVOLVER LIVRO\n");
                System.out.print("7 - LISTAR EMPRESTIMOS\n");


                op = leInteiro();
            
                switch(op){
                     case 1: 
                    cadastroDePessoa();
                break;
                case 2: 
                     cadastroDoLivro();
                break;
                case 3:
                    fazerEmprestimo();
                break;
    
                // case 4: 
                //     crudLivro();
                // break;
              
                // case 5:
                //     crudPessoa();
                // break;
                // case 6:
                //     devolverLivro();
                // break;
                // case 7:
                //     listaEmprestimos();
                // break;


            }

        }while(op != 0);
        
    
    
    
    }

    public static void fazerEmprestimo(){
        
            
     
     
             System.out.println("Qual Cliente quer pegar emprestado:");
             List<Pessoa> usuarios = pDao.buscarTodosClientes(); 
             for (Pessoa u : usuarios) {
                 System.out.println(u.getId() + ". " + u.getNome());
             }
             System.out.println("Insira o ID");
             Long escolheUsuario = leLong();
     
             System.out.println("Qual Livro voce Quer pegar emprestado:");
             List<Livro> livros = lDao.buscarTodosLivros(); 
             for (Livro l : livros) {
                 System.out.println(l.getId() + ". " + l.getTitulo());
             }
             System.out.println("Insira o ID");
             Long escolheLivro = leLong();
     
            
             Pessoa usuario = pDao.buscarPessoaPorId(escolheUsuario);
             Livro livro = lDao.buscarLivroPorId(escolheLivro);
             
             
             lDao.atualizarLivro(livro);
     
                Emprestimo emprestimo = new Emprestimo();
                 
                 emprestimo.setPessoa(usuario);
                 emprestimo.setLivro(livro);
     
                 eDao.salvarEmprestimo(emprestimo);
    }


    public static void cadastroDePessoa(){
         System.out.println("Seleciona a PESSOA:");
        System.out.println("1  -   CLIENTE ");
        System.out.println("2  -   ADMINISTRADOR ");

        int tipoPessoa = leInteiro();
        
        if( tipoPessoa == 1){
            String nome, cpf;
            int idade;

            System.out.println("Nome do CLIENTE:");
            nome = leitor.nextLine();

            System.out.println("Idade :");
            idade = leInteiro();

            System.out.println("CPF:");
            cpf = leitor.nextLine();

            pDao.salvarPessoa(new Cliente(nome, idade, cpf));

        }else if(tipoPessoa == 2){
            String nome,senha;
            int idade;

            System.out.println("Nome do ADMINISTRADOR:");
            nome = leitor.nextLine();

            System.out.println("Idade :");
            idade = leInteiro();

            System.out.println("SENHA:");
            senha = leitor.nextLine();

    
            
            pDao.salvarPessoa(new Administrador(nome, idade, senha));
        }
     }

     public static void cadastroDoLivro(){

            String titulo,editora,isbn;
            int ano;
        
            System.out.println("Insira o TITULO:");
            titulo = leitor.nextLine();
    
            System.out.println("EDITORA: ");
            editora = leitor.nextLine();
    
            System.out.println("ISBN:");
            isbn = leitor.nextLine();
    
            System.out.println("Qual o ANO é o livro?");
             ano = leInteiro();
     
        
            lDao.salvarLivro(new Livro(titulo, editora, isbn, ano));


     }
         public static int leInteiro(){
        return Integer.parseInt(leitor.nextLine());
    }

    public static Long leLong() {
    try {
        String input = leitor.nextLine();
        return Long.parseLong(input);
    } catch (NumberFormatException e) {
        System.out.println("Valor inválido! Digite um número inteiro longo válido:");
        return leLong();
    }
}



    }

