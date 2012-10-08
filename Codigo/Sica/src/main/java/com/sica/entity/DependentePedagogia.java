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
public class DependentePedagogia {
    
    @Id
    @GeneratedValue
    private long idDependente;
    private String prontuario;
    private String dataAdmissao;
    private long idAbrigada;
    private String nomeAbrigada;
    private boolean desligamento;
    private boolean necessitaAcompanhamentoPsicologico;
    //Dados dependentes
    private String nome;
    private String idade;
    private String sexo;
    private String dataNascimento;
    private String documentosPessoais;
    //Situacao escolar
    private String serie;
    private boolean matriculado;
    private String escolaMatriculado;
    private String porqueNaoMatriculado;
    private boolean apresentaDefasagemEscolar;
    private boolean apresentaDeficuldadeAprendizagem;
    //Situacao de saude
    private boolean portadorNecessidadeEspeciais;
    private String portadorNecessidadeEspeciaisSim;
    private String historicoAcompanhamentoPsiquiatrico;
    private boolean usaDrogas;
    private String qualDroga;
    private String frequenciaUsoDrogas;
    private String possuiDoenca;
    private String tipoDoenca;  // cronica
    private String possuiAlergia;
    private String medicamentoAlergico;
    private String medicacaoControlada;
    private String medicamentoControlado;
    //Situacao de violencia
    private String nBoletimOcorrencia;
    private String orgaoDeEncaminhamento;
    private String tipoDeViolenciaSofrida;
    //fisica
    private boolean violenciaFisica;
    private String qualFormaFisica;
    private String lesaoAparente;
    private String encaminhadaIMLFisica;
    //Sexual
    private boolean violenciaSexual;
    private String qualFormaSexual;
    private String encaminhadaIMLSexual;
    //patrimonial
    private boolean violenciaPatrimonial;
    private String qualFormaPatrimonial;
    //Moral
    private boolean violenciaMoral;
    private String qualFormaMoral;
    //Psicologico
    private boolean violenciaPsicologica;
    private String qualFormaPsicologica;
    //Agressor
    private String nomeAgressor;
    private String relacaoDependente;
    private boolean primeiraAgressao;
    private boolean primeiraDenuncia;
    //primeira denuncia false
    private String quantasVezes;
    //primeira denuncia true
    private String pqNaoDenunciouAntes;
    private String tempoOcorreAgressoes;
    private String pastaEspecialVIJ;
    //Caso nao seja vitima de agressoes
    private boolean presenciouVilenciaContraParentescos;
    //Acompanhamento pedagogico pos desligamento
    private boolean necessitaAcompanhamento;
    private String observacaoPosDesligamento;

    public DependentePedagogia(){
        
    }

    public DependentePedagogia(long idDependente, String prontuario, String dataAdmissao, long idAbrigada, String nomeAbrigada, boolean desligamento,boolean necessitaAcompanhamentoPsicologico, String nome, String idade, String sexo, String dataNascimento, String documentosPessoais, String serie, boolean matriculado, String escolaMatriculado, String porqueNaoMatriculado, boolean apresentaDefasagemEscolar, boolean apresentaDeficuldadeAprendizagem, boolean portadorNecessidadeEspeciais, String portadorNecessidadeEspeciaisSim, String historicoAcompanhamentoPsiquiatrico, boolean usaDrogas, String qualDroga, String frequenciaUsoDrogas, String possuiDoenca, String tipoDoenca, String possuiAlergia, String medicamentoAlergico, String medicacaoControlada,String medicamentoControlado, String nBoletimOcorrencia, String orgaoDeEncaminhamento, String tipoDeViolenciaSofrida, boolean violenciaFisica, String qualFormaFisica, String lesaoAparente, String encaminhadaIMLFisica, boolean violenciaSexual, String qualFormaSexual, String encaminhadaIMLSexual, boolean violenciaPatrimonial, String qualFormaPatrimonial, boolean violenciaMoral, String qualFormaMoral, boolean violenciaPsicologica, String qualFormaPsicologica, String nomeAgressor, String relacaoDependente, boolean primeiraAgressao, boolean primeiraDenuncia, String quantasVezes, String pqNaoDenunciouAntes, String tempoOcorreAgressoes, String pastaEspecialVIJ, boolean presenciouVilenciaContraParentescos, boolean necessitaAcompanhamento, String observacaoPosDesligamento) {
        this.idDependente = idDependente;
        this.prontuario = prontuario;
        this.dataAdmissao = dataAdmissao;
        this.idAbrigada = idAbrigada;
        this.nomeAbrigada = nomeAbrigada;
        this.desligamento = desligamento;
        this.necessitaAcompanhamentoPsicologico = necessitaAcompanhamentoPsicologico;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.documentosPessoais = documentosPessoais;
        this.serie = serie;
        this.matriculado = matriculado;
        this.escolaMatriculado = escolaMatriculado;
        this.porqueNaoMatriculado = porqueNaoMatriculado;
        this.apresentaDefasagemEscolar = apresentaDefasagemEscolar;
        this.apresentaDeficuldadeAprendizagem = apresentaDeficuldadeAprendizagem;
        this.portadorNecessidadeEspeciais = portadorNecessidadeEspeciais;
        this.portadorNecessidadeEspeciaisSim = portadorNecessidadeEspeciaisSim;
        this.historicoAcompanhamentoPsiquiatrico = historicoAcompanhamentoPsiquiatrico;
        this.usaDrogas = usaDrogas;
        this.qualDroga = qualDroga;
        this.frequenciaUsoDrogas = frequenciaUsoDrogas;
        this.possuiDoenca = possuiDoenca;
        this.tipoDoenca = tipoDoenca;
        this.possuiAlergia = possuiAlergia;
        this.medicamentoAlergico = medicamentoAlergico;
        this.medicacaoControlada = medicacaoControlada;
        this.medicamentoControlado = medicamentoControlado;
        this.nBoletimOcorrencia = nBoletimOcorrencia;
        this.orgaoDeEncaminhamento = orgaoDeEncaminhamento;
        this.tipoDeViolenciaSofrida = tipoDeViolenciaSofrida;
        this.violenciaFisica = violenciaFisica;
        this.qualFormaFisica = qualFormaFisica;
        this.lesaoAparente = lesaoAparente;
        this.encaminhadaIMLFisica = encaminhadaIMLFisica;
        this.violenciaSexual = violenciaSexual;
        this.qualFormaSexual = qualFormaSexual;
        this.encaminhadaIMLSexual = encaminhadaIMLSexual;
        this.violenciaPatrimonial = violenciaPatrimonial;
        this.qualFormaPatrimonial = qualFormaPatrimonial;
        this.violenciaMoral = violenciaMoral;
        this.qualFormaMoral = qualFormaMoral;
        this.violenciaPsicologica = violenciaPsicologica;
        this.qualFormaPsicologica = qualFormaPsicologica;
        this.nomeAgressor = nomeAgressor;
        this.relacaoDependente = relacaoDependente;
        this.primeiraAgressao = primeiraAgressao;
        this.primeiraDenuncia = primeiraDenuncia;
        this.quantasVezes = quantasVezes;
        this.pqNaoDenunciouAntes = pqNaoDenunciouAntes;
        this.tempoOcorreAgressoes = tempoOcorreAgressoes;
        this.pastaEspecialVIJ = pastaEspecialVIJ;
        this.presenciouVilenciaContraParentescos = presenciouVilenciaContraParentescos;
        this.necessitaAcompanhamento = necessitaAcompanhamento;
        this.observacaoPosDesligamento = observacaoPosDesligamento;
    }

    public String getPortadorNecessidadeEspeciaisSim() {
        return portadorNecessidadeEspeciaisSim;
    }

    public void setPortadorNecessidadeEspeciaisSim(String portadorNecessidadeEspeciaisSim) {
        this.portadorNecessidadeEspeciaisSim = portadorNecessidadeEspeciaisSim;
    }

    public String getMedicamentoControlado() {
        return medicamentoControlado;
    }

    public void setMedicamentoControlado(String medicamentoControlado) {
        this.medicamentoControlado = medicamentoControlado;
    }

    public boolean isNecessitaAcompanhamento() {
        return necessitaAcompanhamento;
    }

     public boolean isNecessitaAcompanhamentoPsicologico() {
        return necessitaAcompanhamentoPsicologico;
    }

    public void setNecessitaAcompanhamentoPsicologico(boolean necessitaAcompanhamentoPsicologico) {
        this.necessitaAcompanhamentoPsicologico = necessitaAcompanhamentoPsicologico;
    }
    
    public void setNecessitaAcompanhamento(boolean necessitaAcompanhamento) {
        this.necessitaAcompanhamento = necessitaAcompanhamento;
    }
    

    public String getObservacaoPosDesligamento() {
        return observacaoPosDesligamento;
    }

    public void setObservacaoPosDesligamento(String observacaoPosDesligamento) {
        this.observacaoPosDesligamento = observacaoPosDesligamento;
    }
        
    public long getIdAbrigada() {
        return idAbrigada;
    }

    public void setIdAbrigada(long idAbrigada) {
        this.idAbrigada = idAbrigada;
    }

    public long getIdDependente() {
        return idDependente;
    }

    public void setIdDependente(long idDependente) {
        this.idDependente = idDependente;
    }
    
    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public boolean isApresentaDefasagemEscolar() {
        return apresentaDefasagemEscolar;
    }

    public void setApresentaDefasagemEscolar(boolean apresentaDefasagemEscolar) {
        this.apresentaDefasagemEscolar = apresentaDefasagemEscolar;
    }

    public boolean isApresentaDeficuldadeAprendizagem() {
        return apresentaDeficuldadeAprendizagem;
    }

    public void setApresentaDeficuldadeAprendizagem(boolean apresentaDeficuldadeAprendizagem) {
        this.apresentaDeficuldadeAprendizagem = apresentaDeficuldadeAprendizagem;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean getDesligamento() {
        return desligamento;
    }

    public void setDesligamento(boolean desligamento) {
        this.desligamento = desligamento;
    }

    public String getDocumentosPessoais() {
        return documentosPessoais;
    }

    public void setDocumentosPessoais(String documentosPessoais) {
        this.documentosPessoais = documentosPessoais;
    }

    public String getFrequenciaUsoDrogas() {
        return frequenciaUsoDrogas;
    }

    public void setFrequenciaUsoDrogas(String frequenciaUsoDrogas) {
        this.frequenciaUsoDrogas = frequenciaUsoDrogas;
    }

    public String getHistoricoAcompanhamentoPsiquiatrico() {
        return historicoAcompanhamentoPsiquiatrico;
    }

    public void setHistoricoAcompanhamentoPsiquiatrico(String historicoAcompanhamentoPsiquiatrico) {
        this.historicoAcompanhamentoPsiquiatrico = historicoAcompanhamentoPsiquiatrico;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getLesaoAparente() {
        return lesaoAparente;
    }

    public void setLesaoAparente(String lesaoAparente) {
        this.lesaoAparente = lesaoAparente;
    }

    public boolean getMatriculado() {
        return matriculado;
    }

    public void isMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getMedicacaoControlada() {
        return medicacaoControlada;
    }

    public void setMedicacaoControlada(String medicacaoControlada) {
        this.medicacaoControlada = medicacaoControlada;
    }

    public String getMedicamentoAlergico() {
        return medicamentoAlergico;
    }

    public void setMedicamentoAlergico(String medicamentoAlergico) {
        this.medicamentoAlergico = medicamentoAlergico;
    }

    public String getnBoletimOcorrencia() {
        return nBoletimOcorrencia;
    }

    public void setnBoletimOcorrencia(String nBoletimOcorrencia) {
        this.nBoletimOcorrencia = nBoletimOcorrencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeAbrigada() {
        return nomeAbrigada;
    }

    public void setNomeAbrigada(String nomeAbrigada) {
        this.nomeAbrigada = nomeAbrigada;
    }

    public String getNomeAgressor() {
        return nomeAgressor;
    }

    public void setNomeAgressor(String nomeAgressor) {
        this.nomeAgressor = nomeAgressor;
    }

    public String getOrgaoDeEncaminhamento() {
        return orgaoDeEncaminhamento;
    }

    public void setOrgaoDeEncaminhamento(String orgaoDeEncaminhamento) {
        this.orgaoDeEncaminhamento = orgaoDeEncaminhamento;
    }

    public String getPastaEspecialVIJ() {
        return pastaEspecialVIJ;
    }

    public void setPastaEspecialVIJ(String pastaEspecialVIJ) {
        this.pastaEspecialVIJ = pastaEspecialVIJ;
    }

    public boolean isPortadorNecessidadeEspeciais() {
        return portadorNecessidadeEspeciais;
    }

    public void setPortadorNecessidadeEspeciais(boolean portadorNecessidadeEspeciais) {
        this.portadorNecessidadeEspeciais = portadorNecessidadeEspeciais;
    }

    public String getPossuiAlergia() {
        return possuiAlergia;
    }

    public void setPossuiAlergia(String possuiAlergia) {
        this.possuiAlergia = possuiAlergia;
    }

    public String getPossuiDoenca() {
        return possuiDoenca;
    }

    public void setPossuiDoenca(String possuiDoenca) {
        this.possuiDoenca = possuiDoenca;
    }

    public String getPqNaoDenunciouAntes() {
        return pqNaoDenunciouAntes;
    }

    public void setPqNaoDenunciouAntes(String pqNaoDenunciouAntes) {
        this.pqNaoDenunciouAntes = pqNaoDenunciouAntes;
    }

    public boolean isPresenciouVilenciaContraParentescos() {
        return presenciouVilenciaContraParentescos;
    }

    public void setPresenciouVilenciaContraParentescos(boolean presenciouVilenciaContraParentescos) {
        this.presenciouVilenciaContraParentescos = presenciouVilenciaContraParentescos;
    }

    public boolean isPrimeiraAgressao() {
        return primeiraAgressao;
    }

    public void setPrimeiraAgressao(boolean primeiraAgressao) {
        this.primeiraAgressao = primeiraAgressao;
    }

    public boolean isPrimeiraDenuncia() {
        return primeiraDenuncia;
    }

    public void setPrimeiraDenuncia(boolean primeiraDenuncia) {
        this.primeiraDenuncia = primeiraDenuncia;
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getQualDroga() {
        return qualDroga;
    }

    public void setQualDroga(String qualDroga) {
        this.qualDroga = qualDroga;
    }

    public String getQuantasVezes() {
        return quantasVezes;
    }

    public void setQuantasVezes(String quantasVezes) {
        this.quantasVezes = quantasVezes;
    }

    public String getRelacaoDependente() {
        return relacaoDependente;
    }

    public void setRelacaoDependente(String relacaoDependente) {
        this.relacaoDependente = relacaoDependente;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getTempoOcorreAgressoes() {
        return tempoOcorreAgressoes;
    }

    public void setTempoOcorreAgressoes(String tempoOcorreAgressoes) {
        this.tempoOcorreAgressoes = tempoOcorreAgressoes;
    }

    public String getTipoDeViolenciaSofrida() {
        return tipoDeViolenciaSofrida;
    }

    public void setTipoDeViolenciaSofrida(String tipoDeViolenciaSofrida) {
        this.tipoDeViolenciaSofrida = tipoDeViolenciaSofrida;
    }

    public String getTipoDoenca() {
        return tipoDoenca;
    }

    public void setTipoDoenca(String tipoDoenca) {
        this.tipoDoenca = tipoDoenca;
    }

    public boolean isUsaDrogas() {
        return usaDrogas;
    }

    public void setUsaDrogas(boolean usaDrogas) {
        this.usaDrogas = usaDrogas;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEscolaMatriculado() {
        return escolaMatriculado;
    }

    public void setEscolaMatriculado(String escolaMatriculado) {
        this.escolaMatriculado = escolaMatriculado;
    }

    public String getPorqueNaoMatriculado() {
        return porqueNaoMatriculado;
    }

    public void setPorqueNaoMatriculado(String porqueNaoMatriculado) {
        this.porqueNaoMatriculado = porqueNaoMatriculado;
    }

    public String getEncaminhadaIMLFisica() {
        return encaminhadaIMLFisica;
    }

    public void setEncaminhadaIMLFisica(String encaminhadaIMLFisica) {
        this.encaminhadaIMLFisica = encaminhadaIMLFisica;
    }

    public String getEncaminhadaIMLSexual() {
        return encaminhadaIMLSexual;
    }

    public void setEncaminhadaIMLSexual(String encaminhadaIMLSexual) {
        this.encaminhadaIMLSexual = encaminhadaIMLSexual;
    }

    public boolean isMatriculado() {
        return matriculado;
    }

    public void setMatriculado(boolean matriculado) {
        this.matriculado = matriculado;
    }

    public String getQualFormaFisica() {
        return qualFormaFisica;
    }

    public void setQualFormaFisica(String qualFormaFisica) {
        this.qualFormaFisica = qualFormaFisica;
    }

    public String getQualFormaMoral() {
        return qualFormaMoral;
    }

    public void setQualFormaMoral(String qualFormaMoral) {
        this.qualFormaMoral = qualFormaMoral;
    }

    public String getQualFormaPatrimonial() {
        return qualFormaPatrimonial;
    }

    public void setQualFormaPatrimonial(String qualFormaPatrimonial) {
        this.qualFormaPatrimonial = qualFormaPatrimonial;
    }

    public String getQualFormaPsicologica() {
        return qualFormaPsicologica;
    }

    public void setQualFormaPsicologica(String qualFormaPsicologica) {
        this.qualFormaPsicologica = qualFormaPsicologica;
    }

    public String getQualFormaSexual() {
        return qualFormaSexual;
    }

    public void setQualFormaSexual(String qualFormaSexual) {
        this.qualFormaSexual = qualFormaSexual;
    }

    public boolean isViolenciaFisica() {
        return violenciaFisica;
    }

    public void setViolenciaFisica(boolean violenciaFisica) {
        this.violenciaFisica = violenciaFisica;
    }

    public boolean isViolenciaMoral() {
        return violenciaMoral;
    }

    public void setViolenciaMoral(boolean violenciaMoral) {
        this.violenciaMoral = violenciaMoral;
    }

    public boolean isViolenciaPatrimonial() {
        return violenciaPatrimonial;
    }

    public void setViolenciaPatrimonial(boolean violenciaPatrimonial) {
        this.violenciaPatrimonial = violenciaPatrimonial;
    }

    public boolean isViolenciaPsicologica() {
        return violenciaPsicologica;
    }

    public void setViolenciaPsicologica(boolean violenciaPsicologica) {
        this.violenciaPsicologica = violenciaPsicologica;
    }

    public boolean isViolenciaSexual() {
        return violenciaSexual;
    }

    public void setViolenciaSexual(boolean violenciaSexual) {
        this.violenciaSexual = violenciaSexual;
    }

    @Override
    public String toString() {
        return "DependentePedagogia{" + "idDependente=" + idDependente + ", prontuario=" + prontuario + ", dataAdmissao=" + dataAdmissao + ", idAbrigada=" + idAbrigada + ", nomeAbrigada=" + nomeAbrigada + ", desligamento=" + desligamento + ", nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento + ", documentosPessoais=" + documentosPessoais + ", serie=" + serie + ", matriculado=" + matriculado + ", escolaMatriculado=" + escolaMatriculado + ", porqueNaoMatriculado=" + porqueNaoMatriculado + ", apresentaDefasagemEscolar=" + apresentaDefasagemEscolar + ", apresentaDeficuldadeAprendizagem=" + apresentaDeficuldadeAprendizagem + ", portadorNecessidadeEspeciais=" + portadorNecessidadeEspeciais + ", historicoAcompanhamentoPsiquiatrico=" + historicoAcompanhamentoPsiquiatrico + ", usaDrogas=" + usaDrogas + ", qualDroga=" + qualDroga + ", frequenciaUsoDrogas=" + frequenciaUsoDrogas + ", possuiDoenca=" + possuiDoenca + ", tipoDoenca=" + tipoDoenca + ", possuiAlergia=" + possuiAlergia + ", medicamentoAlergico=" + medicamentoAlergico + ", medicacaoControlada=" + medicacaoControlada + ", nBoletimOcorrencia=" + nBoletimOcorrencia + ", orgaoDeEncaminhamento=" + orgaoDeEncaminhamento + ", tipoDeViolenciaSofrida=" + tipoDeViolenciaSofrida + ", violenciaFisica=" + violenciaFisica + ", qualFormaFisica=" + qualFormaFisica + ", lesaoAparente=" + lesaoAparente + ", encaminhadaIMLFisica=" + encaminhadaIMLFisica + ", violenciaSexual=" + violenciaSexual + ", qualFormaSexual=" + qualFormaSexual + ", encaminhadaIMLSexual=" + encaminhadaIMLSexual + ", violenciaPatrimonial=" + violenciaPatrimonial + ", qualFormaPatrimonial=" + qualFormaPatrimonial + ", violenciaMoral=" + violenciaMoral + ", qualFormaMoral=" + qualFormaMoral + ", violenciaPsicologica=" + violenciaPsicologica + ", qualFormaPsicologica=" + qualFormaPsicologica + ", nomeAgressor=" + nomeAgressor + ", relacaoDependente=" + relacaoDependente + ", primeiraAgressao=" + primeiraAgressao + ", primeiraDenuncia=" + primeiraDenuncia + ", quantasVezes=" + quantasVezes + ", pqNaoDenunciouAntes=" + pqNaoDenunciouAntes + ", tempoOcorreAgressoes=" + tempoOcorreAgressoes + ", pastaEspecialVIJ=" + pastaEspecialVIJ + ", presenciouVilenciaContraParentescos=" + presenciouVilenciaContraParentescos + ", necessitaAcompanhamento=" + necessitaAcompanhamento + ", observacaoPosDesligamento=" + observacaoPosDesligamento + '}';
    }
        
}
