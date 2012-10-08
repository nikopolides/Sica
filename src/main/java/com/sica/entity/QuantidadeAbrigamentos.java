/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Victor Hugo
 */
@Entity
@Component
public class QuantidadeAbrigamentos {
    
    @Id
    @GeneratedValue
    private long id;
    private String dataEntrada;
    private String dataSaida;
    private String observacoes;
    private long idAbrigada;
    
    public QuantidadeAbrigamentos() {
    }

    public QuantidadeAbrigamentos(long id, String dataEntrada, String dataSaida, String observacoes, long idAbrigada) {
        this.id = id;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.observacoes = observacoes;
        this.idAbrigada = idAbrigada;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAbrigada() {
        return idAbrigada;
    }

    public void setIdAbrigada(long idAbrigada) {
        this.idAbrigada = idAbrigada;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    @Override
    public String toString() {
        return "QuantidadeAbrigamentos{" + "id=" + id + ", dataEntrada=" + dataEntrada + ", dataSaida=" + dataSaida + ", observacoes=" + observacoes + ", idAbrigada=" + idAbrigada + '}';
    }
}
