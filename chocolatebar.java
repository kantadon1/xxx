import java.util.Scanner;

public class chocolatebar{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int row = sc.nextInt();
    int colum = sc.nextInt();
    int rep = sc.nextInt();
    int numrep = (row*colum)/3;
    int use = rep;
    int a = 0;
    int m =1;

    while (numrep > 0){
        rep = use;
        while(rep > 0){
          if(m > 9){
            System.out.print(m%10);
            a++;
          }
          else{
            System.out.print(m);
            a ++;
          }
          if(a == colum){
            System.out.println();
            a = 0;
          }
          rep--;
        }
        m++;
        numrep--;
    }
  }
}