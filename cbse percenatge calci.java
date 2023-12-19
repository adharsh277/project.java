import java.util.Scanner;
class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("AISSCE CBSE BOARD PERCENTAGE CALCULATOR");
        System.out.println("Enter your name :");
        String name=sc.next();
        System.out.println("Enter the mark of Registration Number :");
        int num =sc.nextInt();
        System.out.print("Enter the total marks of this exam: ");
        int total_marks = sc.nextInt();
        System.out.println("Enter the mark of English :");
        int a =sc.nextInt();
        System.out.println("Enter the mark of Information practice :");
        int b =sc.nextInt();
        System.out.println("Enter the mark of Chemistry :");
        int c =sc.nextInt();
        System.out.println("Enter the mark of Maths:");
        int d =sc.nextInt();
        System.out.println("Enter the mark of Physics :");
        int e =sc.nextInt();
        int sum=(a+b+c+d+e);
        float per = sum*100/(total_marks*5);
        System.out.println(name +"have been awarded with "+per+" % in AISSCE BOARDS");
    }
}
