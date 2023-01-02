import java.util.Scanner;

public class As3 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three subjects marks: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int total = a+b+c;
        float p = total/3;
        System.out.println("Total marks " + total);
        System.out.println("Percentage : " + p);
    }
}
