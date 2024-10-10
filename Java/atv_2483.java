import java.util.Scanner;

public class atv_2483 {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n = input.nextInt();
        String nat = "Feliz nat";

        for (int i = 0; i < n; i++) {
            nat += "a";
        }

        System.out.println(nat + "l!");
    }
}