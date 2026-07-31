package main.java.br.com.bibliotecaJava.view;

import main.java.br.com.bibliotecaJava.model.Livro;
import main.java.br.com.bibliotecaJava.service.BibliotecaService;

import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);
    private BibliotecaService service = new BibliotecaService();

    public void iniciar(){
        int opcao;
        do{
            System.out.println("------- Biblioteca XD --------");
            System.out.println("| 1 - cadastrar livro");
            System.out.println("| 2 - Listar livros");
            System.out.println("| 3 - Mostrar livro pelo ID");
            System.out.println("| 4 - Deletar livro");
            System.out.println("| 5 - Realizar emprestimo");
            System.out.println("| 6 - Realizar devolução");
            System.out.println("| 0 - Sair");
            System.out.println("-----------------------------");

            System.out.println("Opção: ");
            opcao = leitura.nextInt();
            leitura.nextLine();

            switch(opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    listarLivros();
                    break;
                case 3:
                    imprimeLivro();
                    break;
                case 4:
                    deletarLivro();
                    break;
                case 5:
                    emprestarLivro();
                    break;
                case 6:
                    devolverLivro();
                    break;

                default:
                    System.out.println("opção invalida XD");
            }

        }while(opcao != 0);
    }

    private Livro buscaCodigoLivro(){
        System.out.println("Informe o codigo: ");
        int leituracodigo = leitura.nextInt();
        leitura.nextLine();

        Livro livrobuscado = service.buscarPorCodigo(leituracodigo);
        return livrobuscado;
    }

    public void emprestarLivro(){
        Livro livro = buscaCodigoLivro();
        if (livro != null) {
           service.emprestarLivro(livro);
        } else {
            System.out.println("livro não encontrado");
        }
    }

    public void devolverLivro(){
        Livro livro = buscaCodigoLivro();
        if (livro != null) {
            service.devolverLivro(livro);
        } else {
            System.out.println("livro não encontrado");
        }
    }


    public void imprimeLivro(){
        Livro livro = buscaCodigoLivro();
        if(livro != null){
            System.out.println(livro.toString());
        } else{
            System.out.println("livro não encontrado");
        }
    }

    private void cadastrarLivro(){
        int codigo = 0;
        while (true){
            System.out.println("código: ");
            codigo = leitura.nextInt();
            Livro livroDeBusca = service.buscarPorCodigo(codigo);
            if(livroDeBusca != null){
                if(livroDeBusca.getCodigo() == codigo){ /*ver pois não precisa*/
                    System.out.println("Código já usado ");
                }
            }else{
                break;
            }
        }
        leitura.nextLine();

        System.out.print("Título: ");
        String titulo = leitura.nextLine();

        System.out.print("Autor: ");
        String autor = leitura.nextLine();

        int ano = 0;
        while(ano < 1800 || ano > 2030){
            System.out.print("Ano: ");
            ano = leitura.nextInt();
            if(ano < 1800 || ano > 2030){
                System.out.println("Informe um ano válido ");
            }
        }
        leitura.nextLine();

        service.cadastrarLivro(codigo, titulo, autor, ano);
    }

    private void listarLivros(){
        service.listarLivros();
    }

    private void deletarLivro() {
        Livro livro = buscaCodigoLivro();
        if (livro != null) {
            service.deletarLivro(livro);
        } else {
            System.out.println("livro não encontrado");
        }
    }

    }
