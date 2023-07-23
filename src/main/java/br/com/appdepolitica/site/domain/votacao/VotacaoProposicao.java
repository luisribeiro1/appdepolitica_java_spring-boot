package br.com.appdepolitica.site.domain.votacao;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "votacoesproposicoes")
public class VotacaoProposicao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    private String idVotacao;
    private String descricao;
    private LocalDate data;
    private String ementa;
    private String titulo;
    private String codTipo;
    private String siglaTipo;
    private int numero;
    private int ano;

    @ManyToOne
    @JoinColumn(name = "idVotacao")
    private Votacao votacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodTipo() {
        return codTipo;
    }

    public void setCodTipo(String codTipo) {
        this.codTipo = codTipo;
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

    public Votacao getVotacao() {
        return votacao;
    }

    public void setVotacao(Votacao votacao) {
        this.votacao = votacao;
    }

    @Override
    public String toString() {
        return "VotacaoProposicao{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", data=" + data +
                ", ementa='" + ementa + '\'' +
                ", titulo='" + titulo + '\'' +
                ", codTipo='" + codTipo + '\'' +
                ", siglaTipo='" + siglaTipo + '\'' +
                ", numero=" + numero +
                ", ano=" + ano +
                '}';
    }
}
