import java.util.ArrayList;
import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int arr[][][] = new int[5][5][5];

        for(int i = 0; i < n; i++){
          int x = sc.nextInt();
          int y = sc.nextInt();
          int z = sc.nextInt();
          for(int j = 0; j<5; j++){
            if(arr[j][y][z] == 0){
              sum++;
              arr[j][y][z] = 1;
            }
            if(arr[x][j][z] == 0){
              sum++;
              arr[x][j][z] = 1;

            }
            if(arr[x][y][j] == 0){
              sum++;
              arr[x][y][j] = 1;
            }

          }
        }
        System.out.println(sum);
        }
 }       
