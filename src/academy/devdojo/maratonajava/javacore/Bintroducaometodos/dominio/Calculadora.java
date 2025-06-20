package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void soma() {
        System.out.println(10 + 2);
    }

    public void subtracao() {
        System.out.println(25 - 9);
    }

    public void multiplicacao(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divisao(double num1, double num2) {
        return num2 == 0 ? 0 : num1 / num2;
    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int valoresAntes, int... numeros) {
        int soma = 0;
        for (int temp : numeros) {
            soma += temp;
        }
        System.out.println(soma);
    }
}
