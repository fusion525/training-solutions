package schoolrecords;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {

    private List<Mark> marks = new ArrayList<>();
    private String name;

    public Student(String name) {

        if (name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        else {
            this.name = name;
        }
    }

    public void grading(Mark mark){

        if (mark == null) {
            throw new NullPointerException("Mark must not be null!");
        }
        else {
            this.marks.add(mark);
        }

    }

    public double calculateAverage() {
        double average = 0.0;
        double sum = 0.0;

        if (marks.isEmpty()) {
            throw new ArithmeticException("No marks present, average calculation aborted!");
        }

        else {
            for (Mark i : marks) {
                sum += i.getMarkType().getValue();
            }
            average = sum / marks.size();

        }

        return Math.floor(average * 100) / 100;

    }

    public double calculateSubjectAverage(Subject subject) {
        double average = 0.0;
        double foundSubject = 0;
        double sum = 0.0;
        if (!marks.isEmpty()) {
            for (Mark i : marks) {
                if (i.getSubject().getSubjectName() == subject.getSubjectName()) {
                    sum += i.getMarkType().getValue();
                    foundSubject++;
                }
                if (foundSubject != 0) {
                    average = sum / foundSubject;
                }
            }
        }

        return average;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getName() + " marks: " + marks.get(0).getSubject().getSubjectName() + ": " + marks.get(0).toString();
    }

}
