package br.com.appdepolitica.site.domain.proposicao;

public class ProposicaoDetalhes {
    private Proposicao proposicao;
    private ProposicaoAutores proposicaoAutores;

    public ProposicaoDetalhes(Proposicao proposicao, ProposicaoAutores proposicaoAutores) {
        this.proposicao = proposicao;
        this.proposicaoAutores = proposicaoAutores;
    }

    public Proposicao getProposicao() {
        return proposicao;
    }

    public ProposicaoAutores getProposicaoAutores() {
        return proposicaoAutores;
    }
}
