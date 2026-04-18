import java.util.ArrayList;

import br.com.alura.java.screenmatch.cauculo.FiltroRecomendacoes;
import br.com.alura.java.screenmatch.cauculo.cauculadoraDeTempo;
import br.com.alura.java.screenmatch.modelos.Episodios;
import br.com.alura.java.screenmatch.modelos.Filme;
import br.com.alura.java.screenmatch.modelos.Serie;

public class Principal{
    public static void main(String[] args) {


        System.out.println("<----------------|inicio|---------------->");
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMInutos(180);
        System.out.println("duração do filme: " + meuFilme.getDuracaoEmMInutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("Total das avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacao = 10;
       // meuFilme.totalDeAvaliacoes = 1;
       System.out.println("----------------<final>----------------");


       System.out.println("<----------------|inicio|---------------->");
       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setAnoDeLancamento(2000);
       lost.exibeFichaTecnica();
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporadas(10);
       lost.setDuracaoEmMInutos(50);
       System.out.println("duração da serie: " + lost.getDuracaoEmMInutos());
       System.out.println("----------------<final>----------------");

        System.out.println("<----------------|inicio|---------------->");
        Filme outroFilme = new Filme();
        outroFilme.setNome("avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMInutos(200);


       cauculadoraDeTempo caulcuadora = new cauculadoraDeTempo();
       caulcuadora.inclui(meuFilme);
       caulcuadora.inclui(outroFilme);
       caulcuadora.inclui(lost);
       System.out.println( caulcuadora.getTempoTotal());




       FiltroRecomendacoes filtro = new FiltroRecomendacoes();
       filtro.filtra(meuFilme);

       Episodios episodios = new Episodios();
       episodios.setNumero(1);
       episodios.setSerie(lost);
       episodios.setTotalVizualizacoes(300);
       filtro.filtra(episodios);

       System.out.println("----------------<final>----------------");


     // Arrays
      var filmeDOGabriel = new Filme();
      filmeDOGabriel.setDuracaoEmMInutos(200);
      filmeDOGabriel.setNome("Kingsman");
      filmeDOGabriel.setAnoDeLancamento(2015);
      filmeDOGabriel.avalia(10);

      ArrayList<Filme> ListaDeFilmes = new ArrayList<>();
      ListaDeFilmes.add(filmeDOGabriel);
      ListaDeFilmes.add(meuFilme);
      ListaDeFilmes.add(outroFilme);

      System.out.println("Tamanho da Lista" + ListaDeFilmes.size());
      System.out.println("Primeiro Filme" + ListaDeFilmes.get(0).getNome());
      System.out.println(ListaDeFilmes);
       System.out.println("toString do FIlme" + ListaDeFilmes.get(0).toString());

    }
}