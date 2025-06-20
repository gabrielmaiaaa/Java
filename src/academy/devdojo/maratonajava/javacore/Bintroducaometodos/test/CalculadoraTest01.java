package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String... args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        calculadora.multiplicacao(21, 54);
        System.out.println(calculadora.divisao(12, 3));

        System.out.println("------------");
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
