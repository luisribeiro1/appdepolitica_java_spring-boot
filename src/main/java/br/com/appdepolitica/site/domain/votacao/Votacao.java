package br.com.appdepolitica.site.domain.votacao;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "votacoes")
public class Votacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private LocalDate data;
    private String siglaOrgao;
    private int votosSim;
    private int votosNao;
    private int aprovacao;
    private String descricao;

    @OneToMany(mappedBy = "votacao")
    private List<VotacaoProposicao> votacoesProposicoes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getSiglaOrgao() {
        return siglaOrgao;
    }

    public void setSiglaOrgao(String siglaOrgao) {
        this.siglaOrgao = siglaOrgao;
    }

    public int getVotosSim() {
        return votosSim;
    }

    public void setVotosSim(int votosSim) {
        this.votosSim = votosSim;
    }

    public int getVotosNao() {
        return votosNao;
    }

    public void setVotosNao(int votosNao) {
        this.votosNao = votosNao;
    }

    public int getAprovacao() {
        return aprovacao;
    }

    public void setAprovacao(int aprovacao) {
        this.aprovacao = aprovacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<VotacaoProposicao> getVotacoesProposicoes() {
        return votacoesProposicoes;
    }

    public void setVotacoesProposicoes(List<VotacaoProposicao> votacoesProposicoes) {
        this.votacoesProposicoes = votacoesProposicoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Votacao votacao = (Votacao) o;
        return Objects.equals(id, votacao.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Votacao{" +
                "id='" + id + '\'' +
                ", data=" + data +
                ", siglaOrgao='" + siglaOrgao + '\'' +
                ", votosSim=" + votosSim +
                ", votosNao=" + votosNao +
                ", aprovacao=" + aprovacao +
                ", descricao='" + descricao + '\'' +
                ", votacoesProposicoes=" + votacoesProposicoes +
                '}';
    }
}
