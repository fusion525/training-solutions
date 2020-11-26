package schoolrecords;

import java.util.*;

public class ClassRecords {

    private String className;
    private Random rnd = new Random();
    private List<Student> students = new ArrayList<>();

    public ClassRecords(String className, Random rnd) {
        this.className = className;
        this.rnd = rnd;
    }

    public boolean addStudent(Student student) {
        boolean added = false;
        boolean contains = false;

        for (Student i : students) {
            if (i.getName().equals(student.getName())){
                contains = true;
            }
        }
        if (!contains) {
            students.add(student);
            added = true;
        }

        return added;
    }

    public boolean removeStudent(Student student) {
        boolean removed = false;
        boolean contains = false;

        for (Student i : students) {
            if (i.getName().equals(student.getName())){
                contains = true;
            }
        }
        if (contains) {
            students.remove(student);
            removed = true;
        }

        return removed;

    }

    public double calculateClassAverage() {
        double averages = 0.0;
        double sum = 0;

        if (students.isEmpty()) {
            throw new ArithmeticException("No student in the class, average calculation aborted!");
        }

        else {

            for (Student i : students) {
                averages += i.calculateAverage();
                sum++;
            }
            return averages / sum;
        }
    }

    public double calculateClassAverageBySubject(Subject subject) {
        double averages = 0.0;
        double sum = 0;

        for (Student i : students) {
            averages += i.calculateSubjectAverage(subject);
            if (i.calculateSubjectAverage(subject) != 0) {
                sum++;
            }
        }
        return averages / sum;


    }

    public String getClassName() {
        return className;
    }

    public Student findStudentByName(String name) {
        Student foundStudent = null;

        if (name == null || name.equals("")) {
            throw new IllegalArgumentException("Student name must not be empty!");
        }
        else if (students.isEmpty()) {
            throw new IllegalStateException("No students to search!");
        }
        else {
            for (Student i : students) {
                if (i.getName().equals(name)) {
                    foundStudent = i;
                }
            }
            if (foundStudent == null) {
                throw new IllegalArgumentException("Student by this name cannot be found! " + name );
            }
        }
        return foundStudent;
    }

    public Student repetition() {

        int randomStudent = 0;

        if (students.isEmpty()) {
            throw new IllegalStateException("No students to select for repetition!");
        }
        else {

            randomStudent = rnd.nextInt(students.size());

        }

        return students.get(randomStudent);
    }

    public String listStudentNames() {
        StringJoiner joiner = new StringJoiner(", ");
        for (Student i : students) {

            joiner.add(i.getName());
        }
        return joiner.toString();
    }

}
