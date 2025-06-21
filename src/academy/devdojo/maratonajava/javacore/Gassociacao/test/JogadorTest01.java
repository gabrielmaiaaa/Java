package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Jogador jogador2 = new Jogador("Peixe");
        Jogador jogador3 = new Jogador("Jesus");
        Jogador[] jogadors = {jogador1, jogador2, jogador3};

        for(Jogador jogador : jogadors){
            System.out.println(jogador.getNome());
        }
    }
}
