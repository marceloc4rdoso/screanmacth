package br.com.alura.screanmacth.view;

import br.com.alura.screanmacth.model.Serie;

import java.util.Scanner;

public class SerieView {

    Serie serie = new Serie();

    Scanner inserir = new Scanner(System.in);

    public void getSeries(){
        System.out.println();
        System.out.print("Nome Serie: ");
        serie.setNome(inserir.next());
        System.out.print("Quantas temporadas: ");
        serie.setTemporadas(inserir.nextInt());
        System.out.print("Quantos Episódios por temporada: ");
        serie.setEpisodiosPorTemporada(inserir.nextInt());
        System.out.print("Minutos por episódio: ");
        serie.setMinutosPorEpsodio(inserir.nextInt());

        System.out.println("Serie: " + serie.getNome());
        System.out.println("Quanto tempo para maratonar: " + serie.getNome());
    }

}
