package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
//         imprimir todos os números pares de 0 a 100000
        for(int i=0; i<=100000; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        // forma mais simples
        for(int i=0; i<=100000; i+=2){
            System.out.println(i);
        }
    }
}
