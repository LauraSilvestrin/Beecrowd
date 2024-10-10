import java.util.Scanner;

public class atv_1180{

    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int n=0;
        n = input.nextInt();

        int x[] = new int[n];
        
        int menor=0;
        int posicao=0;
        
        for(int i = 0; i < n ; i++){
            x[i] = input.nextInt();
            if (i==0){
                menor = x[i];
                posicao= i;
            }

            else if (x[i]<menor){
                menor=x[i];
                posicao=i;
            }
        }

        System.out.println("Menor valor: "+menor);
        System.out.println("Posicao: "+posicao);


        }
    }
