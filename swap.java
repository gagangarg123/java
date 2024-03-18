import java.util.*;
class question_1{
    public static void main(String args[]){
        System.out.println("Enter any two numbers:");
        Scanner gagan=new Scanner(System.in);
        int a=gagan.nextInt();
        int b=gagan.nextInt();
        System.out.println("the value of a before swapping is"+a);
        System.out.println("the value of a before swapping is"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("the value of a after swapping is"+a);
        System.out.println("the value of b after swapping is"+b);

    }
}
