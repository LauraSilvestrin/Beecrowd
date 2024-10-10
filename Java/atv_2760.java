import java.util.Scanner;

public class atv_2760 {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        String a = input.nextLine();
        String b = input.nextLine();
        String c = input.nextLine();

        System.out.println(a + b + c);
        System.out.println(b + c + a);
        System.out.println(c + a + b);

        if (a.length() > 10) {
            System.out.print(a.substring(0, 10));
        } else {
            System.out.print(a);
        }

        if (b.length() > 10) {
            System.out.print(b.substring(0, 10));
        } else {
            System.out.print(b);
        }

        if (c.length() > 10) {
            System.out.println(c.substring(0, 10));
        } else {
            System.out.println(c);
        }

    }
}
