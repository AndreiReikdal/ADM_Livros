package com.biblioteca.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.biblioteca.modelos.Emprestimo;
import com.biblioteca.modelos.Livro;

import java.util.List;

public class EmprestimoDAO {
    private EntityManagerFactory emf;

    public EmprestimoDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void salvarEmprestimo(Emprestimo emprestimo) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(emprestimo);
        em.getTransaction().commit();
        em.close();
    }

    public Emprestimo buscarEmprestimoPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        Emprestimo emprestimo = em.find(Emprestimo.class, id);
        em.close();
        return emprestimo;
    }

    public List<Emprestimo> buscarTodosEmprestimos() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Emprestimo e");
        List<Emprestimo> emprestimos = query.getResultList();
        em.close();
        return emprestimos;
    }

    



    public void atualizarEmprestimo(Emprestimo emprestimo) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(emprestimo);
        em.getTransaction().commit();
        em.close();
    }

    public void excluirEmprestimo(Emprestimo emprestimo) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        emprestimo = em.merge(emprestimo);
        em.remove(emprestimo);
        em.getTransaction().commit();
        em.close();
    }
}
