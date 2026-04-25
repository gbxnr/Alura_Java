package br.com.alura.java.screenmatch.modelos;

import br.com.alura.java.screenmatch.cauculo.Classificavel;



public class Filme extends Titulo implements Classificavel {

    private String diretor;
   

    public Filme(String nome, int anoDeLancamento){
       super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao(){
        return (int) pegaMedia() / 2;
        
    }

    // aqui ele vai esta falando na hora de rodar o nome do filme e tbm o ano de lancamento
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }

}

