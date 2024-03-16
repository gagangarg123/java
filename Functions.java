import java.util.*;
class Functions{
    public static int calculateProduct(int a,int b){
        int Product=a*b;
        return Product;
    }
          public static void main(String args[]){
            Scanner gagan=new Scanner(System.in);
            int a=gagan.nextInt();
            int b=gagan.nextInt();

            int Product=calculateProduct(a, b);
            System.out.println("Product of two numbers is :"+Product);
          }
}
