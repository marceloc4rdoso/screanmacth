import br.com.alura.screanmacth.calculos.FiltroRecomendacao;
import br.com.alura.screanmacth.model.Episodio;
import br.com.alura.screanmacth.view.FilmeView;
import br.com.alura.screanmacth.view.SerieView;

public class Principal {
    public static void main(String[] args) {

        FilmeView filmes = new FilmeView();
        SerieView series = new SerieView();
        Episodio episodio = new Episodio();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        //filmes.getFilmes();
        series.getSeries();
        episodio.setNome("Bagaceira");
        episodio.setNumero(3);
    }
}
