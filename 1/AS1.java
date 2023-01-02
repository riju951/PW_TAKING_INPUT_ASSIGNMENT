import java.util.Scanner;

public class AS1{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,Rollno and Field of Interest");
        String name1 = sc.next();
        String name2 = sc.next();
        int rollno = sc.nextInt();
        String interest = sc.nextLine();
        System.out.print("Name:" + name1);
        System.out.println(" "+name2);
        System.out.println("Rollno:" + rollno);
        System.out.println("Interest:" + interest);
        }
}