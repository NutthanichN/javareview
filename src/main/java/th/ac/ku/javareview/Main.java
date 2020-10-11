package th.ac.ku.javareview;

public class Main {

    // shortcut: psvm
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mr. A");

        s1.addScore(8);
        s1.addScore(10);

        // shortcut: sout
        System.out.println(s1.toString());
        System.out.println(s1.getTotalScore());
    }

}
