package xxx;

import th.ac.ku.javareview.Student;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(1, "Bob");

        // cannot access different package
//        s1.aaa;
    }
}
