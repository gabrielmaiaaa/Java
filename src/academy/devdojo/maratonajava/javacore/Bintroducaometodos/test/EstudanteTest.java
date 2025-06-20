package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante1 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.name = "Pedro";
        estudante.age = 20;
        estudante.sexo = 'M';

        estudante1.name = "Julio";
        estudante1.age = 43;
        estudante1.sexo = 'M';

        impressora.imprime(estudante);
        impressora.imprime(estudante1);

        System.out.println("########################");

        estudante.imprime();
        estudante1.imprime();
    }
}
