import java.util.Scanner;
public class atv_1074{
    final static Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        
        int n = input.nextInt();
        int x = 0;
        for (int i = 0; i < n; i++){
            x = input.nextInt();
            if (x == 0){
                System.out.println("NULL");
            }
            else if (x % 2 == 0){
                System.out.print("EVEN ");
            }
                else{
                    System.out.print("ODD ");
            }
            if (x > 0){
                System.out.println("POSITIVE");
            }
            if (x < 0){
                System.out.println("NEGATIVE");
            }
        
    }
}
}
