public class Frase {
    private String id;
    private String texto;
    private String autor;
    private String categoria;

    public Frase() {
        this.id = "";
        this.texto = "";
        this.autor = "";
        this.categoria = "";
    }

    public Frase(String id, String texto, String autor, String categoria) {
        this.id = id;
        this.texto = texto;
        this.autor = autor;
        this.categoria = categoria;
    }

    public String getTexto() {
        return texto;
    }

    public Frase setTexto(String texto) {
        this.texto = texto;
        return this;
    }

    public String getAutor() {
        return autor;
    }

    public Frase setAutor(String autor) {
        this.autor = autor;
        return this;
    }

    public String getCategoria() {
        return categoria;
    }

    public Frase setCategoria(String categoria) {
        this.categoria = categoria;
        return this;
    }
}
