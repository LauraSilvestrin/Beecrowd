import java.util.Scanner;

public class atv_1083 {
    final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int hora_start = input.nextInt();
        int minu_start = input.nextInt();
        int all_minu_start = hora_start * 60 + minu_start;

        int hora_end = input.nextInt();
        int minu_end = input.nextInt();
        int all_minu_end = hora_end * 60 + minu_end;

        int all_minu_dif = (24 * 60 - all_minu_start) + all_minu_end;

        int horas = all_minu_dif / 60;
        int minutos = all_minu_dif % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        }
        ;

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
    }
}
