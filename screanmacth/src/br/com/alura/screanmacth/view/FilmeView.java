package br.com.alura.screanmacth.view;

import br.com.alura.screanmacth.model.Filme;

import java.util.Scanner;

public class FilmeView {

    Filme filme = new Filme();

    Scanner inserir = new Scanner(System.in);

    public void getFilmes(){
        System.out.print("Qual o nome do filme? ");
        filme.setNome(inserir.next());
        System.out.print("Qual o ano de lançamneto? ");
        filme.setAnoDeLancamento();
        System.out.print("Qual a duração em minutos? ");
        filme.setDuracaoEmMinutos(inserir.nextInt());
        System.out.print("Diretor: ");
        filme.setDiretor(inserir.next());

        filme.exibeFichaTecnica();
        filme.avaliacao(8);
        filme.avaliacao(5);
        filme.avaliacao(7);
        System.out.println();
        System.out.println("Total de Avaliações: " + filme.getTotalDeAvaliacoes());
        System.out.println("Média de Avaliações: " + filme.mediaAvaliacoes());
    }


}
