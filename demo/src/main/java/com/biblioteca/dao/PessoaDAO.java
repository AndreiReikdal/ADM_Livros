package com.biblioteca.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.biblioteca.modelos.Pessoa;

import java.util.List;

public class PessoaDAO {
    private EntityManagerFactory emf;

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

    public List<Pessoa> buscarTodosPessoas() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT f FROM Pessoa f");
        List<Pessoa> pessoas = query.getResultList();
        em.close();
        return pessoas;
    }

    public List<Pessoa> buscarTodosAdministrador(){
          EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT a FROM Administrador a");
        List<Pessoa> pessoas = query.getResultList();
        em.close();
        return pessoas;
    }

    public List<Pessoa> buscarTodosClientes(){
          EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Cliente c");
        List<Pessoa> pessoas = query.getResultList();
        em.close();
        return pessoas;
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
