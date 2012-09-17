/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.dao;

import br.com.caelum.vraptor.ioc.Component;
import com.sica.entity.Abrigada;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author athos
 */
@Component
public class RelatorioPsicoSocialDAO {
    private EntityManager manager;
    
    public RelatorioPsicoSocialDAO(EntityManager manager){
        this.manager = manager;
    }
    
    
}
