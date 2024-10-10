import java.io.IOException;
import java.util.Scanner;

public class atv_1234 {

    final static Scanner input = new Scanner(System.in);

    public static void main (String[] args) throws IOException {

        while (input.hasNext()){
            int cont = 1;

            String texto = input.nextLine();
            String newtxt = "";

            for (int i = 0; i < texto.length(); i++){
                if (texto.charAt(i) != ' '){
                    if (cont % 2 != 0){
                        String novoTexto = texto.toUpperCase();
                        newtxt += novoTexto.charAt(i);
                        cont++;
                    }
                    else{
                        String novoTexto = texto.toLowerCase();
                        newtxt += novoTexto.charAt(i);
                        cont++;
                    }
                }
                else{
                    newtxt += texto.charAt(i);
                }
            }
            System.out.println(newtxt);
        }
    }
}
