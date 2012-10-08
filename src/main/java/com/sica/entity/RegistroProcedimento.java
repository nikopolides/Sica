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
 * @author bryan
 */
@Entity
@Component
public class RegistroProcedimento {
    @Id
    @GeneratedValue
    private long id;
    //@Text => String procedimentos nao pode ser char(255) (?)
    private String nomeAssistenteSocial;
    private String procedimentos;
    private String observacaoDesligamento;
    private long idAbrigada;
    private String data;
    private Boolean ativo;

    public RegistroProcedimento() {   }

    public RegistroProcedimento(long id, String nomeAssistenteSocial, String procedimentos, String observacaoDesligamento, long idAbrigada, String data, Boolean ativo) {
        this.id = id;
        this.nomeAssistenteSocial = nomeAssistenteSocial;
        this.procedimentos = procedimentos;
        this.observacaoDesligamento = observacaoDesligamento;
        this.idAbrigada = idAbrigada;
        this.data = data;
        this.ativo = ativo;
    }

    public String getNomeAssistenteSocial() {
        return nomeAssistenteSocial;
    }

    public void setNomeAssistenteSocial(String nomeAssistenteSocial) {
        this.nomeAssistenteSocial = nomeAssistenteSocial;
    }

    public String getObservacaoDesligamento() {
        return observacaoDesligamento;
    }

    public void setObservacaoDesligamento(String observacaoDesligamento) {
        this.observacaoDesligamento = observacaoDesligamento;
    }

    public String getProcedimentos() {
        return procedimentos;
    }

    public void setProcedimentos(String procedimentos) {
        this.procedimentos = procedimentos;
    }
    
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RegistroProcedimento{" + "id=" + id + ", nomeAssistenteSocial=" + nomeAssistenteSocial + ", procedimentos=" + procedimentos + ", observacaoDesligamento=" + observacaoDesligamento + ", idAbrigada=" + idAbrigada + ", data=" + data + ", ativo=" + ativo + '}';
    }
    
}
