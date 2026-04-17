package br.com.alura.java.screenmatch.modelos;
import br.com.alura.java.screenmatch.cauculo.Classificavel;


public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalDeAvaliacoes;
    
    private int somaDasAvaliacoes;
    

    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }
    @Override
    public int getClassificacao() {
        if (totalDeAvaliacoes == 0) {
            return 0;
        }
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }


    
}


