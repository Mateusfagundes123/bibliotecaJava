package main.java.br.com.bibliotecaJava.model;

public class Livro {
    private int codigo;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String status;

    public Livro(int codigo, String titulo, String autor, int anoPublicacao, String status){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return  "---------------------------" +
                "\ncódigo: " + this.getCodigo() +
                "\nTítulo: " + this.getTitulo() +
                "\nautor: " + this.getAutor() +
                "\nAno publicação: " + this.getAnoPublicacao() +
                "\nStatus: " + this.getStatus() +
                "\n---------------------------";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnoPublicacao() {
        return anoPublicacao;
    }
    public String getStatus() {
        return status;
    }
}
