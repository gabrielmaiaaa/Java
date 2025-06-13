package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 25000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double imposto;
        if(salario <= 34712) {
            imposto = salario * primeiraTaxa;
        } else if (salario > 34712 && salario <= 68507) {
            imposto = salario * segundaTaxa;
        } else {
            imposto = salario * terceiraTaxa;
        }
        System.out.println(imposto);
    }
}
