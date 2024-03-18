//swap two numbers in java
import java.util.*;
class question_1{
    public static void main(String args[]){
        System.out.println("Enter any two numbers two swap the values:");
        Scanner gagan=new Scanner(System.in);
        int a=gagan.nextInt();
        int b=gagan.nextInt();
        System.out.println("The value of a before swapping is :"+a);
        System.out.println("The value of b before swapping is :"+b);
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("The Value Of a After Swapping is:"+a);
        System.out.println("The Value Of b After Swapping is:"+b);

    }
}
