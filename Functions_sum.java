import java.util.*;
public class Functions {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String args[]){
        Scanner gagan=new Scanner(System.in);
        int a=gagan.nextInt();
        int b=gagan.nextInt();

        int sum=calculateSum(a,b);

        System.out.println("Sum of 2 numbers is :"+sum);
    }
    
}
