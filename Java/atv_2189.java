import java.util.Scanner;

public class atv_2189 {

    final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        int teste = 0;
        
        while (true) {
            
            int participantes = input.nextInt();
            int ingresso []= new int[participantes];
            
            if (participantes==0){
                    break;
                }
            
            for(int i = 0; i<participantes; i++){
                ingresso[i]=input.nextInt();
            }
            
            for (int i=0; i<participantes; i++){
                if(ingresso[i]==(i + 1)){
                    teste++;
                    System.out.println("Teste "+teste);
                    System.out.println(i + 1);
                    System.out.println();
                    break;
                }
            }
        }
    }
}