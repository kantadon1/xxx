import java.util.*;
public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][] = new int[x][y];
        
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int maxi=-1;
        int maxj=-1;
        for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                int sum = 0;
                if (arr[i][j] == 0){
                    if (j != 0){
                        sum += arr[i][j-1]; //left
                    }
                    if (j != y-1){
                        sum += arr[i][j+1]; //right
                    }
                    if (i != 0){
                        sum += arr[i-1][j]; //top
                    }
                    if (i != x-1){
                        sum += arr[i+1][j]; //bottom
                    }
                    if (i != 0 && j != 0){
                        sum += arr[i-1][j-1]; //left top
                    }
                    if (i != 0 && j != y-1){
                        sum += arr[i-1][j+1]; //right top
                    }
                    if (i != x-1 && j != 0){
                        sum += arr[i+1][j-1]; //left bottom
                    }
                    if( i != x-1 && j!= y-1){
                        sum += arr[i+1][j+1]; //right bottom
                    }
                }
                if (sum > max){
                    max = sum;
                    maxi = i;
                    maxj = j;
                }
            }
        }
        if(maxi== -1 && maxj == -1){
            System.out.print("cannot place springer");
            return;
        }
        
         for (int i = 0; i < x; i++){
            for (int j = 0; j < y; j++){
                if (i == maxi && j == maxj){
                    System.out.print("x"+ " ");
                }else {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
    }
}