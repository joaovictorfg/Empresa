/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa.controller;

import empresa.model.ClientesEnderecosDAO;

/**
 *
 * @author L
 */
public class ClientesEnderecos {
    private String logradouro;    
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;
    
    private int pk_endereco;
    private int fk_cliente;

    public ClientesEnderecos(String logradouro, String bairro, String cidade, String estado, String pais, String cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public ClientesEnderecos(String logradouro, String bairro, String cidade, String estado, String pais, String cep, int pk_endereco, int fk_cliente) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.pk_endereco = pk_endereco;
        this.fk_cliente = fk_cliente;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getPk_endereco() {
        return pk_endereco;
    }

    public void setPk_endereco(int pk_endereco) {
        this.pk_endereco = pk_endereco;
    }

    public int getFk_cliente() {
        return fk_cliente;
    }

    public void setFk_cliente(int fk_cliente) {
        this.fk_cliente = fk_cliente;
    }

    public void save(){
        ClientesEnderecosDAO.create(this);
    }
    
}
