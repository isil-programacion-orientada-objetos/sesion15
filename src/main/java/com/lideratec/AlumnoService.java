package com.lideratec;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class AlumnoService {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("miUnidadPersistencia");

    public void mostrarAlumnos() {
        EntityManager em = emf.createEntityManager();

        List<Alumno> lista = em.createQuery(
                "SELECT a FROM Alumno a",
                Alumno.class
        ).getResultList();

        for (Alumno a : lista) {
            System.out.println("ID: " + a.getId() +
                    ", Nombre: " + a.getNombre());
        }

        em.close();
    }
}
