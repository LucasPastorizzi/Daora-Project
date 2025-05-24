
package br.com.senac.daoraproject;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class JPAUTIL {
     private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("daora-PU");
     public static EntityManager getEntityManager(){
         return emf.createEntityManager();
     }
}
