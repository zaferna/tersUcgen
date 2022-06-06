import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, i, k, j;
        System.out.print("n Sayisi Gir :");
        n = inp.nextInt();
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {

                System.out.print(" ");
            }
            for (k = 1; k <= 2 * (n - i)+1; k++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }
}
