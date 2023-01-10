import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("hello are you teacher or student ?");
        Scanner scanner= new Scanner(System.in);
        System.out.println("1.Teacher");
        System.out.println("2.Student");

        int choice=scanner.nextInt();
       if(choice==2) {
           School sc = new School();
           sc.calculateFees();
       }
}}