package br.com.appdepolitica.site.domain.proposicao;

import jakarta.persistence.*;
import org.apache.catalina.users.GenericRole;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "proposicoes")
public class Proposicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idControle;
    private int id;
    private String uri;
    private String siglaTipo;
    private int numero;
    private int ano;
    private int codTipo;
    private String descricaoTipo;
    private String ementa;
    private String ementaDetalhada;
    private LocalDate dataApresentacao;

    //@OneToMany(mappedBy = "proposicao")
    @OneToMany
    private List<ProposicaoAutores> ProposicaoListaAutores;

    public Long getIdControle() {
        return idControle;
    }

    public void setIdControle(Long idControle) {
        this.idControle = idControle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricaoTipo() {
        return descricaoTipo;
    }

    public void setDescricaoTipo(String descricaoTipo) {
        this.descricaoTipo = descricaoTipo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getSiglaTipo() {
        return siglaTipo;
    }

    public void setSiglaTipo(String siglaTipo) {
        this.siglaTipo = siglaTipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(int codTipo) {
        this.codTipo = codTipo;
    }

    public String getEmentaDetalhada() {
        return ementaDetalhada;
    }

    public void setEmentaDetalhada(String ementaDetalhada) {
        this.ementaDetalhada = ementaDetalhada;
    }

    public LocalDate getDataApresentacao() {
        return dataApresentacao;
    }

    public void setDataApresentacao(LocalDate dataApresentacao) {
        this.dataApresentacao = dataApresentacao;
    }

    public List<ProposicaoAutores> getProposicaoListaAutores() {
        return ProposicaoListaAutores;
    }

    public void setProposicaoListaAutores(List<ProposicaoAutores> proposicaoListaAutores) {
        ProposicaoListaAutores = proposicaoListaAutores;
    }
}
