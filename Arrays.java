import java.util.*;
class Arrays{
    public static void main(String args[]){
        Scanner gagan=new Scanner(System.in);
        int size=gagan.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++){
            marks[i]=gagan.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(marks[i]);
        }
    }
}
