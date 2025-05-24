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
import java.time.LocalDate;

@Entity
@Table(name = "report")

public class DailyReportJPA {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(nullable = false)
    private String atividade;
    
    @Column(nullable = false)
    private String tempo;
    
    @Column(nullable = false)
    private String produtosrelacionados;
    
    @Column(nullable = false)
    private String data;
    
    @Column (nullable = false)
    private String produtividade;
    
    @Column (nullable = false)
    private String empresa;
    
    @Column (nullable = false)
    private String descricao;

    public DailyReportJPA() {
    }

    public DailyReportJPA(long id, String atividade, String tempo, String produtosrelacionados, String data, String produtividade, String empresa, String descricao) {
        this.id = id;
        this.atividade = atividade;
        this.tempo = tempo;
        this.produtosrelacionados = produtosrelacionados;
        this.data = data;
        this.produtividade = produtividade;
        this.empresa = empresa;
        this.descricao = descricao;
    }

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getProdutosrelacionados() {
        return produtosrelacionados;
    }

    public void setProdutosrelacionados(String produtosrelac) {
        this.produtosrelacionados = produtosrelac;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getProdutividade() {
        return produtividade;
    }

    public void setProdutividade(String produtividade) {
        this.produtividade = produtividade;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    
    
}
