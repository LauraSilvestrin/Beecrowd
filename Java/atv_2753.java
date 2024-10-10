import java.util.Scanner;

public class atv_2753 {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String[] alfabeto = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r","s", "t", "u", "v", "w", "x", "y", "z" };
        int numero = 97;

        for (int i = 0; i < alfabeto.length; i++) {
            String letra = alfabeto[i];
            System.out.println(numero + " e " + letra);
            numero += 1;
        }
    }
}