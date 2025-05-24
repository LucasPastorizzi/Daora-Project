/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.daoraproject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Marca a classe como uma entidade JPA
public class cadastro {

    @Id // Marca o campo 'id' como chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Define a estratégia de geração do ID (ajuste conforme seu DB)
    private Integer id;
    private String login;
    private String senha;
    private String tipo;

    // Construtor vazio
    public cadastro() {
    }

    // Construtor com parâmetros
    public cadastro(String login, String senha, String tipo) {
        this.login = login;
        this.senha = senha;
        this.tipo = tipo;
    }

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // //Método para obter uma representação em String do objeto
    @Override
    public String toString() {
        return "Usuario{"
                + "id=" + id
                + ", login='" + login + '\''
                + ", senha='" + senha + '\''
                + ", tipo='" + tipo + '\''
                + '}';
    }
}
