import java.math.BigDecimal;
import java.util.Scanner;

public class atv_1120 {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            
            String d = input.next();
            String n = input.next();

            if (d.equals("0") && n.equals("0")) {
                break;
            }
            
            String newN = "";

            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) != d.charAt(0)) {
                    newN += n.charAt(i);
                }
            }
            
            if (newN.equals("")){
                System.out.println("0");
            }
            
            else if (newN.length() > 5){
                BigDecimal bigDec = new BigDecimal(newN);

                System.out.println(bigDec);
            }
            
            else{
                int inteiro = Integer.parseInt(newN);

                System.out.println(inteiro);
            }
            
        }

    }
}