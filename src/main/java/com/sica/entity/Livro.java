/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import com.sun.xml.internal.bind.v2.model.core.ID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author leonn
 */
@Entity
@Component
public class Livro {

    @Id
    @GeneratedValue
    private long id;
    private String editora;
    private String titulo;
    private String autor;
    private String publicacao;
    
    
    public Livro(long id, String editora, String titulo, String autor, String publicacao) {
        this.id = id;
        this.editora = editora;
        this.titulo = titulo;
        this.autor = autor;
        this.publicacao = publicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(String publicacao) {
        this.publicacao = publicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", editora=" + editora + ", titulo=" + titulo + ", autor=" + autor + ", publicacao=" + publicacao + '}';
    }
    
    
  
    
    
}
