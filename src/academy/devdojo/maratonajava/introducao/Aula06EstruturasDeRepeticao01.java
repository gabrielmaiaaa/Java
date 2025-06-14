package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;
        while(count<10){
            System.out.println(count);
            count++;
        }

        for (count = 0; count < 10; count++){
            System.out.println(count);
        }

        do{
            System.out.println(count);
            count++;
        } while (count<20);
    }
}
