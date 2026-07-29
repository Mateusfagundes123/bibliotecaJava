package main.java.br.com.bibliotecaJava.view;

import main.java.br.com.bibliotecaJava.service.BibliotecaService;

import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);
    private BibliotecaService service = new BibliotecaService();

    public void iniciar(){
        int opcao;
        do{
            System.out.println("---- Biblioteca XD-----");
            System.out.println(" 1 - cadastrar livro");
            System.out.println(" 2 - Listar livros");

            System.out.println(" 0 - Sair");

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

                default:
                    System.out.println("opção invalida");
            }

        }while(opcao != 0);
    }

    private void cadastrarLivro(){
        System.out.print("Código: ");
        int codigo = leitura.nextInt();
        leitura.nextLine();

        System.out.print("Título: ");
        String titulo = leitura.nextLine();

        System.out.print("Autor: ");
        String autor = leitura.nextLine();

        System.out.print("Ano: ");
        int ano = leitura.nextInt();
        leitura.nextLine();

        service.cadastrarLivro(codigo, titulo, autor, ano);
    }
    private void listarLivros(){
        service.listarLivros();
    }
}
