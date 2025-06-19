package academy.devdojo.maratonajava.javacore.introducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.name);
        System.out.println(estudante.age);
        System.out.println(estudante.sexo);
        System.out.println(estudante);
//        Se eu alterar o dado do objeto, ele vai realmente ser alterado no objeto base (na função onde foi chamado).
    }
}
