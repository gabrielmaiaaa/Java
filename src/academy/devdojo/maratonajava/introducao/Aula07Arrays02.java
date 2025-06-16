package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // tipos e oq é armazenado na memoria quando vc inicializa sem nada
        // byte, short, int, float e double -> inicializam em 0
        // char -> '\u0000' q é ' '
        // boolean -> false
        // String -> null
        boolean[] idade = new boolean[3];

        for (int i = 0; i < idade.length; i++) {
            System.out.println(idade[i]);
        }
    }
}
