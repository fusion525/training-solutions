package exam03retake02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TodoList {

    private List<Todo> todos = new ArrayList<>();

    public void addTodo(Todo todo) {

        todos.add(todo);

    }

    public List<Todo> getTodos() {

        return this.todos;
    }

    public int getNumberOfItemsLeft() {

        int sum = 0;

        for (Todo todo : todos) {

            if (todo.getState() == State.NON_COMPLETED) {
                sum++;
            }
        }
        return sum;
    }

    public List<String> getMostImportantTodosText() {

        int mini = 0;
        List<String> mostImportants = new ArrayList<>();
        int maxPriority = 1;

        for (int i = 0; i<todos.size(); i++) {
            if (todos.get(i).getPriority() < todos.get(mini).getPriority()) {
                mini = i;
            }
        }

        maxPriority = todos.get(mini).getPriority();

        for (Todo todo : todos) {

            if (todo.getPriority() == maxPriority) {
                mostImportants.add(todo.getText());
            }
        }

        return mostImportants;

    }

    public void deleteCompleted() {

        for (Iterator<Todo> iterator = todos.iterator(); iterator.hasNext();) {
                Todo todo = iterator.next();

            if (todo.getState().equals(State.COMPLETED)) {
                iterator.remove();
            }

        }

        }

}
