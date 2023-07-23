package br.com.appdepolitica.site.domain.deputado;
import jakarta.persistence.*;
import br.com.appdepolitica.site.domain.mandato.Mandato;

import java.util.List;

@Entity
@Table(name = "deputados")
public class Deputado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String uri;
    private String nome;
    private String urlFoto;
    private String email;

    @OneToMany(mappedBy = "deputado")
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUrlFoto() {
        return urlFoto;
    }

    public void setUrlFoto(String urlFoto) {
        this.urlFoto = urlFoto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Mandato> getMandatos() {
        return mandatos;
    }

    public void setMandatos(List<Mandato> mandatos) {
        this.mandatos = mandatos;
    }

    @Override
    public String toString() {
        return "Deputado{" +
                "id=" + id +
                ", uri='" + uri + '\'' +
                ", nome='" + nome + '\'' +
                ", urlFoto='" + urlFoto + '\'' +
                ", email='" + email + '\'' +
                ", mandatos=" + mandatos +
                '}';
    }
}
