import java.util.*;
public class Switch {
    public static void main(String args[])
    {
    Scanner gagan=new Scanner(System.in);
    int n=gagan.nextInt();
    switch(n)
    {
        case 1:
        System.out.println("You are in india");
        break;
        case 2:
        System.out.println("you are in england");
        break;
        case 3:
        System.out.println("You are in canada");
        break;
        case 4:
        System.out.println("You are in australia");
        break;
        default:
        System.out.println("Invalid Number");
    }
  }
}

