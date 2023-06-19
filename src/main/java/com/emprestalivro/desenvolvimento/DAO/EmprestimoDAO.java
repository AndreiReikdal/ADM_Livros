

package com.emprestalivro.desenvolvimento.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emprestalivro.desenvolvimento.models.emprestimo.Emprestimo;

public class EmprestimoDAO {
    private static EntityManagerFactory emf;

    public EmprestimoDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public static void salvarEmprestimo(Emprestimo emprestimo) {
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

    @SuppressWarnings("unchecked")
    public static List<Emprestimo> buscarTodosEmprestimos() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT e FROM Emprestimo e");
        List<Emprestimo> emprestimos = query.getResultList();
        em.close();
        return emprestimos;
    }

    public static void atualizarEmprestimo(Emprestimo emprestimo) {
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


