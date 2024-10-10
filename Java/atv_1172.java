import java.util.Scanner;

public class atv_1172 {

    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int x[] = new int[10];
        
        for(int i = 0; i < x.length; i++){
            x[i] = LER.nextInt();
        }
        for(int i = 0;i < x.length;i++){
            if(x[i] <= 0){
                x[i] = 1;
            }
        }
        for(int i = 0;i < x.length;i++){
            System.out.println("X["+i+"] = "+x[i]);
        }
    }
    
}
