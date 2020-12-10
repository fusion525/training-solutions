package week07d04;

import java.time.LocalDateTime;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDateTime completedAt;

    public Lab(String title) {
        this.title = title;
        this.completed = false;
        this.completedAt = null;
    }

    public Lab(String title, LocalDateTime completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        this.completed = true;
    }

    public void complete(LocalDateTime date) {
        this.completed = true;
        this.completedAt = date;
    }

    public void complete() {
        this.completed = true;
        this.completedAt = java.time.LocalDateTime.now();

    }

    @Override
    public String toString() {
        return this.title + " " + this.completed + " " + this.completedAt;
    }

    public static void main(String[] args) {
        Lab lab = new Lab("Java");
        System.out.println(lab.toString());

        Lab lab2 = new Lab("c++",LocalDateTime.of(2020,12,9,12,3));
        System.out.println(lab2.toString());

        lab.complete(LocalDateTime.of(2020,12,10,16,0));
        System.out.println(lab.toString());

        Lab lab3 = new Lab("Python");
        lab3.complete();
        System.out.println(lab3.toString());
    }

}
