public class Artigo{
    private String tituloArtigo;
    private String conteudoArtigo;

    public Artigo(String tituloArtigo, String conteudoArtigo) {
        this.tituloArtigo = tituloArtigo;
        this.conteudoArtigo = conteudoArtigo;
    }

    @Override
    public String toString() {
        return "Artigo{" +
                "tituloArtigo='" + tituloArtigo + '\'' +
                ", conteudoArtigo='" + conteudoArtigo + '\'' +
                '}';
    }
}
