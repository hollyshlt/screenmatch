package br.com.alura.screenmatch.Principal;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The matrix", 1999);
        favorito.avalia(9);
        Filme outroFavorito = new Filme("O poderoso chefão", 1972);
        outroFavorito.avalia(10);
        var filmeDoRafael = new Filme("Dogville", 2003);
        filmeDoRafael.avalia(9);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoRafael);
        lista.add(favorito);
        lista.add(outroFavorito);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() >2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }
    }
    
}
