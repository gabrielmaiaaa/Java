package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.dominio.Pessoa;

public class PublicTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(21);
        pessoa.setNome("Pedro");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
