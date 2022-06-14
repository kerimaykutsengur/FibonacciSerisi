import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        int n;
        int a = 0;
        int b = 1;
        int c;

        Scanner input = new Scanner(System.in);
        System.out.print("Eleman sayısını giriniz : ");
        n = input.nextInt();
        System.out.println(a);
        System.out.println(b);

        for (int i = 0; i <=n; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }


    }
}
