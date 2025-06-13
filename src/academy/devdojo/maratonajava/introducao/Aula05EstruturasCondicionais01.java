package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        // !
        boolean isSleep = false;
        if(isSleep){
            System.out.println("Slepp");
        }
        if(!isSleep){
            System.out.println("Not sleep");
        }
        // or
        if(isSleep){
            System.out.println("Slepp");
        } else if(!isSleep){
            System.out.println("Not sleep");
        }
        // or
        if(isSleep){
            System.out.println("Slepp");
        } else{
            System.out.println("Not sleep");
        }
    }
}
