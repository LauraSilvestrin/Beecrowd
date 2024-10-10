import java.util.Scanner;

public class atv_1583{
    final static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        

    while(true){
        String aux[] = input.nextLine().split(" ");
        int n = Integer.parseInt(aux[0]);
        int m = Integer.parseInt(aux[1]);
        if (n == 0 && m == 0){
            break;
        }

        char [][] mat = new char [n][m];

        for (int i = 0; i < n; i++){
            String linha = input.nextLine();
            for (int j = 0; j < m; j++){
                mat[i][j] = linha.charAt(j);
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){


                if (mat[i][j]== 'T'){
                    dfs(i, j, mat, m , n);
                }

            }    
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    }

    public static void dfs(int i, int  j, char[][]mat, int m, int n){

        mat[i][j] = 'T';

        if (i > 0 && mat[i-1][j] == 'A'){
            dfs(i-1, j, mat, m, n);
        }
        if (j < m-1 && mat[i][j+1] == 'A'){
            dfs(i, j+1, mat, m, n);
        }
        if (i < n-1 && mat[i+1][j] == 'A'){
            dfs(i+1, j, mat, m, n);
        }
        if (j > 0 && mat[i][j-1] == 'A'){
            dfs(i, j-1, mat, m, n); 
        } 

    }
}