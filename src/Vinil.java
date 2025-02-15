public class Vinil {
    String nomeArtista;
    String nomeVinil;
    int anoLancamento;
    int preco;

    public Vinil(String nomeArtista, String nomeVinil, int anoLancamento, int preco) {
        this.nomeArtista = nomeArtista;
        this.nomeVinil = nomeVinil;
        this.anoLancamento = anoLancamento;
        this.preco = preco;
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public String getNomeVinil() {
        return nomeVinil;
    }

    public void setNomeVinil(String nomeVinil) {
        this.nomeVinil = nomeVinil;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }
}
