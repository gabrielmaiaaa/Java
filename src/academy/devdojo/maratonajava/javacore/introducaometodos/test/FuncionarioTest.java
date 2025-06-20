package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

import java.util.Scanner;

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
