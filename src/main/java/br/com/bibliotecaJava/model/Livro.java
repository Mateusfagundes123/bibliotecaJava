package main.java.br.com.bibliotecaJava.model;

public class Livro {
    private int codigo;
    private String nome;
    private String autor;
    private int anoPublicacao;
    private String status;

    public Livro(int codigo, String nome, String autor, int anoPublicacao){
        this.codigo = codigo;
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = getAnoPublicacao();
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
