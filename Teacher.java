import java.util.Scanner;

public class Teacher {
    private String teacherName;
    private int teacherId;
    private double salary;
private Scanner scanner= new Scanner(System.in);


    public Teacher(String teacherName, int teacherId) {
        this.teacherName = teacherName;
        this.teacherId = teacherId;
    }
    public double getSalary(){
        System.out.println("what subject teacher are you?");
        String subject=scanner.next();

            if(subject.equalsIgnoreCase("maths"))
                salary=10000;
            if(subject.equalsIgnoreCase("english"))
               salary=8000;
            else
                 salary=12000;


       return salary;
    }

}
