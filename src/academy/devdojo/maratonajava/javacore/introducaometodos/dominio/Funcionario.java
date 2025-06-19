package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if(salarios == null){
            return;
        }
        for (double salario : salarios) {
            System.out.println("Salario: " + salario);
        }
    }

    public void imprimeMediaSalario() {
        if(salarios == null){
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média do salario: " + media);
    }
}
