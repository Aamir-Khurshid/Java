import java.util.Scanner;

public class Conditional {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter your current salary");
        int salary = input.nextInt();
        /*     int salary = 25000;

       if(salary>10000)
          {
            salary = salary+2000;
        }
        else
        {
            salary = salary+1000;
        }   */
        if(salary>20000){
            salary += 3000;
        }
        else if(salary>10000){
            salary += 2000;
        }
        else{
            salary += 1000;
        }
        System.out.println("Now your salary will be : " + salary);
        }
}
