package main.java.br.com.bibliotecaJava.model;

public class Livro {
    private int codigo;
    private String nome;
    private String autor;
    private int anoPublicacao;
    private String status;

    public Livro(int codigo, String nome, String autor, int anoPublicacao, String status){
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.status = status;
    }

    @Override
    public String toString() {
        return  "---------------------------" +
                "\ncódigo: " + this.getCodigo() +
                "\nnome: " + this.getNome() +
                "\nautor: " + this.getAutor() +
                "\nAno publicação: " + this.getAnoPublicacao() +
                "\nStatus: " + this.getStatus() +
                "---------------------------";
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
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
