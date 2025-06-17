package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.name = "Julio";
        professor.age = 34;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.name + ". Idade: " + professor.age + ". Sexo: " + professor.sexo);
    }
}
