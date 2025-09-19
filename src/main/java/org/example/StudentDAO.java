package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentDAO {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("em");

    public void createStudent(Student student) {
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            em.getTransaction().rollback();
        }
    }

    public Student findStudent(long id) {
        EntityManager em = emf.createEntityManager();
        Student student = null;
        try {
            student = em.find(Student.class, id);
            em.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return student;
    }

    public void updateStudet(Student student) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(student);
            em.getTransaction().commit();
            em.close();
        } catch (Exception e) {
            System.out.println(e);
        }


    }


}
