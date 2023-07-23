package br.com.appdepolitica.site.domain.proposicao;

import jakarta.persistence.*;
import br.com.appdepolitica.site.domain.deputado.Deputado;

@Entity
@Table(name = "proposicoesautores")
public class ProposicaoAutores {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idControle;
    @Column(insertable = false, updatable = false)
    private int idProposicao;
    @Column(insertable = false, updatable = false)
    private int idDeputadoAutor;
    private String tipoAutor;
    private String nomeAutor;
    private String siglaPartidoAutor;
    private String siglaUFAutor;

//    @ManyToOne
//    @JoinColumn(name = "idDeputadoAutor", referencedColumnName = "id")
//    private Deputado deputado;

    @ManyToOne
    @JoinColumn(name = "idProposicao", referencedColumnName = "id")
    private Proposicao proposicao;

    public Long getIdControle() {
        return idControle;
    }

    public void setIdControle(Long idControle) {
        this.idControle = idControle;
    }

    public int getIdProposicao() {
        return idProposicao;
    }

    public void setIdProposicao(int idProposicao) {
        this.idProposicao = idProposicao;
    }

    public int getIdDeputadoAutor() {
        return idDeputadoAutor;
    }

    public void setIdDeputadoAutor(int idDeputadoAutor) {
        this.idDeputadoAutor = idDeputadoAutor;
    }

    public String getTipoAutor() {
        return tipoAutor;
    }

    public void setTipoAutor(String tipoAutor) {
        this.tipoAutor = tipoAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getSiglaPartidoAutor() {
        return siglaPartidoAutor;
    }

    public void setSiglaPartidoAutor(String siglaPartidoAutor) {
        this.siglaPartidoAutor = siglaPartidoAutor;
    }

    public String getSiglaUFAutor() {
        return siglaUFAutor;
    }

    public void setSiglaUFAutor(String siglaUFAutor) {
        this.siglaUFAutor = siglaUFAutor;
    }

//    public Deputado getDeputado() {
//        return deputado;
//    }

//    public void setDeputado(Deputado deputado) {
//        this.deputado = deputado;
//    }
}
