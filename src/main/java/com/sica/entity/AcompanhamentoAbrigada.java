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
 * @author Winstein
 */

@Entity
@Component
public class AcompanhamentoAbrigada {
    
    @Id
    @GeneratedValue
    private long id;
    private long idAbrigada;
    private String dataRegistro;
    private String relato;

    public AcompanhamentoAbrigada() {
    }

    public AcompanhamentoAbrigada(long id, long idAbrigada, String dataRegistro, String relato) {
        this.id = id;
        this.idAbrigada = idAbrigada;
        this.dataRegistro = dataRegistro;
        this.relato = relato;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
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

    public String getRelato() {
        return relato;
    }

    public void setRelato(String relato) {
        this.relato = relato;
    }

    @Override
    public String toString() {
        return "AcompanhamentoAbrigada{" + "id=" + id + ", idAbrigada=" + idAbrigada + ", dataRegistro=" + dataRegistro + ", relato=" + relato + '}';
    }
}
