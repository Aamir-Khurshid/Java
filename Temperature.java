import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Please enter temp in celcius");
        float celcius = n.nextFloat();
        float farenheit = (celcius *9/5) +32;
        System.out.println(farenheit);
    }
}
