import java.util.Scanner;

public class Fibonacci {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            int b = in.nextInt();
            int c;
            System.out.print("Enter the number of times you wanna run the fibonacci series");
            int n =  in.nextInt();
            int i = 0;
            System.out.println(a);
            System.out.println(b);
            while( i <= n ){
                c = a+b;
                a = b;
                b = c;
                System.out.println(c);
                i++;
            }
    }
}
