package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Julios");
        funcionario.setIdade(32);
        funcionario.setSalarios(new double[]{1251, 2655, 9261});

        funcionario.imprime();

        funcionario.imprimeMediaSalario();
    }
}
