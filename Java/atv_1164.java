import java.util.Scanner;

public class atv_1164 {

    final static Scanner input = new Scanner(System.in);

    public static void main (String[]args){

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++){

            String numero = input.nextLine();

            int contLeds = 0;

            for (int j = 0; j < numero.length(); j++){

                char letra = numero.charAt(j);

                if(letra == '1'){
                    contLeds += 2;
                }
                else if(letra == '2' || letra == '5' || letra == '3'){
                    contLeds += 5;
                }
                else if(letra == '4'){
                    contLeds += 4;
                }
                else if(letra == '6' || letra == '9' || letra == '0'){
                    contLeds += 6;
                }
                else if(letra == '7'){
                    contLeds += 3;
                }
                else if(letra == '8'){
                    contLeds += 7;
                }
            }

            System.out.println(contLeds + " leds");
        }
    }
}
