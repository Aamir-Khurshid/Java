import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int roll = input.nextInt();
        System.out.println("Your roll no.is : " + roll);

        float a = input.nextFloat();
        System.out.println("Your average marks is : " + a);

        String aam = input.nextLine();
        System.out.println("Your name is : " + aam);
    }
}
