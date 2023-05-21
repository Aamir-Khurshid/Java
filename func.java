import java.util.* ;
public class func {
    static int gcd(int x, int y){
        int gcd=1;
        int z;
        if(x<y || x==y){
            z=x;
        }
        else{
            z=y;
        }
        for(int i = 1; i<=z ;i++){
            if(x%i == 0 && y%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String arg[]){
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int result =  gcd(x,y);
        System.out.print(result);
    }
}
