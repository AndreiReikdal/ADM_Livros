package com.emprestalivro.desenvolvimento;
import java.util.Scanner;

import com.emprestalivro.desenvolvimento.dao.UsuarioDAO;
import com.emprestalivro.desenvolvimento.models.usuarios.Usuario;

public class Application {
    // ConfigureJavaSE11Environment.configureEnvironment();
    static Scanner leitor = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            // Criar instância do UsuarioDAO
            UsuarioDAO usuarioDAO = new UsuarioDAO();

            // Criar um novo usuário com base nas informações fornecidas pelo usuário
            System.out.println("Digite o nome do usuário:");
            String nome = leitor.nextLine();

            System.out.println("Digite a idade do usuário:");
            int idade = leitor.nextInt();

            Usuario novoUsuario = new Usuario(nome, idade);

            // Salvar o novo usuário no banco de dados
            usuarioDAO.salvarUsuario(novoUsuario);

            System.out.println("Usuário criado com sucesso!");

        } catch (Exception e) {
            // Tratamento da exceção
            
            // Exibindo a mensagem de erro
            System.out.println("Ocorreu um erro: " + e.getMessage());
            
            // Exibindo o rastreamento da pilha de exceções
            e.printStackTrace();
        }
    }
}



    /* //   Código da aplicação
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
    
 ATENÇÃO: SÃO TRECHOS DE CÓDIGOS QUE FAZEM OPERAÇÕES DISTINTAS. DESCOMENTE CADA TRECHO PARA TESTAR CADA OPERAÇÃO.

        // Instanciação dos objetos DAO
       UsuarioDAO pDao = new UsuarioDAO();
        pDao.someMethod(); // Call a method on pDao
        UsuarioDAO usuarioDAO = new UsuarioDAO();

        // Crie um novo usuário
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome("João");
        novoUsuario.setEmail("joao@example.com");

        // Salve o novo usuário no banco de dados
        usuarioDAO.salvarPessoa(novoUsuario);

        System.out.println("Usuário criado com sucesso!");

// Use pDao further in your code as needed*/

       

        // Salva os objetos no banco
