import java.util.Scanner;

public class atv_1272 {

    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++){

            String texto = input.nextLine();
            String msg = "";

            if (texto.equals(" ")) {
                System.out.println(" ");
            } else {
                if (texto.charAt(0) != ' '){
                    msg += texto.charAt(0);
                }
                for (int j = 1; j < texto.length(); j++) {
                        if (texto.charAt(j) != ' ' ) {
                            if (texto.charAt(j-1) == ' '){
                                msg += texto.charAt(j);
                        }
                    }

                }
            }

            System.out.println(msg);


        }
    }


}