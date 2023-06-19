
package com.emprestalivro.desenvolvimento.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.emprestalivro.desenvolvimento.models.livro.Livro;

public class LivroDAO {
    private static EntityManagerFactory emf;

    public LivroDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public static void salvarLivro(Livro livro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(livro);
        em.getTransaction().commit();
        em.close();
    }

    public Livro buscarLivroPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        Livro livro = em.find(Livro.class, id);
        em.close();
        return livro;
    }

    @SuppressWarnings("unchecked")
    public List<Livro> buscarTodosLivros() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT l FROM Livro l");
        List<Livro> livros = query.getResultList();
        em.close();
        return livros;
    }

    public void atualizarLivro(Livro livro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(livro);
        em.getTransaction().commit();
        em.close();
    }

    public void excluirLivro(Livro livro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        livro = em.merge(livro);
        em.remove(livro);
        em.getTransaction().commit();
        em.close();
    }
}
