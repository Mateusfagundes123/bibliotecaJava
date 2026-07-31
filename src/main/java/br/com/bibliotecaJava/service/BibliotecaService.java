package main.java.br.com.bibliotecaJava.service;
import main.java.br.com.bibliotecaJava.model.Livro;
import main.java.br.com.bibliotecaJava.repository.LivroRepository;

import java.util.Scanner;

public class BibliotecaService {
    Scanner leitura = new Scanner(System.in);

    private LivroRepository repository = new LivroRepository();

    public void cadastrarLivro(int codigo, String titulo, String autor, int ano){
        Livro livro = new Livro(codigo, titulo, autor, ano, "Disponível");
        repository.adicionar(livro);
        System.out.println("Livro cadastrado");
    }

    public void listarLivros() {
        for (Livro livro : repository.listar()) {
            System.out.println(livro.toString());
        }
    }

    public Livro buscarPorCodigo(int codigo) {
        return repository.buscarPorCodigo(codigo);
    }

    public void deletarLivro(Livro livro){
        repository.deletarLivro(livro);
        System.out.println("Livro deletado");
    }
    public void emprestarLivro(Livro livro){
        repository.emprestarLivro(livro);
        System.out.println("livro emprestado.");
    }


    /*
    emprestar livro

    deletar livro

    devolver livro
     */

}
