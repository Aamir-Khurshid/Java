import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  float number = input.nextFloat(); // int value can be passed in float but not vice versa
        int number = (int)(76.8f);
        System.out.println(number);

        int a = 258;
        byte b = (byte)a; // result is 2 the remainder as byte can only store upto 256
        System.out.println(b);

        byte aa =30;
        byte bb = 56;
        byte bbb= 38;
        int aaa = (bbb+bb)/aa;
        System.out.println(aaa);


    }
}
