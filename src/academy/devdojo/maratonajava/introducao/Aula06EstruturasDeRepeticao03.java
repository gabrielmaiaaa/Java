package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    public static void main(String[] args) {
        // imprimir os 25 primeiros numeors
        int valorMax = 50;
        for(int i=0; i<=valorMax; i++){
            if(i > valorMax/2){
                break;
            }
            System.out.println(i);
        }
    }
}
