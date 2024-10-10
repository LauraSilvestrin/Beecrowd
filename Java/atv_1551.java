import java.util.Scanner;

public class atv_1551 {

    final static Scanner input = new Scanner(System.in);

    public static void main (String[] args)  {

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++){

            String texto = input.nextLine();

            final char[] alfabeto = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

            int cont = 0;
            
            for (int a = 0; a < alfabeto.length; a++){

                for (int t = 0; t < texto.length(); t++) {
                    if (alfabeto[a] == texto.charAt(t)) {
                        cont++;
                        break;
                    }
                }
            }

            if (cont == 26){
                System.out.println("frase completa");
            }
            else if(cont > 13 && cont < 26){
                System.out.println("frase quase completa");
            }
            else{
                System.out.println("frase mal elaborada");
            }
        }
    }
}
