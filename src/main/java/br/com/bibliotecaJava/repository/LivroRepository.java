package main.java.br.com.bibliotecaJava.repository;
import main.java.br.com.bibliotecaJava.model.Livro;
import java.util.ArrayList;


public class LivroRepository {

    private ArrayList<Livro> listaLivros = new ArrayList<>();

    public void adicionar(Livro livro){
        listaLivros.add(livro);
    }

    public ArrayList<Livro> listar(){
        return listaLivros;
    }

    public Livro buscarPorCodigo(int codigo) {
        for (Livro livro : listaLivros) {
            if (livro.getCodigo() == codigo) {
                return livro;
            }
        }
        return null;
    }

    public void deletarLivro(Livro livro){
        listaLivros.remove(livro);
    }


}
