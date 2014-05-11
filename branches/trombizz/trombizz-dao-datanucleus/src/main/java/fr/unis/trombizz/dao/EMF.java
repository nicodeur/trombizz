package fr.unis.trombizz.dao;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EMF {
    private static EntityManagerFactory emfInstance = Persistence.createEntityManagerFactory("transactions-optional");;


    public static EntityManagerFactory get() {
        return emfInstance;
    }
}