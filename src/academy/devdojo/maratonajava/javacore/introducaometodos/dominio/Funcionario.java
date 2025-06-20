package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media = 0;

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
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;

        System.out.println("Média do salario: " + media);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
}
