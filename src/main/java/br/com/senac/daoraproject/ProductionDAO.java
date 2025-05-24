/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.daoraproject;

import static br.com.senac.daoraproject.JPAUTIL.getEntityManager;
import jakarta.persistence.EntityManager;
import java.util.List;

/**
 *
 * @author lucas
 */
public class ProductionDAO {
     public void salvar(ProductionJPA p){
         
         EntityManager em = JPAUTIL.getEntityManager();
         try{
             em.getTransaction().begin();
             em.persist(p);
             em.getTransaction().commit();
             
             
         }catch(Exception e){
             em.getTransaction().rollback();
             e.printStackTrace();
             
             
         }finally{
         em.close();
     }
         
         
     }
     
     public List<ProductionJPA> listarTodos(){
         EntityManager em = JPAUTIL.getEntityManager();
         List<ProductionJPA> pjj = null;
         try{
             
             pjj = em.createQuery("SELECT p FROM ProductionJPA p", ProductionJPA.class).getResultList();
             
         }catch(Exception e){
         e.printStackTrace();
         }finally{
             em.close();
         }
         return pjj;
     }
     
     
     public boolean deletar(int id){
              try{
                  
                   EntityManager em = getEntityManager();

                  em.getTransaction().begin();
                  ProductionJPA cadastro = em.find(ProductionJPA.class, id);
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
}
