package br.com.appdepolitica.site.domain.legislatura;

import jakarta.persistence.*;
import br.com.appdepolitica.site.domain.mandato.Mandato;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name="legislaturas")
public class Legislatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    @OneToMany(mappedBy = "legislatura")
    private List<Mandato> mandatos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public List<Mandato> getMandatos() {
        return mandatos;
    }

    public void setMandatos(List<Mandato> mandatos) {
        this.mandatos = mandatos;
    }

    @Override
    public String toString() {
        return "Legislatura{" +
                "id=" + id +
                ", uri='" + uri + '\'' +
                ", dataInicio=" + dataInicio +
                ", dataFim=" + dataFim +
                ", mandatos=" + mandatos +
                '}';
    }
}
