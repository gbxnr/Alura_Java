package br.com.alura.java.screenmatch.cauculo;
import br.com.alura.java.screenmatch.modelos.Titulo;


public class cauculadoraDeTempo {
    private int tempoTotal;

   public int getTempoTotal() {
        return this.tempoTotal;
    }

     /*
    public void inclui(Filme f){
    this.tempoTotal += f.getDuracaoEmMInutos();
}
  public void incluidoNaSerie(Serie s){
    this.tempoTotal += s.getDuracaoEmMInutos();
}
*/ 

public void  inclui(Titulo titulo){
    System.out.println("Adicionando a duração do filme/serie: " + titulo.getNome());
    this.tempoTotal += titulo.getDuracaoEmMInutos();

}


}