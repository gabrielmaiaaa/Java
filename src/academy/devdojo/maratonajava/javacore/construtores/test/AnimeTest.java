package academy.devdojo.maratonajava.javacore.construtores.test;

import academy.devdojo.maratonajava.javacore.construtores.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Pokes", "TV", 423, "Ação", "Seila");
//        anime.init("Pokemon", "TV", 423, "Ação");
        anime.imprime();
    }
}
