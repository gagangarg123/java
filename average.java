import java.util.*;
class average{
    public static int calaculateAverage(int a,int b,int c){
    int average=(a+b+c)/3;
    return average;
    }
    public static void main(String args[]){
        System.out.println("Enter any three numbers to calculate average of three numbers:");
        Scanner gagan=new Scanner(System.in);
        int a=gagan.nextInt();
        int b=gagan.nextInt();
        int c=gagan.nextInt();

int average=calaculateAverage(a, b, c);
System.out.println("average of three numbers is :"+average);


    }
}

