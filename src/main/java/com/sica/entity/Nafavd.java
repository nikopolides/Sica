
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Matheus Fonseca
 */
@Entity
@Component
public class Nafavd {
    
    @Id
    @GeneratedValue
    private long id;
    private String cidade;
    private String estado;
    
    public Nafavd() {
    }

    public Nafavd(long id, String cidade, String estado) {
        this.id = id;
        this.cidade = cidade;
        this.estado = estado;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "NAFAVD{" + "id=" + id + ", cidade=" + cidade + ", estado=" + estado + '}';
    }
}