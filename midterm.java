import java.util.Scanner;
public class midterm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] arr = new int [r][c];
        int [] com = new int [r];
        int k = 0;

        for(int i = 0; i<r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i<r; i++){
            int s =0;
            for(int j = 0; j < c; j++){
                s = s + arr[i][j];
            }
            com [i] = s;
            
        }

        for(int i = 0; i < r; i++){
            if(i != r-1){
                if(com[i] == com[i+1]){
                k ++;
                }
            }
        }
     System.out.println(k);
     if(k == r-1){
        System.out.println("True");
     }
     else{
        System.out.println("False");
     }

  }
}