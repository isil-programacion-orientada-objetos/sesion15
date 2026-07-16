package com.lideratec;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class PilotosService {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("miUnidadPersistencias");

    public void mostrarPilotos(){
        EntityManager em = emf.createEntityManager();

        List<Pilotos> lista = em.createQuery(
                "SELECT a FROM Pilotos a", Pilotos.class
        ).getResultList();

        for (Pilotos a: lista){
            System.out.println("ID: " + a.getId() + " Nombre: " + a.getNombre() + " escuderia " + a.getEscuderia());
        }

        em.close();
    }
}
