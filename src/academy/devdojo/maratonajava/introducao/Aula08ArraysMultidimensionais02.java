package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[] newArray = {0, 1, 2};
        int[][] array = new int[3][];

        array[0] = new int[2];
        array[1] = newArray;
        array[2] = new int[]{0, 1, 2, 3, 4, 5};

        int[][] arrayInt = {{0, 0}, {0, 1, 2}, {0, 1, 2, 3, 4, 5}};

        for (int[] arrayBase : array) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
