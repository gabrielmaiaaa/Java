package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Julios";
        funcionario.idade = 37;
        funcionario.salarios = new double[]{1251,2655,9261};

        funcionario.imprime();

        funcionario.imprimeMediaSalario();
    }
}
