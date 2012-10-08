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
 * @author Paulo
 */
@Entity
@Component
public class AbrigadaPsicologia {
    
    @Id
    @GeneratedValue
    private long id;
    private String emCasoDeNaoAbrigamento;
    private String parenteNome;
    private String parenteEndereco;
    private String parenteTelefone;
    private String sexoMasculinoAcima;
    private String naoCorreRisco;
    private String outrosAbrigamento;
    private String demaisMembrosDaFamilia;
    private String laqueaduraTubaria;    
    private String gestante;
    private String simOnde;
    private String naoPorque;
    private String contracepcaoOralInjetavel;
    private String diu;
    private String naoFazUsoDeContracepcao;
    private String visual;
    private String auditivaFala;
    private String fisica;
    private String mental;
    private String historicoAcompanhamentoMental;
    private String outra;
    private String drogasLicitasIlicitas;
    private String simQuais;
    private String comQueFrequencia;
    private String possuiAlgumaDoenca;
    private String cronica;
    private String outrasQuais;
    private String possuiAlergias;
    private String medicamentos;
    private String outrosAlergia;
    private String medicacoesControladas;
    private String simQuaisMedicacoes;
    private String substanciasPsicoativas;
    private String simQuaisPsicoativas;
    private String agressivoFilhos;
    private String agressivoFamiliares;
    private String agressivoOutros;
    private String estaSendoAcompanhadoEmNucleoCramOutro;
    private String temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado;
    private String simEspecificar;
    private String encaminhamentosObservacoes;
    private long idAbrigada;

    public AbrigadaPsicologia() {
    }

    
    public AbrigadaPsicologia(long id, String emCasoDeNaoAbrigamento, String parenteNome, String parenteEndereco, String parenteTelefone, String sexoMasculinoAcima, String naoCorreRisco, String outrosAbrigamento, String demaisMembrosDaFamilia, String laqueaduraTubaria, String gestante, String simOnde, String naoPorque, String contracepcaoOralInjetavel, String diu, String naoFazUsoDeContracepcao, String visual, String auditivaFala, String fisica, String mental, String historicoAcompanhamentoMental, String outra, String drogasLicitasIlicitas, String simQuais, String comQueFrequencia, String possuiAlgumaDoenca, String cronica, String outrasQuais, String possuiAlergias, String medicamentos, String outrosAlergia, String medicacoesControladas, String simQuaisMedicacoes, String substanciasPsicoativas, String simQuaisPsicoativas, String agressivoFilhos, String agressivoFamiliares, String agressivoOutros, String estaSendoAcompanhadoEmNucleoCramOutro, String temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado, String simEspecificar, String encaminhamentosObservacoes, long idAbrigada) {
        this.id = id;
        this.emCasoDeNaoAbrigamento = emCasoDeNaoAbrigamento;
        this.parenteNome = parenteNome;
        this.parenteEndereco = parenteEndereco;
        this.parenteTelefone = parenteTelefone;
        this.sexoMasculinoAcima = sexoMasculinoAcima;
        this.naoCorreRisco = naoCorreRisco;
        this.outrosAbrigamento = outrosAbrigamento;
        this.demaisMembrosDaFamilia = demaisMembrosDaFamilia;
        this.laqueaduraTubaria = laqueaduraTubaria;
        this.gestante = gestante;
        this.simOnde = simOnde;
        this.naoPorque = naoPorque;
        this.contracepcaoOralInjetavel = contracepcaoOralInjetavel;
        this.diu = diu;
        this.naoFazUsoDeContracepcao = naoFazUsoDeContracepcao;
        this.visual = visual;
        this.auditivaFala = auditivaFala;
        this.fisica = fisica;
        this.mental = mental;
        this.historicoAcompanhamentoMental = historicoAcompanhamentoMental;
        this.outra = outra;
        this.drogasLicitasIlicitas = drogasLicitasIlicitas;
        this.simQuais = simQuais;
        this.comQueFrequencia = comQueFrequencia;
        this.possuiAlgumaDoenca = possuiAlgumaDoenca;
        this.cronica = cronica;
        this.outrasQuais = outrasQuais;
        this.possuiAlergias = possuiAlergias;
        this.medicamentos = medicamentos;
        this.outrosAlergia = outrosAlergia;
        this.medicacoesControladas = medicacoesControladas;
        this.simQuaisMedicacoes = simQuaisMedicacoes;
        this.substanciasPsicoativas = substanciasPsicoativas;
        this.simQuaisPsicoativas = simQuaisPsicoativas;
        this.agressivoFilhos = agressivoFilhos;
        this.agressivoFamiliares = agressivoFamiliares;
        this.agressivoOutros = agressivoOutros;
        this.estaSendoAcompanhadoEmNucleoCramOutro = estaSendoAcompanhadoEmNucleoCramOutro;
        this.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado = temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado;
        this.simEspecificar = simEspecificar;
        this.encaminhamentosObservacoes = encaminhamentosObservacoes;
        this.idAbrigada = idAbrigada;
    }

    public String getParenteTelefone() {
        return parenteTelefone;
    }

    public void setParenteTelefone(String parenteTelefone) {
        this.parenteTelefone = parenteTelefone;
    }

    public String getDiu() {
        return diu;
    }

    public void setDiu(String diu) {
        this.diu = diu;
    }

    public String getAgressivoFamiliares() {
        return agressivoFamiliares;
    }

    public void setAgressivoFamiliares(String agressivoFamiliares) {
        this.agressivoFamiliares = agressivoFamiliares;
    }

    public String getAgressivoFilhos() {
        return agressivoFilhos;
    }

    public void setAgressivoFilhos(String agressivoFilhos) {
        this.agressivoFilhos = agressivoFilhos;
    }

    public String getAgressivoOutros() {
        return agressivoOutros;
    }

    public void setAgressivoOutros(String agressivoOutros) {
        this.agressivoOutros = agressivoOutros;
    }

    public String getAuditivaFala() {
        return auditivaFala;
    }

    public void setAuditivaFala(String auditivaFala) {
        this.auditivaFala = auditivaFala;
    }

    public String getComQueFrequencia() {
        return comQueFrequencia;
    }

    public void setComQueFrequencia(String comQueFrequencia) {
        this.comQueFrequencia = comQueFrequencia;
    }

    public String getContracepcaoOralInjetavel() {
        return contracepcaoOralInjetavel;
    }

    public void setContracepcaoOralInjetavel(String contracepcaoOralInjetavel) {
        this.contracepcaoOralInjetavel = contracepcaoOralInjetavel;
    }

    public String getCronica() {
        return cronica;
    }

    public void setCronica(String cronica) {
        this.cronica = cronica;
    }

    public String getDemaisMembrosDaFamilia() {
        return demaisMembrosDaFamilia;
    }

    public void setDemaisMembrosDaFamilia(String demaisMembrosDaFamilia) {
        this.demaisMembrosDaFamilia = demaisMembrosDaFamilia;
    }

    public String getDrogasLicitasIlicitas() {
        return drogasLicitasIlicitas;
    }

    public void setDrogasLicitasIlicitas(String drogasLicitasIlicitas) {
        this.drogasLicitasIlicitas = drogasLicitasIlicitas;
    }

    public String getEmCasoDeNaoAbrigamento() {
        return emCasoDeNaoAbrigamento;
    }

    public void setEmCasoDeNaoAbrigamento(String emCasoDeNaoAbrigamento) {
        this.emCasoDeNaoAbrigamento = emCasoDeNaoAbrigamento;
    }

    public String getEncaminhamentosObservacoes() {
        return encaminhamentosObservacoes;
    }

    public void setEncaminhamentosObservacoes(String encaminhamentosObservacoes) {
        this.encaminhamentosObservacoes = encaminhamentosObservacoes;
    }

    public String getEstaSendoAcompanhadoEmNucleoCramOutro() {
        return estaSendoAcompanhadoEmNucleoCramOutro;
    }

    public void setEstaSendoAcompanhadoEmNucleoCramOutro(String estaSendoAcompanhadoEmNucleoCramOutro) {
        this.estaSendoAcompanhadoEmNucleoCramOutro = estaSendoAcompanhadoEmNucleoCramOutro;
    }

    public String getFisica() {
        return fisica;
    }

    public void setFisica(String fisica) {
        this.fisica = fisica;
    }

    public String getGestante() {
        return gestante;
    }

    public void setGestante(String gestante) {
        this.gestante = gestante;
    }

    public String getHistoricoAcompanhamentoMental() {
        return historicoAcompanhamentoMental;
    }

    public void setHistoricoAcompanhamentoMental(String historicoAcompanhamentoMental) {
        this.historicoAcompanhamentoMental = historicoAcompanhamentoMental;
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

    public String getLaqueaduraTubaria() {
        return laqueaduraTubaria;
    }

    public void setLaqueaduraTubaria(String laqueaduraTubaria) {
        this.laqueaduraTubaria = laqueaduraTubaria;
    }

    public String getMedicacoesControladas() {
        return medicacoesControladas;
    }

    public void setMedicacoesControladas(String medicacoesControladas) {
        this.medicacoesControladas = medicacoesControladas;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getMental() {
        return mental;
    }

    public void setMental(String mental) {
        this.mental = mental;
    }

    public String getNaoCorreRisco() {
        return naoCorreRisco;
    }

    public void setNaoCorreRisco(String naoCorreRisco) {
        this.naoCorreRisco = naoCorreRisco;
    }

    public String getNaoFazUsoDeContracepcao() {
        return naoFazUsoDeContracepcao;
    }

    public void setNaoFazUsoDeContracepcao(String naoFazUsoDeContracepcao) {
        this.naoFazUsoDeContracepcao = naoFazUsoDeContracepcao;
    }

    public String getNaoPorque() {
        return naoPorque;
    }

    public void setNaoPorque(String naoPorque) {
        this.naoPorque = naoPorque;
    }

    public String getOutra() {
        return outra;
    }

    public void setOutra(String outra) {
        this.outra = outra;
    }

    public String getOutrasQuais() {
        return outrasQuais;
    }

    public void setOutrasQuais(String outrasQuais) {
        this.outrasQuais = outrasQuais;
    }

    public String getOutrosAbrigamento() {
        return outrosAbrigamento;
    }

    public void setOutrosAbrigamento(String outrosAbrigamento) {
        this.outrosAbrigamento = outrosAbrigamento;
    }

    public String getOutrosAlergia() {
        return outrosAlergia;
    }

    public void setOutrosAlergia(String outrosAlergia) {
        this.outrosAlergia = outrosAlergia;
    }

    public String getParenteEndereco() {
        return parenteEndereco;
    }

    public void setParenteEndereco(String parenteEndereco) {
        this.parenteEndereco = parenteEndereco;
    }

    public String getParenteNome() {
        return parenteNome;
    }

    public void setParenteNome(String parenteNome) {
        this.parenteNome = parenteNome;
    }

    public String getPossuiAlergias() {
        return possuiAlergias;
    }

    public void setPossuiAlergias(String possuiAlergias) {
        this.possuiAlergias = possuiAlergias;
    }

    public String getPossuiAlgumaDoenca() {
        return possuiAlgumaDoenca;
    }

    public void setPossuiAlgumaDoenca(String possuiAlgumaDoenca) {
        this.possuiAlgumaDoenca = possuiAlgumaDoenca;
    }

    public String getSexoMasculinoAcima() {
        return sexoMasculinoAcima;
    }

    public void setSexoMasculinoAcima(String sexoMasculinoAcima) {
        this.sexoMasculinoAcima = sexoMasculinoAcima;
    }

    public String getSimEspecificar() {
        return simEspecificar;
    }

    public void setSimEspecificar(String simEspecificar) {
        this.simEspecificar = simEspecificar;
    }

    public String getSimOnde() {
        return simOnde;
    }

    public void setSimOnde(String simOnde) {
        this.simOnde = simOnde;
    }

    public String getSimQuais() {
        return simQuais;
    }

    public void setSimQuais(String simQuais) {
        this.simQuais = simQuais;
    }

    public String getSimQuaisMedicacoes() {
        return simQuaisMedicacoes;
    }

    public void setSimQuaisMedicacoes(String simQuaisMedicacoes) {
        this.simQuaisMedicacoes = simQuaisMedicacoes;
    }

    public String getSimQuaisPsicoativas() {
        return simQuaisPsicoativas;
    }

    public void setSimQuaisPsicoativas(String simQuaisPsicoativas) {
        this.simQuaisPsicoativas = simQuaisPsicoativas;
    }

    public String getSubstanciasPsicoativas() {
        return substanciasPsicoativas;
    }

    public void setSubstanciasPsicoativas(String substanciasPsicoativas) {
        this.substanciasPsicoativas = substanciasPsicoativas;
    }

    public String getTemConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado() {
        return temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado;
    }

    public void setTemConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado(String temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado) {
        this.temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado = temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado;
    }

    public String getVisual() {
        return visual;
    }

    public void setVisual(String visual) {
        this.visual = visual;
    }

   

    @Override
    public String toString() {
        return "AbrigadaPsicologia{" + "id=" + id + ", emCasoDeNaoAbrigamento=" + emCasoDeNaoAbrigamento + ", parenteNome=" + parenteNome + ", parenteEndereco=" + parenteEndereco + ", sexoMasculinoAcima=" + sexoMasculinoAcima + ", naoCorreRisco=" + naoCorreRisco + ", outrosAbrigamento=" + outrosAbrigamento + ", demaisMembrosDaFamilia=" + demaisMembrosDaFamilia + ", laqueaduraTubaria=" + laqueaduraTubaria + ", gestante=" + gestante + ", simOnde=" + simOnde + ", naoPorque=" + naoPorque + ", contracepcaoOralInjetavel=" + contracepcaoOralInjetavel + ", diu=" + diu + ", naoFazUsoDeContracepcao=" + naoFazUsoDeContracepcao + ", visual=" + visual + ", auditivaFala=" + auditivaFala + ", fisica=" + fisica + ", mental=" + mental + ", historicoAcompanhamentoMental=" + historicoAcompanhamentoMental + ", outra=" + outra + ", drogasLicitasIlicitas=" + drogasLicitasIlicitas + ", simQuais=" + simQuais + ", comQueFrequencia=" + comQueFrequencia + ", possuiAlgumaDoenca=" + possuiAlgumaDoenca + ", cronica=" + cronica + ", outrasQuais=" + outrasQuais + ", possuiAlergias=" + possuiAlergias + ", medicamentos=" + medicamentos + ", outrosAlergia=" + outrosAlergia + ", medicacoesControladas=" + medicacoesControladas + ", simQuaisMedicacoes=" + simQuaisMedicacoes + ", substanciasPsicoativas=" + substanciasPsicoativas + ", simQuaisPsicoativas=" + simQuaisPsicoativas + ", agressivoFilhos=" + agressivoFilhos + ", agressivoFamiliares=" + agressivoFamiliares + ", agressivoOutros=" + agressivoOutros + ", estaSendoAcompanhadoEmNucleoCramOutro=" + estaSendoAcompanhadoEmNucleoCramOutro + ", temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado=" + temConhecimentoHistoricoPsiquiatricoOuUsoDeMedicamentoControlado + ", simEspecificar=" + simEspecificar + ", encaminhamentosObservacoes=" + encaminhamentosObservacoes + ", idAbrigada=" + idAbrigada + '}';
    }
    
    
    
}
