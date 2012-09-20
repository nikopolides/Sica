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
 * @author sica
 */

@Entity
@Component
public class DiarioAcompanhamento {
    
    
    @Id
    @GeneratedValue
    private long id;
    private String relatorio;
    private String data;

    public DiarioAcompanhamento() {
    }

    public DiarioAcompanhamento(long id, String relatorio, String data){
        this.id=id;
        this.relatorio=relatorio;
        this.data=data;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPsicologa() {
        return psicologa;
    }

    public void setPsicologa(String psicologa) {
        this.psicologa = psicologa;
    }

    public String getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }
    private String psicologa;
    
}
