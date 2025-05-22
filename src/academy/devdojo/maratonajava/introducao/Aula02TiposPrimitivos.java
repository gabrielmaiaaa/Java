package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args){
        // int, double, float, char, byte, short, long, boolean
        int age = 10;
        double salarioDouble = 2000.25;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'a';

        // casting = força um valor caber num tipo que não tem bytes suficientes ou é de formatos diferentes
        int soma = (int) 125.60;
        int idade = (int) 57384732647832486L;

        // aspas duplo para palavras e aspas simples para caracteres
        String name = "Julio";


        System.out.println(age);
    }
}
