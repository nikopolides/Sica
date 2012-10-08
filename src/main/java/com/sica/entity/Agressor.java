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
public class Agressor {
    
    @Id
    @GeneratedValue
    private long id;
    private long idAbrigada;
    private String nome;
    private String telefone;
    private String sexo;
    private String parentesco;
    private int idade;
    private String escolaridade;
    private String endereco;
    private String estadoCivil;
    private String situacaoSocioeconomica;
    private double salario;
    private String profissao;
    private String desempregado;
    private String antecedentes;
    private String substanciasPsicoativas;
    private String agressivo;
    private String acompanhadoNucleo;
    private String historicoPsiquiatrico;
    private String medicamentoControlado;
    private String observacoes;
    private String religiao;
    private String dataNascimento;
    private String naturalidade;

    public Agressor() {
    }

    public Agressor(long id, long idAbrigada, String nome, String telefone, String sexo, String parentesco, int idade, String escolaridade, String endereco, String estadoCivil, String situacaoSocioeconomica, double salario, String profissao, String desempregado, String antecedentes, String substanciasPsicoativas, String agressivo, String acompanhadoNucleo, String historicoPsiquiatrico, String medicamentoControlado, String observacoes, String religiao, String dataNascimento, String naturalidade) {
        this.id = id;
        this.idAbrigada = idAbrigada;
        this.nome = nome;
        this.telefone = telefone;
        this.sexo = sexo;
        this.parentesco = parentesco;
        this.idade = idade;
        this.escolaridade = escolaridade;
        this.endereco = endereco;
        this.estadoCivil = estadoCivil;
        this.situacaoSocioeconomica = situacaoSocioeconomica;
        this.salario = salario;
        this.profissao = profissao;
        this.desempregado = desempregado;
        this.antecedentes = antecedentes;
        this.substanciasPsicoativas = substanciasPsicoativas;
        this.agressivo = agressivo;
        this.acompanhadoNucleo = acompanhadoNucleo;
        this.historicoPsiquiatrico = historicoPsiquiatrico;
        this.medicamentoControlado = medicamentoControlado;
        this.observacoes = observacoes;
        this.religiao = religiao;
        this.dataNascimento = dataNascimento;
        this.naturalidade = naturalidade;
    }
    
    public String getAcompanhadoNucleo() {
        return acompanhadoNucleo;
    }

    public void setAcompanhadoNucleo(String acompanhadoNucleo) {
        this.acompanhadoNucleo = acompanhadoNucleo;
    }

    public String getAgressivo() {
        return agressivo;
    }

    public void setAgressivo(String agressivo) {
        this.agressivo = agressivo;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getDesempregado() {
        return desempregado;
    }

    public void setDesempregado(String desempregado) {
        this.desempregado = desempregado;
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getHistoricoPsiquiatrico() {
        return historicoPsiquiatrico;
    }

    public void setHistoricoPsiquiatrico(String historicoPsiquiatrico) {
        this.historicoPsiquiatrico = historicoPsiquiatrico;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getIdAbrigada() {
        return idAbrigada;
    }

    public void setIdAbrigada(long idAbrigada) {
        this.idAbrigada = idAbrigada;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMedicamentoControlado() {
        return medicamentoControlado;
    }

    public void setMedicamentoControlado(String medicamentoControlado) {
        this.medicamentoControlado = medicamentoControlado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSituacaoSocioeconomica() {
        return situacaoSocioeconomica;
    }

    public void setSituacaoSocioeconomica(String situacaoSocioeconomica) {
        this.situacaoSocioeconomica = situacaoSocioeconomica;
    }

    public String getSubstanciasPsicoativas() {
        return substanciasPsicoativas;
    }

    public void setSubstanciasPsicoativas(String substanciasPsicoativas) {
        this.substanciasPsicoativas = substanciasPsicoativas;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

     public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getReligiao() {
        return religiao;
    }

    public void setReligiao(String religiao) {
        this.religiao = religiao;
    }

    @Override
    public String toString() {
        return "Agressor{" + "id=" + id + ", idAbrigada=" + idAbrigada + ", nome=" + nome + ", telefone=" + telefone + ", sexo=" + sexo + ", parentesco=" + parentesco + ", idade=" + idade + ", escolaridade=" + escolaridade + ", endereco=" + endereco + ", estadoCivil=" + estadoCivil + ", situacaoSocioeconomica=" + situacaoSocioeconomica + ", salario=" + salario + ", profissao=" + profissao + ", desempregado=" + desempregado + ", antecedentes=" + antecedentes + ", substanciasPsicoativas=" + substanciasPsicoativas + ", agressivo=" + agressivo + ", acompanhadoNucleo=" + acompanhadoNucleo + ", historicoPsiquiatrico=" + historicoPsiquiatrico + ", medicamentoControlado=" + medicamentoControlado + ", observacoes=" + observacoes + ", religiao=" + religiao + ", dataNascimento=" + dataNascimento + ", naturalidade=" + naturalidade + '}';
    }
    
}
