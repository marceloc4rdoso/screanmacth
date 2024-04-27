package br.com.alura.screanmacth.calculos;

import br.com.alura.screanmacth.model.Titulo;

public class CalculadoraDeTempo {

    public int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
