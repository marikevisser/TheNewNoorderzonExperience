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
}
