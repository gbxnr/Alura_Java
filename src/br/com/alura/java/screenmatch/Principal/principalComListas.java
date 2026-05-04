package br.com.alura.java.screenmatch.Principal;

import br.com.alura.java.screenmatch.modelos.Filme;
import br.com.alura.java.screenmatch.modelos.Serie;
import br.com.alura.java.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class principalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso Chefão", 1970);
        Filme outroFilme = new Filme("avatar", 2023);
        var filmeDOGabriel = new Filme("Kingsman", 2015);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDOGabriel);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item: lista){
            System.out.println(item);
        }

    }
}
