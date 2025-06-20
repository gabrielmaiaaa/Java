package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PublicTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(21);
        pessoa.setNome("Pedro");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
