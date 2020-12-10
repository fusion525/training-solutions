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

}
