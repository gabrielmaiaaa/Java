package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] arg){
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Brasileirao");

        jogador.setTime(time);

        jogador.imprime();
    }
}
