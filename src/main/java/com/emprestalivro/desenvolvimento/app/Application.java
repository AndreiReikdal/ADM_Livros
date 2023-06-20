package com.emprestalivro.desenvolvimento.app;
import java.util.Scanner;
import java.util.List;

import com.emprestalivro.desenvolvimento.dao.EmprestimoDAO;
import com.emprestalivro.desenvolvimento.dao.LivroDAO;
import com.emprestalivro.desenvolvimento.dao.PessoaDAO;
import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;
import com.emprestalivro.desenvolvimento.models.livro.Estante;
import com.emprestalivro.desenvolvimento.models.usuarios.Administrador;
import com.emprestalivro.desenvolvimento.models.usuarios.Cliente;
import com.emprestalivro.desenvolvimento.models.usuarios.Pessoa;


public class Application {
    static Scanner leitor = new Scanner(System.in);
    static PessoaDAO pessoaDao = new PessoaDAO();
    public static void main(String[] args) {
    // Instanciar livros
    
    //EmprestimoDAO emprestimoDao = new EmprestimoDAO();
    //LivroDAO livroDao = new LivroDAO();

    
    Cliente c1 = new Cliente("João", 30, "123456789");
    Administrador a1 = new Administrador("Fernando", 40, "65416511", "dccdc16516dc");
    pessoaDao.salvarPessoa(c1);
    pessoaDao.salvarPessoa(a1);



    // Instanciar estantes
    //Estante e1 = new Estante("Estante A", "Editora X", "1234567890", 2021, "Ficção", "Vermelha", "Grande");
    //Estante e2 = new Estante("Estante B", "Editora Y", "0987654321", 2022, "Romance", "Branca", "Média");

    // Instanciar cliente
    

    // Salvar livros
    //livroDao.salvarLivro(e1);
    //livroDao.salvarLivro(e2);

    // Salvar pessoas (cliente e administrador)
    }}
     /* 
    // Criar objeto de empréstimo
    Emprestimo emprestimo1 = new Emprestimo(c1, e1);

    // Salvar empréstimo
    emprestimoDao.salvarEmprestimo(emprestimo1);

    // Buscar todos os empréstimos e imprimir na tela
    List<Emprestimo> emprestimos = emprestimoDao.buscarTodosEmprestimos();
    for (Emprestimo emprestimo : emprestimos) {
        System.out.println(emprestimo);
    }

    // Buscar todos os clientes e imprimir na tela
    List<Cliente> clientes = pessoaDao.buscarTodosClientes();
    for (Cliente cliente : clientes) {
        System.out.println(cliente);
    }

    // Buscar todas as pessoas e imprimir na tela
    List<Pessoa> pessoas = pessoaDao.buscarTodasPessoas();
    for (Pessoa pessoa : pessoas) {
        System.out.println(pessoa);
    }

    // Buscar uma pessoa pelo nome e alterar o nome da pessoa
    Scanner leitor = new Scanner(System.in);
    System.out.println("Digite um nome: ");
    String nomeBuscado = leitor.nextLine();

    for (Pessoa pessoa : pessoas) {
        if (nomeBuscado.equals(pessoa.getNome())) {
            System.out.println("Pessoa encontrada, digite um novo nome: ");
            String novoNome = leitor.nextLine();
            pessoa.setNome(novoNome);
            pessoaDao.atualizarPessoa(pessoa);
        }
    }

    // Remover uma pessoa pelo ID
    System.out.println("Selecione um ID para remover: ");
    Long idSelecionado = Long.parseLong(leitor.nextLine());
    Pessoa pessoaRemover = pessoaDao.buscarPessoaPorId(idSelecionado);
    pessoaDao.excluirPessoa(pessoaRemover);

    // Selecionar um empréstimo pelo nome do livro e alterar o cliente
    System.out.println("Digite o nome do livro: ");
    String nomeLivro = leitor.nextLine();

    for (Emprestimo emprestimo : emprestimos) {
        if (emprestimo.getLivro().getTitulo().equals(nomeLivro)) {
            Cliente novoCliente = (Cliente) pessoaDao.buscarPessoaPorId(1L);
            emprestimo.setCliente(novoCliente);
            emprestimoDao.atualizarEmprestimo(emprestimo);
        }
    }
}}
*/
   
