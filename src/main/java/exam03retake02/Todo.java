package exam03retake02;

public class Todo {

    private String text;
    private exam03retake02.State state;
    private int priority;

    public Todo(String text, int priority) {
        this.text = text;
        this.priority = priority;
        this.state = exam03retake02.State.NON_COMPLETED;
    }

    public String getText() {
        return text;
    }

    public State getState() {
        return state;
    }

    public int getPriority() {
        return priority;
    }

    public void complete() {
        this.state = exam03retake02.State.COMPLETED;
    }

}
