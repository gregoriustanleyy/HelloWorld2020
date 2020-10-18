import java.util.Scanner;

public class Student {
    public static String[] course = new String[5];
    public String year;
    public boolean statement1;
    public boolean statement2;
    public boolean statement3;
    public boolean statement4;
    public boolean statement5;

    public Student(){
    }

    public String[] getCourse() {
        return course;
    }
    public String getYear() {
        return year;
    }

    public void setCourse(String[] course) {
        Student.course = course;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();
        String input;
        System.out.println("Only for CS/DS students");
        System.out.println("Please input what year you are in: (freshmen/sophomore/junior/senior");
        input = scan.nextLine();
        student.setYear(input);
        System.out.println("Please input 6 courses you are going to attend");
        for (int i = 0; i < course.length; i++) {
            course[i] = scan.nextLine();
        }
        student.setCourse(course);

        Processing processing = new Processing();
        processing.courseChecker();

        //TODO: Input statements
    }
}
