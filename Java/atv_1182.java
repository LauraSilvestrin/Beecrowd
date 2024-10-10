import java.util.Scanner;
public class atv_1182{
    final static Scanner input = new Scanner(System.in);
     public static void main(String[] args) {

        char O = input.next().toUpperCase().charAt(0);

        float[][] matriz = new float[12][12];

        float s = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                matriz[i][j] = input.nextFloat();
            }
        }

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                if (j<i){
                    s += matriz[i][j];
                }
            }
        }

        if (O == 'M'){
            s /= ((matriz.length * matriz.length) - 12) / 2;
            System.out.println(String.format("%.1f", s));
        }
        else{
            System.out.println(String.format("%.1f", s));
        }
    }
}