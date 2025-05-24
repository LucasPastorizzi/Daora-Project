/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.daoraproject;

import static br.com.senac.daoraproject.JPAUTIL.getEntityManager;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TemporalType;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lucas
 */
public class CadastroDAO {
 
    
    
        public void salvar(CadastroJPA c){
         
         EntityManager em = JPAUTIL.getEntityManager();
         try{
             em.getTransaction().begin();
             em.persist(c);
             em.getTransaction().commit();
             
             
         }catch(Exception e){
             em.getTransaction().rollback();
             e.printStackTrace();
             
             
         }finally{
         em.close();
     }
         
         
     }
        
          public List<CadastroJPA> listarTodos(){
         EntityManager em = JPAUTIL.getEntityManager();
         List<CadastroJPA> cjj = null;
         try{
             
             cjj = em.createQuery("SELECT p FROM CadastroJPA p", CadastroJPA.class).getResultList();
             
         }catch(Exception e){
         e.printStackTrace();
         }finally{
             em.close();
         }
         return cjj;
     }
          
          
          public boolean deletar(int id){
              try{
                  
                   EntityManager em = getEntityManager();

                  em.getTransaction().begin();
                  CadastroJPA cadastro = em.find(CadastroJPA.class, id);
                  if(cadastro != null){
                      em.remove(cadastro);
                      em.getTransaction().commit();
                      
                      return true;
                      
                  }else{
                      em.getTransaction().rollback();
                      return false;
                  }
              }catch (Exception e){
                  e.printStackTrace();
                  return false;
              }
              
          }
          public List<CadastroJPA> buscarPorIntervalo(Date inicio, Date fim) {
    EntityManager em = getEntityManager();

    try {
        return em.createQuery("SELECT c FROM CadastroJPA c WHERE c.data BETWEEN :inicio AND :fim", CadastroJPA.class)
                 .setParameter("inicio", inicio, TemporalType.DATE)
                 .setParameter("fim", fim, TemporalType.DATE)
                 .getResultList();
    } finally {
        em.close();
    }
}

}
