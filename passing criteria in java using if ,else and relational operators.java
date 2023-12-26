import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m1,m2,m3;
        System.out.println("Enter your mark in physics");
        m1=sc.nextInt();
        System.out.println("Enter your mark in maths");
         m2=sc.nextInt();
        System.out.println("Enter your mark chemistry");
         m3=sc.nextInt();
        float avg =(m1+m2+m3)/3.0f;
        System.out.println("your overall percentage is "+avg);
        if (avg>=44 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("you are passed ");
        }
        else{
            System.out.println(" sorry you are not passed");
        }
    }
}
