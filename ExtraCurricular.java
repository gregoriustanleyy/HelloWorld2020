import java.applet.Applet;
import java.util.*;

public class ExtraCurricular {

    public static void main(String[] args) {
        String q1 = "Do you like playing sports?";
        String q2 = "Do you like drawing, painting, or music?";
        String q3 = "Do you like airplanes or automotives?";
        String q4 = "Do you like working with Radios?";
        String q5 = "Do you like dancing?";
        String q6 = "Do you like gaming?";
        ArrayList<String> sports = new ArrayList<String>(Arrays.asList("Aikido Club", "Airsoft Club", "Tennis Club", "Cricket Club"));
        ArrayList<String> art = new ArrayList<String>(Arrays.asList("3D Painting Club", "Ad Liberation Club", "First Frame","Purdue Music Producers"));
        ArrayList<String> automotives = new ArrayList<String>(Arrays.asList("Aviation Ambassadors", "Electric Vehicle Club","American Institute of Aeronautics & Astronautics"));
        ArrayList<String> radios = new ArrayList<String>(Arrays.asList("Purdue Amateur Radio Club", "Purdue Vinyl Club","Roadhouse Radio Broadcasting Group"));
        ArrayList<String> dancing = new ArrayList<String>(Arrays.asList("Boiler Bhangra", "Contemporary Dance Company", "Dance All Out Club"));
        ArrayList<String> gaming = new ArrayList<String>(Arrays.asList("Board Games Club", "Game Developers United","Purdue University Gamer Groups"));
        ArrayList<String> answers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("It's important to be involved outside of academics!");
        System.out.println();
        System.out.println("Answer yes or no to the follow questions:");

        System.out.println(q1);
        String a1 = scan.nextLine().toLowerCase();
        if (a1.equals("yes")) {
            for (String s : sports) {
                answers.add(s);
            }
        }

        System.out.println(q2);
        String a2 = scan.nextLine().toLowerCase();
        if (a2.equals("yes")) {
            for (String s : art) {
                answers.add(s);
            }
        }

        System.out.println(q3);
        String a3 = scan.nextLine().toLowerCase();
        if (a3.equals("yes")) {
            for (String s : automotives) {
                answers.add(s);
            }
        }

        System.out.println(q4);
        String a4 = scan.nextLine().toLowerCase();
        if (a4.equals("yes")) {
            for (String s : radios) {
                answers.add(s);
            }
        }

        System.out.println(q5);
        String a5 = scan.nextLine().toLowerCase();
        if (a5.equals("yes")) {
            for (String s : dancing) {
                answers.add(s);
            }
        }

        System.out.println(q6);
        String a6 = scan.nextLine().toLowerCase();
        if (a6.equals("yes")) {
            for (String s : gaming) {
                answers.add(s);
            }
        }

        System.out.println();
        System.out.println();

        System.out.println("Here a list of recommended Clubs based on your answers: ");
        for (String s : answers) {
            System.out.println(s);
        }
    }
}