package com.emprestalivro.desenvolvimento.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emprestalivro.desenvolvimento.models.usuarios.Administrador;
import com.emprestalivro.desenvolvimento.models.usuarios.Cliente;
import com.emprestalivro.desenvolvimento.models.usuarios.Pessoa;

import java.util.List;

public class PessoaDAO {
    private static EntityManagerFactory emf;

    public PessoaDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void salvarPessoa(Pessoa pessoa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
        em.close();
    }

    public Pessoa buscarPessoaPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        Pessoa pessoa = em.find(Pessoa.class, id);
        em.close();
        return pessoa;
    }

    public static List<Pessoa> buscarTodasPessoas() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT p FROM Pessoa p");
        List<Pessoa> pessoas = query.getResultList();
        em.close();
        return pessoas;
    }

    public static List<Pessoa> buscarTodosClientes() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Cliente c");
        List<Cliente> clientes = query.getResultList();
        em.close();
        return clientes;
    }

    public List<Administrador> buscarTodosAdministradores() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM Administrador a");
        List<Administrador> administradores = query.getResultList();
        em.close();
        return administradores;
    }

    public void atualizarPessoa(Pessoa pessoa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(pessoa);
        em.getTransaction().commit();
        em.close();
    }

    public void excluirPessoa(Pessoa pessoa) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        pessoa = em.merge(pessoa);
        em.remove(pessoa);
        em.getTransaction().commit();
        em.close();
    }
}
