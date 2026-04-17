import br.com.alura.java.screenmatch.cauculo.cauculadoraDeTempo;
import br.com.alura.java.screenmatch.modelos.Filme;
import br.com.alura.java.screenmatch.modelos.Serie;

public class Principal{
    public static void main(String[] args) {

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


       Serie lost = new Serie();
       lost.setNome("Lost");
       lost.setAnoDeLancamento(2000);
       lost.exibeFichaTecnica();
       lost.setTemporadas(10);
       lost.setEpisodiosPorTemporadas(10);
       lost.setDuracaoEmMInutos(50);
       System.out.println("duração da serie: " + lost.getDuracaoEmMInutos());


        Filme outroFilme = new Filme();
        outroFilme.setNome("avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMInutos(200);


       cauculadoraDeTempo caulcuadora = new cauculadoraDeTempo();
       caulcuadora.inclui(meuFilme);
       caulcuadora.inclui(outroFilme);
       caulcuadora.inclui(lost);
       System.out.println( caulcuadora.getTempoTotal());




    }
}