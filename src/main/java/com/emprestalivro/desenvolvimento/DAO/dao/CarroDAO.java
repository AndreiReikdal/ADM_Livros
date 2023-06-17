package com.alexandre.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.alexandre.modelos.Carro;

import java.util.List;

public class CarroDAO {
    private EntityManagerFactory emf;

    public CarroDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }

    public void salvarCarro(Carro carro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(carro);
        em.getTransaction().commit();
        em.close();
    }

    public Carro buscarCarroPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        Carro carro = em.find(Carro.class, id);
        em.close();
        return carro;
    }

    public List<Carro> buscarTodasCarros() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Carro c");
        List<Carro> carros = query.getResultList();
        em.close();
        return carros;
    }

    public void atualizarCarro(Carro carro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(carro);
        em.getTransaction().commit();
        em.close();
    }

    public void excluirCarro(Carro carro) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        carro = em.merge(carro);
        em.remove(carro);
        em.getTransaction().commit();
        em.close();
    }
}
