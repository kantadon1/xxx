import java.util.*;

public class cscm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.nextLine();
        String[] arrstr = w.split(" ");
        int a = arrstr.length;
        int[] arrint = new int[a];
        int k = 0;

        for (int i = 0; i < a; i++) {
            arrint[i] = Integer.parseInt(arrstr[i]);
        }

        Arrays.sort(arrint);
        for (int i = 0; i < a; i++) {
            while (arrint[i] < arrint[a / 2]) {
                arrint[i]++;
                k++;
            }
            while (arrint[i] > arrint[a / 2]) {
                arrint[i]--;
                k++;
            }
        }
        System.out.println(k);

    }
}
