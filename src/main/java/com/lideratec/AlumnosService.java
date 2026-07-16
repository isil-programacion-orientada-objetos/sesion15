package com.lideratec;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AlumnosService {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public void mostrarAlumnos(){
        EntityManager em = emf.createEntityManager();

        List<Alumnos> lista = em.createQuery(
                "SELECT a FROM Alumnos a", Alumnos.class
        ).getResultList();

        for (Alumnos a: lista){
            System.out.println("ID: " + a.getId() + " Nombre: " + a.getNombre());
        }

        em.close();
    }
}
