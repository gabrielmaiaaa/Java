package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Estudante {
    public String name;
    public int age;
    public char sexo;

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.sexo);
        System.out.println(this.age);
    }
}
