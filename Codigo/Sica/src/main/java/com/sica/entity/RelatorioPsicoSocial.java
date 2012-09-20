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
 * @author athos
 */
@Entity
@Component
public class RelatorioPsicoSocial {
    @Id
    @GeneratedValue
    private long id;
    //@Text => String descricao nao pode ser char(255) (?)
    private String descricao;
    private long idAbrigada;
    boolean ativo;

        public RelatorioPsicoSocial() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
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

    @Override
    public String toString() {
        return "RelatorioPsicoSocial{" + "id=" + id + ", descricao=" + descricao + ", idAbrigada=" + idAbrigada + '}';
    }
    
    
    
    
}
