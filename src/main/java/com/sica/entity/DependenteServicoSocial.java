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
 * @author Bryan
 */
@Entity
@Component
public class DependenteServicoSocial {
    @Id
    @GeneratedValue
    private long id;
    private long idAbrigada;
    private String naoAbrigamento;
    private boolean sexoMascTreze;
    private boolean naoCorreRisco;
    private String documentos;
    private String estadoCivilEnum;
    private String etniaEnum;
    private String moradiaEnum;
    private String religiaoEnum;
    private boolean recebeAuxilio;
    private String qualPorqueNao;
    private String cras;
    private String creas;
    private String conselhoTutelar;
    private String varaInfancia;
    private String outraInstituicao;

    public DependenteServicoSocial() {
    }

    public DependenteServicoSocial( String estadoCivilEnum, String etniaEnum, String moradiaEnum, String religiaoEnum, long id, long idAbrigada, String naoAbrigamento, boolean sexoMascTreze, boolean naoCorreRisco, String documentos, boolean recebeAuxilio, String qualPorqueNao, String cras, String creas, String conselhoTutelar, String varaInfancia, String outraInstituicao) {
        this.id = id;
        this.estadoCivilEnum = estadoCivilEnum;
        this.etniaEnum = etniaEnum;
        this.moradiaEnum = moradiaEnum;
        this.religiaoEnum = religiaoEnum;
        this.idAbrigada = idAbrigada;
        this.naoAbrigamento = naoAbrigamento;
        this.sexoMascTreze = sexoMascTreze;
        this.naoCorreRisco = naoCorreRisco;
        this.documentos = documentos;
        this.recebeAuxilio = recebeAuxilio;
        this.qualPorqueNao = qualPorqueNao;
        this.cras = cras;
        this.creas = creas;
        this.conselhoTutelar = conselhoTutelar;
        this.varaInfancia = varaInfancia;
        this.outraInstituicao = outraInstituicao;
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

    public String getMoradiaEnum() {
        return moradiaEnum;
    }

    public void setMoradiaEnum(String moradiaEnum) {
        this.moradiaEnum = moradiaEnum;
    }

    public String getReligiaoEnum() {
        return religiaoEnum;
    }

    public void setReligiaoEnum(String religiaoEnum) {
        this.religiaoEnum = religiaoEnum;
    }

    public String getConselhoTutelar() {
        return conselhoTutelar;
    }

    public void setConselhoTutelar(String conselhoTutelar) {
        this.conselhoTutelar = conselhoTutelar;
    }

    public String getCras() {
        return cras;
    }

    public void setCras(String cras) {
        this.cras = cras;
    }

    public String getCreas() {
        return creas;
    }

    public void setCreas(String creas) {
        this.creas = creas;
    }

    public String getDocumentos() {
        return documentos;
    }

    public void setDocumentos(String documentos) {
        this.documentos = documentos;
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

    public String getNaoAbrigamento() {
        return naoAbrigamento;
    }

    public void setNaoAbrigamento(String naoAbrigamento) {
        this.naoAbrigamento = naoAbrigamento;
    }

    public boolean isNaoCorreRisco() {
        return naoCorreRisco;
    }

    public void setNaoCorreRisco(boolean naoCorreRisco) {
        this.naoCorreRisco = naoCorreRisco;
    }

    public String getOutraInstituicao() {
        return outraInstituicao;
    }

    public void setOutraInstituicao(String outraInstituicao) {
        this.outraInstituicao = outraInstituicao;
    }

    public String getQualPorqueNao() {
        return qualPorqueNao;
    }

    public void setQualPorqueNao(String qualPorqueNao) {
        this.qualPorqueNao = qualPorqueNao;
    }

    public boolean isRecebeAuxilio() {
        return recebeAuxilio;
    }

    public void setRecebeAuxilio(boolean recebeAuxilio) {
        this.recebeAuxilio = recebeAuxilio;
    }

    public boolean isSexoMascTreze() {
        return sexoMascTreze;
    }

    public void setSexoMascTreze(boolean sexoMascTreze) {
        this.sexoMascTreze = sexoMascTreze;
    }

    public String getVaraInfancia() {
        return varaInfancia;
    }

    public void setVaraInfancia(String varaInfancia) {
        this.varaInfancia = varaInfancia;
    }

    @Override
    public String toString() {
        return "DependenteServicoSocial{" + "id=" + id + ", idAbrigada=" + idAbrigada + ", naoAbrigamento=" + naoAbrigamento + ", sexoMascTreze=" + sexoMascTreze + ", naoCorreRisco=" + naoCorreRisco + ", documentos=" + documentos + ", recebeAuxilio=" + recebeAuxilio + ", qualPorqueNao=" + qualPorqueNao + ", cras=" + cras + ", creas=" + creas + ", conselhoTutelar=" + conselhoTutelar + ", varaInfancia=" + varaInfancia + ", outraInstituicao=" + outraInstituicao + '}';
    }
    
}
