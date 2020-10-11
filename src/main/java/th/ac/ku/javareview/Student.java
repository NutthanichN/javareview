package th.ac.ku.javareview;

import java.util.ArrayList;

public class Student {

    // access specifier: private, public, package, protected

    // attributes
    private int id;
    private String name;
    private ArrayList<Double> scores;

    // access specifier in package level
    int aaa = 10;

    // constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.scores = new ArrayList<>();
    }

    public void addScore(double score) {
        scores.add(score);
    }

    public double getTotalScore() {
        double total = 0;
        for (double score: scores) {
            total += score;
        }
        return total;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // JSON format
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", scores=" + scores +
                '}';
    }
}
