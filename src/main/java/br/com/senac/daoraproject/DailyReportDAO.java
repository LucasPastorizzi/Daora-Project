/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.daoraproject;
import jakarta.persistence.EntityManager;
/**
 *
 * @author lucas
 */
public class DailyReportDAO {
    
    public void salvardaily(DailyReportJPA dl) {
        EntityManager em = JPAUTIL.getEntityManager();
        try{
            
            em.getTransaction().begin();
            em.persist(dl);
            em.getTransaction().commit();
            
        }catch(Exception e){
            em.getTransaction().rollback();
            e.printStackTrace();
        }finally{
            em.close();
        }
        
    }
}
