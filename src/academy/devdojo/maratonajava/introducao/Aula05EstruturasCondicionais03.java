package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salario = 5500;
        String vouDoar = "Vou doar 500";
        String naoVouDoar = "Não vou doar";
        // para realizar operador ternaria precisa seguir a senguinte estrutura:
        // (condição) ? (caso verdadeiro) : (caso falso)
        String resultado = salario > 5000 ? vouDoar : naoVouDoar;
        System.out.println(resultado);
    }
}
