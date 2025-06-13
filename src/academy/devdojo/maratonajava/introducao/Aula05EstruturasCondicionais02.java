package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 categoria infantil;
        // idade >= 15 e idade < 18 categoria juvenil;
        // idade >= 18 categoria adulta
        int idade = 17;
        // variaveis locais precisam ser inicializadas, pois para serem utilizadas tem que existir
        // se eu tentasse printar o categoria sem o else, daria erro, pq existe a possibilidade dele n ser inicializado,
        // logo, tem que abranger todas as possibilidade
        String categoria;
        if(idade < 15){
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }
        System.out.println(categoria);
    }
}
