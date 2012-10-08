/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sica.entity;

import br.com.caelum.vraptor.ioc.Component;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author sica
 */
@Entity
@Component
public class AbrigadaServicoSocial {

    @Id
    @GeneratedValue
    private long id;
    private long idAbrigada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar dataAdmissao;
    private String reincidencia;
    private int tempoNoDF;
    private String estadoCivilEnum;
    private String etniaEnum;
    private String religiaoEnum;
    private String outrosCursos;
    private String documentos;
    private boolean empregadaVinculo;
    private double salario;
    private String profissao;
    private String desempregadaHa;
    private int aposentadoria;
    private int pensaoAlimenticia;
    private int beneficiariaBPC;
    
    
    public AbrigadaServicoSocial() {
    }

    public AbrigadaServicoSocial(String estadoCivilEnum, String etniaEnum, String religiaoEnum, long id, long idAbrigada, Calendar dataAdmissao, String reincidencia, int tempoNoDF, String religiao, String etnia, String outrosCursos, String documentos, boolean empregadaVinculo, double salario, String profissao, String desempregadaHa, int aposentadoria, int pensaoAlimenticia, int beneficiariaBPC) {
        this.id = id;
        this.idAbrigada = idAbrigada;
        this.dataAdmissao = dataAdmissao;
        this.reincidencia = reincidencia;
        this.tempoNoDF = tempoNoDF;
        this.religiaoEnum = religiao;
        this.etniaEnum = etnia;
        this.outrosCursos = outrosCursos;
        this.documentos = documentos;
        this.empregadaVinculo = empregadaVinculo;
        this.salario = salario;
        this.profissao = profissao;
        this.desempregadaHa = desempregadaHa;
        this.aposentadoria = aposentadoria;
        this.pensaoAlimenticia = pensaoAlimenticia;
        this.beneficiariaBPC = beneficiariaBPC;
    }

    public String getEstadoCivilEnum() {
        return estadoCivilEnum;
    }

    public void setEstadoCivilEnum(String estadoCivilEnum) {
        this.estadoCivilEnum = estadoCivilEnum;
    }

    public String getEtniaEnum() {
        return etniaEnum;
    }

    public void setEtniaEnum(String etniaEnum) {
        this.etniaEnum = etniaEnum;
    }

    public String getReligiaoEnum() {
        return religiaoEnum;
    }

    public void setReligiaoEnum(String religiaoEnum) {
        this.religiaoEnum = religiaoEnum;
    }

    public int getAposentadoria() {
        return aposentadoria;
    }

    public void setAposentadoria(int aposentadoria) {
        this.aposentadoria = aposentadoria;
    }

    public int getBeneficiariaBPC() {
        return beneficiariaBPC;
    }

    public void setBeneficiariaBPC(int beneficiariaBPC) {
        this.beneficiariaBPC = beneficiariaBPC;
    }

    public Calendar getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Calendar dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getDesempregadaHa() {
        return desempregadaHa;
    }

    public void setDesempregadaHa(String desempregadaHa) {
        this.desempregadaHa = desempregadaHa;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
    }

    public boolean isEmpregadaVinculo() {
        return empregadaVinculo;
    }

    public void setEmpregadaVinculo(boolean empregadaVinculo) {
        this.empregadaVinculo = empregadaVinculo;
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

    public String getOutrosCursos() {
        return outrosCursos;
    }

    public void setOutrosCursos(String outrosCursos) {
        this.outrosCursos = outrosCursos;
    }

    public int getPensaoAlimenticia() {
        return pensaoAlimenticia;
    }

    public void setPensaoAlimenticia(int pensaoAlimenticia) {
        this.pensaoAlimenticia = pensaoAlimenticia;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getReincidencia() {
        return reincidencia;
    }

    public void setReincidencia(String reincidencia) {
        this.reincidencia = reincidencia;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoNoDF() {
        return tempoNoDF;
    }

    public void setTempoNoDF(int tempoNoDF) {
        this.tempoNoDF = tempoNoDF;
    }

    @Override
    public String toString() {
        return "AbrigadaServicoSocial{" + "id=" + id + ", idAbrigada=" + idAbrigada + ", dataAdmissao=" + dataAdmissao + ", reincidencia=" + reincidencia + ", tempoNoDF=" + tempoNoDF + ", religiao=" + religiaoEnum + ", etnia=" + etniaEnum + ", outrosCursos=" + outrosCursos + ", documentos=" + documentos + ", empregadaVinculo=" + empregadaVinculo + ", salario=" + salario + ", profissao=" + profissao + ", desempregadaHa=" + desempregadaHa + ", aposentadoria=" + aposentadoria + ", pensaoAlimenticia=" + pensaoAlimenticia + ", beneficiariaBPC=" + beneficiariaBPC + '}';
    }
}
    
