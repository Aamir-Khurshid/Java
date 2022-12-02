import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
       for(int i = 0; i < n;i++){
            System.out.print(i +" ");
        }
       while(n <= 100){
            System.out.print(n +" ");
            n++;
        }
        do{
            System.out.print(n +" ");
            n++;
        }while(n <= 100);
    }
}
