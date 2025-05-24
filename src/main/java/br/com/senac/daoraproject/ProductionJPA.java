/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.daoraproject;

/**
 *
 * @author lucas
 */
import jakarta.persistence.*;


@Entity
@Table(name = "producao")


public class ProductionJPA {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    
    @Column(nullable = false)
    private String nomereceita;
    
    @Column(nullable = false)
    private String quantidade;
    
    @Column(nullable = false)
    private String ingredientes;
    
    @Column(nullable = false)
    private String custototal;
    
    @Column (nullable = false)
    private String duracao;

    public ProductionJPA() {
    }

    public ProductionJPA(long id, String nomereceita, String quantidade, String ingredientes, String custototal, String duracao) {
        this.id = id;
        this.nomereceita = nomereceita;
        this.quantidade = quantidade;
        this.ingredientes = ingredientes;
        this.custototal = custototal;
        this.duracao = duracao;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomereceita() {
        return nomereceita;
    }

    public void setNomereceita(String nomereceita) {
        this.nomereceita = nomereceita;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getCustototal() {
        return custototal;
    }

    public void setCustototal(String custototal) {
        this.custototal = custototal;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }
    
    
    
}
