package br.com.appdepolitica.site.domain.mandato;

import jakarta.persistence.*;
import br.com.appdepolitica.site.domain.deputado.Deputado;
import br.com.appdepolitica.site.domain.legislatura.Legislatura;

@Entity
@Table(name = "mandatos")
public class Mandato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String siglaUf;
    private String siglaPartido;

    @ManyToOne
    @JoinColumn(name = "idDeputado")
    private Deputado deputado;

    @ManyToOne
    @JoinColumn(name = "idLegislatura")
    private Legislatura legislatura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public String getSiglaPartido() {
        return siglaPartido;
    }

    public void setSiglaPartido(String siglaPartido) {
        this.siglaPartido = siglaPartido;
    }

    public Deputado getDeputado() {
        return deputado;
    }

    public void setDeputado(Deputado deputado) {
        this.deputado = deputado;
    }

    public Legislatura getLegislatura() {
        return legislatura;
    }

    public void setLegislatura(Legislatura legislatura) {
        this.legislatura = legislatura;
    }

    @Override
    public String toString() {
        return "Mandato{" +
                "id=" + id +
                ", siglaUf='" + siglaUf + '\'' +
                ", siglaPartido='" + siglaPartido + '\'' +
//                ", deputado=" + deputado +
//                ", legislatura=" + legislatura +
                '}';
    }
}
