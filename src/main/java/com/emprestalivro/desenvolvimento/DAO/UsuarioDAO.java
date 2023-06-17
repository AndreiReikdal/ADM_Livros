package com.emprestalivro.desenvolvimento.dao;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.emprestalivro.desenvolvimento.models.usuarios.Usuario;

public class UsuarioDAO {
    private EntityManagerFactory emf;

    public UsuarioDAO() {
        emf = Persistence.createEntityManagerFactory("my-persistence-unit");
    }
       
    public void salvarUsuario(Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public Usuario buscarUsuarioPorId(Long id) {
        EntityManager em = emf.createEntityManager();
        Usuario usuario = em.find(Usuario.class, id);
        em.close();
        return usuario;
    }

    @SuppressWarnings("unchecked")
    public List<Usuario> buscarTodasUsuario() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT u FROM Usuario u");
        List<Usuario> usuarios = query.getResultList();
        em.close();
        return usuarios;
    }

    public void atualizarUsuario( Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.merge(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void excluirUsuario( Usuario usuario) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        usuario = em.merge(usuario);
        em.remove(usuario);
        em.getTransaction().commit();
        em.close();
    }

    public void someMethod() {
    }
}
   

