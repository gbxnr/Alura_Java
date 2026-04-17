package br.com.alura.java.screenmatch.modelos;
import br.com.alura.java.screenmatch.cauculo.Classificavel;


public class Episodios implements Classificavel {
    private int numero;
    private String nome;
    private Serie serie;
    private int totalVizualizacoes;
    
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

    
    public int getTotalVizualizacoes() {
        return totalVizualizacoes;
    }
    public void setTotalVizualizacoes(int totalVizualizacoes) {
        this.totalVizualizacoes = totalVizualizacoes;
    }
    @Override
    public int getClassificacao() {
        if (totalVizualizacoes> 100) {
            return 4;
        }else{
            return 2;
        }
        
    }


    
}


