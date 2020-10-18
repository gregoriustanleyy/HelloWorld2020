import java.util.ArrayList;

public class Processing {
    private final String[] freshmen = {}; //the course best for freshmen
    private final String[] sophomore = {};
    private final String[] junior = {};
    private final String[] senior = {};

    public Processing() {
    }

    public void courseChecker() {
        boolean optimize;
        Student student = new Student();

        if (student.getYear().contentEquals("freshmen")) {
            for (String course : student.getCourse()) {
                for (String compare : freshmen) {
                    if (course.contentEquals(compare)) {
                        optimize = true;
                    } else {
                        optimize = false;
                        for (int i = 0; i < sophomore.length; i++) {
                            if (course.contentEquals(sophomore[i])) {
                                System.out.printf("You should take %s at sophomore", course);
                            } else {
                                for (int j = 0; j < junior.length; j++) {
                                    if (course.contentEquals(junior[i])) {
                                        System.out.printf("You should take %s at junior", course);
                                    } else {
                                        System.out.printf("You should take %s at senior", course);
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
            }
            if (optimize = true) {
                System.out.println("All good!");
            }
        } else if (student.getYear().contentEquals("sophomore")) {
            for (String course : student.getCourse()) {
                for (String compare : sophomore) {
                    if (course.contentEquals(compare)) {
                        optimize = true;
                    } else {
                        optimize = false;
                        for (int i = 0; i < freshmen.length; i++) {
                            if (course.contentEquals(freshmen[i])) {
                                System.out.printf("You should take %s at freshmen", course);
                            } else {
                                for (int j = 0; j < junior.length; j++) {
                                    if (course.contentEquals(junior[i])) {
                                        System.out.printf("You should take %s at junior", course);
                                    } else {
                                        System.out.printf("You should take %s at senior", course);
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
            }
            if (optimize = true) {
                System.out.println("All good!");
            }
        } else if (student.getYear().contentEquals("junior")) {
            for (String course : student.getCourse()) {
                for (String compare : junior) {
                    if (course.contentEquals(compare)) {
                        optimize = true;
                    } else {
                        optimize = false;
                        for (int i = 0; i < freshmen.length; i++) {
                            if (course.contentEquals(freshmen[i])) {
                                System.out.printf("You should take %s at freshmen", course);
                            } else {
                                for (int j = 0; j < sophomore.length; j++) {
                                    if (course.contentEquals(sophomore[i])) {
                                        System.out.printf("You should take %s at sophomore", course);
                                    } else {
                                        System.out.printf("You should take %s at senior", course);
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
            }
            if (optimize = true) {
                System.out.println("All good!");
            }
        } else if (student.getYear().contentEquals("senior")) {
            for (String course : student.getCourse()) {
                for (String compare : senior) {
                    if (course.contentEquals(compare)) {
                        optimize = true;
                    } else {
                        optimize = false;
                        for (int i = 0; i < freshmen.length; i++) {
                            if (course.contentEquals(freshmen[i])) {
                                System.out.printf("You should take %s at freshmen", course);
                            } else {
                                for (int j = 0; j < junior.length; j++) {
                                    if (course.contentEquals(junior[i])) {
                                        System.out.printf("You should take %s at junior", course);
                                    } else {
                                        System.out.printf("You should take %s at sophomore", course);
                                    }
                                }
                            }
                        }
                        break;
                    }
                }
            }
            if (optimize = true) {
                System.out.println("All good!");
            }
        }
    }

}