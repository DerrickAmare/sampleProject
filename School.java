import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private Scanner scanner= new Scanner(System.in);
    private int totalFee=0;
   int subjects[]=new int[3];
    public void callTeacher()
   {
        System.out.println("how many teachers are there?");

        int numOfTeachers= scanner.nextInt();
        String[] teacherNames = new String[numOfTeachers];

        ArrayList<Teacher> teachers= new ArrayList<Teacher>();

        for(int i=0;i<numOfTeachers;i++) {
            System.out.println("please inout teachers name turn bu turn");
            teacherNames[i] = scanner.next();

            int teacherId = (int) Math.random() * 1000;
            Teacher teacher = new Teacher(teacherNames[i], teacherId);
            teachers.add(teacher);

        }


    }
    public void calculateFees(){
        int choice, k=0;
        System.out.println("how what are the subjects you are taking?");
        choice=scanner.nextInt();
        System.out.println("1.Maths");
        System.out.println("2.English");
        System.out.println("3.Science");
        do {
            System.out.println("select those that you learn");

            subjects[k] =scanner.nextInt();
            if(subjects[k]==1)
                totalFee+=1500;
            if(subjects[k]==2)
                totalFee+=500;
            if(subjects[k]==3)
                totalFee+=2000;
            k++;
        }while (k<choice);
        display();

    }

    public void display(){
        System.out.println(" whats ur name?");
        String name=scanner.next();
        System.out.println("your id?");
        int id=scanner.nextInt();


        System.out.println("your outstanding fees is "+totalFee);
        System.out.println("your current average is "+ new Student(name,id).getGrade());
    }
}
