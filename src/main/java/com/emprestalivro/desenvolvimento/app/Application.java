package com.emprestalivro.desenvolvimento.app;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import com.emprestalivro.desenvolvimento.dao.EmprestimoDAO;
import com.emprestalivro.desenvolvimento.dao.LivroDAO;
import com.emprestalivro.desenvolvimento.dao.PessoaDAO;
import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;
import com.emprestalivro.desenvolvimento.models.estante.Estante;
import com.emprestalivro.desenvolvimento.models.livro.Livro;
import com.emprestalivro.desenvolvimento.models.usuarios.Cliente;
import com.emprestalivro.desenvolvimento.models.usuarios.Pessoa;

import java.util.Scanner;

public class Application {
    static Scanner leitor = new Scanner(System.in);
  
    public static void main(String[] args) {
        // Instanciar livros
        
        
        // Instanciar estantes
        Estante e1 = new Estante("Estante A", "Editora X", "1234567890", 2021, "Ficção", "Vermelha", "Grande");

        Estante e2 = new Estante("Estante B", "Editora Y", "0987654321", 2022, "Romance", "Branca", "Média");


        // Instanciar cliente
        Cliente c1 = new Cliente("João", 30, "123456789");

        // Criar objetos de empréstimo
        Emprestimo emprestimo1 = new Emprestimo( e1, c1);
        Emprestimo emprestimo2 = new Emprestimo( e1, c1);
        

        // Relacionar empréstimos com o cliente
        Cliente.getEmprestimos().add(emprestimo1);
        Cliente.getEmprestimos().add(emprestimo2);
     

        // Salvar objetos no banco de dados
        LivroDAO.salvarLivro(e1);
        LivroDAO.salvarLivro(e2);
       

        EmprestimoDAO.salvarEmprestimo(emprestimo1);
        EmprestimoDAO.salvarEmprestimo(emprestimo2);
       
        /*********** BUSCAR TODOS OS EMPRÉSTIMOS E IMPRIMI-LOS NA TELA ************/
        List<Emprestimo> emprestimos = EmprestimoDAO.buscarTodosEmprestimos();
        for (Emprestimo emprestimo : emprestimos) {
            System.out.println(emprestimo);
        }
        /***************************************************************/

        /********** BUSCAR TODOS OS EMPRÉSTIMOS E IMPRIMI-LOS NA TELA ************/
        List<Pessoa> clientes = PessoaDAO.buscarTodosClientes();
        System.out.println(clientes);
        /***************************************************************/

        /********** BUSCAR UMA PESSOA POR UM NOME E ALTERAR O NOME DA PESSOA **********/
        // Ler o nome a ser buscado
        System.out.println("Digite um nome: ");
        String nomeBuscado = leitor.nextLine();

        // Buscar todas as pessoas do banco
        List<Pessoa> pessoas = PessoaDAO.buscarTodasPessoas();

        // Percorrer a lista até encontrar o nome (ou cada nome se houver repetidos)
        for (Pessoa pessoa : pessoas) {
            if (nomeBuscado.equals(pessoa.getNome())) {
                System.out.println("Pessoa encontrada, digite um novo nome: ");
                String novoNome = leitor.nextLine();
                // Alterar o nome no objeto
                pessoa.setNome(novoNome);
                // Salvar alterações no banco
                pessoaDao.atualizarPessoa(pessoa);
            }
        }
        /*****************************************************************************/

        /********** REMOVER UMA PESSOA PELO SEU ID **********/
        // Carregar a lista de pessoas do banco
        List<Pessoa> pessoas = pessoaDao.buscarTodasPessoas();

        // Imprimir cada pessoa (O toString deve imprimir o ID neste caso)
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Selecionar o ID da pessoa a ser removida
        System.out.println("Selecione um ID para remover: ");
        Long idSelecionado = Long.parseLong(leitor.nextLine());

        // Buscar a pessoa por ID e removê-la do banco
        Pessoa pessoaRemover = pessoaDao.buscarPessoaPorId(idSelecionado);
        pessoaDao.excluirPessoa(pessoaRemover);
        /*****************************************************************************/

        /********** SELECIONAR UM EMPRÉSTIMO PELO NOME DO LIVRO E ALTERAR O CLIENTE **********/
        List<Emprestimo> emprestimos = emprestimoDao.buscarTodosEmprestimos();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getLivro().getTitulo().equals("Nome do livro")) {
                // Buscar cliente pelo ID (na aplicação real, você deve obter o ID do objeto)
                Cliente novoCliente = (Cliente) pessoaDao.buscarPessoaPorId(1L);

                // Definir o novo cliente e atualizar no empréstimo
                emprestimo.setCliente(novoCliente);

                // Atualizar no banco
                EmprestimoDAO.atualizarEmprestimo(emprestimo);
            }
        }
/*****************************************************************************/

}}

   
