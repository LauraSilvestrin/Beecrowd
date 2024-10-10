import java.util.Scanner;

public class atv_1175 {

    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n[] = new int[20];
        
        int aa=0;
        
        for(int i = 0; i < n.length; i++){
            n[i] = input.nextInt();
        }

        for(int i = 0; i < n.length/2; i++){
                aa=n[i];
                n[i] = n [(n.length-1)-i] ;
                n[n.length-1-i]=aa;
                
        }
        for(int i = 0;i < n.length;i++){
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
}