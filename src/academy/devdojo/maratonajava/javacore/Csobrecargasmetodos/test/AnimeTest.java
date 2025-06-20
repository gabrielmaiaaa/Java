package academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargasmetodos.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Pokemon", "TV", 423, "Ação");
        anime.imprime();
    }
}
