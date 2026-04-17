package br.com.alura.java.screenmatch.cauculo;


public class FiltroRecomendacoes {
    private String recomendacao;


    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao()>= 4){
            System.out.println("esta entre os preferidos do momento");
        }else if(classificavel.getClassificacao() >=2){
            System.out.println("muito bem avaliado no momneto!");
        }else {
            System.out.println("Coloque na sua lista para asssistir depois");
        }
    }
}
