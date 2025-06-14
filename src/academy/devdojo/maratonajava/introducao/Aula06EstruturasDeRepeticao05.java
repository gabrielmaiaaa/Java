package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // dado o valor do carro, quantas parcelas podem ser feitas, levando em conta que cada parcela pode ter 1000 conto
        double valorCarro = 60000;
        for(int i= (int) valorCarro; i>=1; i--){
            double valorParcela = valorCarro/i;
            if(valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela: "+i+ " com valor R$"+valorParcela);
        }
    }
}
