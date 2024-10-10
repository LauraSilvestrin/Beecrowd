import java.util.Scanner;
public class atv_1174{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        float[] A = new float[100];
        
        for(int i = 0; i < 100; i++){
            A[i] = LER.nextFloat();
            
        }
        
        for(int i = 0; i < 100; i++){
            if(A[i] <= 10){
                System.out.printf("A[%d] = %.1f\n",i,A[i]);
            }
        }
    }
    }
    

