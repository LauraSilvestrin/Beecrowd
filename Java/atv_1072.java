import java.util.Scanner;
public class atv_1072{
    final static Scanner input = new Scanner(System.in);
    public static void main (String[]args){
        
        int n = input.nextInt();
        int fora = 0;
        int dentro = 0;
        int x = 0;
        for (int i = 0; i < n; i++){
            x = input.nextInt();
            if (x >= 10 && x <= 20){
                dentro++;
            }
            else{
                fora++;
            }
        }
        
        System.out.println(dentro + " in");
        System.out.println(fora + " out");
        
    }
}
