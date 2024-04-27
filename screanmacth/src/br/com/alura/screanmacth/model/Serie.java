package br.com.alura.screanmacth.model;

import br.com.alura.screanmacth.calculos.Classificavel;

public class Serie extends Titulo implements Classificavel {

    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpsodio;
    private int totalVisualizacoes;

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada(int i) {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }

    @Override
    public int getDuracaoEmMinutos() {

        return temporadas * episodiosPorTemporada * minutosPorEpsodio;
    }

    @Override
    public int getClassificacao() {
        if(totalVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }

    }
}
