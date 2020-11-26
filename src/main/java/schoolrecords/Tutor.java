package schoolrecords;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutor {

    String name;
    List<Subject> taughtSubjects;

    public Tutor(String name, List<Subject> taughtSubjects) {
        this.name = name;
        this.taughtSubjects = taughtSubjects;
    }

    public String getName() {
        return name;
    }

    public boolean tutorTeachingSubject(Subject subject) {
        boolean contains = false;
        for (Subject subjects : taughtSubjects) {
            if(subjects.getSubjectName().equals(subject.getSubjectName())){
                contains = true;
            }
        }
        return contains;
    }

}

