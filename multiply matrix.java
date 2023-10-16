import java.util.Scanner;

public class midterm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int[][] arr1 = new int[r1][c1];

    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int[][] arr2 = new int[r2][c2];
   if(c1==r2){
    for (int i = 0; i < r1; i++) {
      for (int j = 0; j < c1; j++) {
        arr1[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < r2; i++) {
      for (int j = 0; j < c2; j++) {
        arr2[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < r1; i++) {
      for (int k = 0; k < r1; k++) {
        int sum = 0;
        for (int j = 0; j < c1; j++) {
          sum += arr1[i][j] * arr2[j][k];
        }
        System.out.println(sum);
      }
    }
  }
  else{
    System.out.println("nope");
  }

  }
}