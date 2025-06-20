package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        // Tipo [] nome = novo Tipo[qtd]
        Carro[] carros = new Carro[2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            carros[i] = new Carro();
            System.out.print("Nome: ");
            carros[i].nome = scanner.nextLine();
            System.out.print("Modelo: ");
            carros[i].modelo = scanner.nextLine();
            System.out.print("Ano: ");
            carros[i].ano = scanner.nextInt();
            scanner.nextLine(); // coloquei essa linha para conseguir dar Enter
        }

        int i = 0;
        for (Carro car : carros) {
            i++;
            System.out.println("Carro " + i);
            System.out.println("Nome: " + car.nome + ". Modelo: " + car.modelo + ". Ano: " + car.ano);
            System.out.println();
        }
    }
}
