import java.util.*;
public class question_1 {
    public static void main(String args[]){
        System.out.println("Enter your Age?");
        Scanner gagan=new Scanner(System.in);
        int age=gagan.nextInt();
        if(age<18){
            System.out.println("YOU ARE NOT ELIGIBLE FOR VOTE!");
        }
        else{
            System.out.println("YOU ARE ELIGIBLE FOR VOTING!");
        }

    }
    
}

