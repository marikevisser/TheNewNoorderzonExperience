package src.main.controller;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Database implements AutoCloseable {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("nl.itacademy.zuul");

    public void close() {
        emf.close();
    }

    /**
     * Create a new player object for the initial state of the game.
     */
    public Player createPlayer() {
        EntityManager em = emf.createEntityManager();
        try {
            Room room = em.createQuery("SELECT r FROM Room r ORDER BY id", Room.class).setMaxResults(1).getSingleResult();
            return new Player(room);
        } finally {
            em.close();
        }
    }
    /**
     * hier moet de artiest opgehaald worden uit het webformulier
     * daarna moeten de voorstellingen met die artiest worden teruggegeven aan de front-end
     * mv
     */
    public Voorstelling zoekVoorstellingOpArtiest(NaamVanArtiest) {
        String NaamVanArtiest = reader.getInputVanFormulierOfzo() // hoe komen we aan die input?
        TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v WHERE v.artiest CONTAINS :naamvanartiest",
                Voorstelling.class);
        q.setParameter("naamvanartiest", NaamVanArtiest)
        for (Voorstelling v : q.getResultList()) {
            return v.getDetails(); // uitzoeken hoe die methode heet
            // moet ik ook iets doen met catch en try en finally en close?
        }
    }
    /**
     * hier moet de naam van de voorstelling opgehaald worden uit het webformulier
     * daarna moeten de voorstellingen met die naam worden teruggegeven aan de front-end
     * mv
     */
    public Voorstelling zoekVoorstellingOpNaam(DeelVanNaam) {
        String DeelVanNaam = reader.getInputVanFormulierOfzo // hoe komen we aan die input?
        TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v WHERE v.name CONTAINS :deelvannaam", Voorstelling.class);
        q.setParameter("deelvannaam", DeelVanNaam)
        for (Voorstelling v : q.getResultList()) {
            return v.getDetails(); // uitzoeken hoe die methode heet
        } // moet ik ook iets doen met catch en try en finally en close?
    }
    /**
     * hier moet het genre van de voorstelling opgehaald worden uit het webformulier
     * daarna moeten de voorstellingen in dat genre worden teruggegeven aan de front-end
     * mv
     */
    public Voorstelling zoekVoorstellingOpGenre(Genre) {
        String Genre = reader.getInputVanFormulierOfzo // hoe komen we aan die input?
        TypedQuery<Voorstelling> q = em.createQuery(
                "SELECT v FROM Voorstelling v WHERE v.genre = :genre", Voorstelling.class);
        q.setParameter("genre", Genre)
        for (Voorstelling v : q.getResultList()) {
            return v.getDetails(); // uitzoeken hoe die methode heet
        }// moet ik ook iets doen met catch en try en finally en close?
    }
}
