package com.biblioteca.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.biblioteca.modelos.Livro;

import java.util.List;

public class LivroDAO {
    private EntityManagerFactory emf;

    public LivroDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void salvarLivro(Livro livro) {
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
    Livro livroEncontrado = em.find(Livro.class, livro.getId());
    if(livroEncontrado != null) {
        em.remove(em.merge(livro));
    }
    em.getTransaction().commit();
    em.close();
}
}
