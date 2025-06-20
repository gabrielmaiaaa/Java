package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // Bloco de Inicialização
    // sempre inicializa primeiro que qualquer coisa, até do construtor
    // pode ser colocado onde que quiser
    static {
        System.out.println("Bloco de inicialização estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }
    static {
        System.out.println("Bloco de inicialização estático 2");
    }
    static {
        System.out.println("Bloco de inicialização estático 3");
    }
    {
        System.out.println("Bloco de inicialização não estático");
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){
        for(int episodio : Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
