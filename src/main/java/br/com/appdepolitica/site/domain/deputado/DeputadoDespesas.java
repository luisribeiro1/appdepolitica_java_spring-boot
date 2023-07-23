package br.com.appdepolitica.site.domain.deputado;
import java.util.List;

public class DeputadoDespesas {
    private List<Dados> dados;
    private List<Link> links;

    public List<Dados> getDados() {
        return dados;
    }

    public void setDados(List<Dados> dados) {
        this.dados = dados;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public static class Dados {
        private int ano;
        private int mes;
        private String tipoDespesa;
        private int codDocumento;
        private String tipoDocumento;
        private int codTipoDocumento;
        private String dataDocumento;
        private String numDocumento;
        private double valorDocumento;
        private String urlDocumento;
        private String nomeFornecedor;
        private String cnpjCpfFornecedor;
        private double valorLiquido;
        private double valorGlosa;
        private String numRessarcimento;
        private int codLote;
        private int parcela;

        public int getAno() {
            return ano;
        }

        public void setAno(int ano) {
            this.ano = ano;
        }

        public int getMes() {
            return mes;
        }

        public void setMes(int mes) {
            this.mes = mes;
        }

        public String getTipoDespesa() {
            return tipoDespesa;
        }

        public void setTipoDespesa(String tipoDespesa) {
            this.tipoDespesa = tipoDespesa;
        }

        public int getCodDocumento() {
            return codDocumento;
        }

        public void setCodDocumento(int codDocumento) {
            this.codDocumento = codDocumento;
        }

        public String getTipoDocumento() {
            return tipoDocumento;
        }

        public void setTipoDocumento(String tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
        }

        public int getCodTipoDocumento() {
            return codTipoDocumento;
        }

        public void setCodTipoDocumento(int codTipoDocumento) {
            this.codTipoDocumento = codTipoDocumento;
        }

        public String getDataDocumento() {
            return dataDocumento;
        }

        public void setDataDocumento(String dataDocumento) {
            this.dataDocumento = dataDocumento;
        }

        public String getNumDocumento() {
            return numDocumento;
        }

        public void setNumDocumento(String numDocumento) {
            this.numDocumento = numDocumento;
        }

        public double getValorDocumento() {
            return valorDocumento;
        }

        public void setValorDocumento(double valorDocumento) {
            this.valorDocumento = valorDocumento;
        }

        public String getUrlDocumento() {
            return urlDocumento;
        }

        public void setUrlDocumento(String urlDocumento) {
            this.urlDocumento = urlDocumento;
        }

        public String getNomeFornecedor() {
            return nomeFornecedor;
        }

        public void setNomeFornecedor(String nomeFornecedor) {
            this.nomeFornecedor = nomeFornecedor;
        }

        public String getCnpjCpfFornecedor() {
            return cnpjCpfFornecedor;
        }

        public void setCnpjCpfFornecedor(String cnpjCpfFornecedor) {
            this.cnpjCpfFornecedor = cnpjCpfFornecedor;
        }

        public double getValorLiquido() {
            return valorLiquido;
        }

        public void setValorLiquido(double valorLiquido) {
            this.valorLiquido = valorLiquido;
        }

        public double getValorGlosa() {
            return valorGlosa;
        }

        public void setValorGlosa(double valorGlosa) {
            this.valorGlosa = valorGlosa;
        }

        public String getNumRessarcimento() {
            return numRessarcimento;
        }

        public void setNumRessarcimento(String numRessarcimento) {
            this.numRessarcimento = numRessarcimento;
        }

        public int getCodLote() {
            return codLote;
        }

        public void setCodLote(int codLote) {
            this.codLote = codLote;
        }

        public int getParcela() {
            return parcela;
        }

        public void setParcela(int parcela) {
            this.parcela = parcela;
        }
    }

    public static class Link {
        private String rel;
        private String href;

        public String getRel() {
            return rel;
        }

        public void setRel(String rel) {
            this.rel = rel;
        }

        public String getHref() {
            return href;
        }

        public void setHref(String href) {
            this.href = href;
        }
    }
}
