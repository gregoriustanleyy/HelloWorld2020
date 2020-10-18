import java.util.ArrayList;

public class Processing {
    private final String[] freshmen = {}; //the course best for freshmen
    private final String[] sophomore = {};
    private final String[] junior = {};
    private final String[] senior = {};

    public Processing() {
    }

    public void courseChecker() {
        Student student = new Student();
        ArrayList<String> courses= new ArrayList<String>();
        courses.add(student.course1);
        courses.add(student.course2);
        courses.add(student.course3);
        courses.add(student.course4);
        courses.add(student.course4);
        courses.add(student.course5);
        courses.add(student.course6);

        if (student.getYear().contentEquals("freshmen")) {
            for (int i = 0; i < courses.size(); i++) {
                for (int j = 0; j < freshmen.length; j++) {
                    if (courses.get(i).contentEquals(freshmen[j])) {
                        //proceed
                    } else {
                        //print out "you should have the course at another year
                    }
                }
            }

        } else if (student.getYear().contentEquals("sophomore")) {

        } else if (student.getYear().contentEquals("junior")) {

        } else if (student.getYear().contentEquals("senior")) {

        }
    }

}