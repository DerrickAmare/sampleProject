import java.util.Scanner;

public class Student{
    private String studentName;
    private int studentId;

    private double grade;
   private String [] subjects;
       Scanner scanner= new Scanner(System.in);

    public Student(String studentName,int studentId){
        this.studentName=studentName;
        this.studentId=studentId;

        subjects = new String[]{"Maths","English","Science"};
    }
    public String[] getSubjects(){
        return subjects;

    }
     public double getGrade(){


        for(int i=0;i<subjects.length;i++) {
            System.out.println("Whats is your score in " +subjects[i]);
            grade += scanner.nextDouble();
        }
        return grade/ subjects.length;
     }

}