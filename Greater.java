import java.util.*;
public class Greater {
    public static void main (String args[]){
        Scanner gagan=new Scanner(System.in);
        int a=gagan.nextInt();
        int b=gagan.nextInt();
        if(a==b){
            System.out.println("a is equal to b");
        }
        else if(a>b){
            System.out.println("a is greater than b");
        }
        else{
            System.out.println("b is greater than a ");
        }
    }
    
}

