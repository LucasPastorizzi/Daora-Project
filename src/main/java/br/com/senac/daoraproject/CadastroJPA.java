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
import java.util.Date;


 @Entity
@Table(name = "fornecedores")
 
public class CadastroJPA {
    
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
 
 @Column(nullable = false)
    private String nomefornecedor;
 
 @Column(nullable = false)
 private String cnpj;
 
 @Column(nullable = false)
 private String produto;
 
 @Column(nullable = false)
 private Date data;
 
 @Column (nullable = false)
 private int quantidade;
 
 @Column(nullable = false)
 private String uf;

    public CadastroJPA() {
    }

    public CadastroJPA(long id, String nomefornecedor, String cnpj, String produto, Date data, int quantidade, String uf) {
        this.id = id;
        this.nomefornecedor = nomefornecedor;
        this.cnpj = cnpj;
        this.produto = produto;
        this.data = data;
        this.quantidade = quantidade;
        this.uf = uf;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomefornecedor() {
        return nomefornecedor;
    }

    public void setNomefornecedor(String nomefornecedor) {
        this.nomefornecedor = nomefornecedor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
 
  
    
    
    
}
