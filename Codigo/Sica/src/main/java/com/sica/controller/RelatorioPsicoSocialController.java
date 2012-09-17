/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.caelum.vraptor.validator.Validations;
import com.sica.dao.RelatorioPsicoSocialDAO;
import com.sica.entity.RelatorioPsicoSocial;
import java.util.List;

/**
 *
 * @author athos
 */
@Resource
public class RelatorioPsicoSocialController {
    
    private RelatorioPsicoSocialDAO dao;
    private Result result;
    private Validator validator;

    public RelatorioPsicoSocialController(RelatorioPsicoSocialDAO dao, Result result, Validator validator) {
        this.dao = dao;
        this.result = result;
        this.validator = validator;
    }
    
    
    
}
