package exam03retake02;

import java.util.ArrayList;
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

    public List<Todo> getMostImportantTodosText() {

        int max = 0;
        List<Todo> mostImportants = new ArrayList<>();

        for (int i = 0; i<todos.size(); i++) {
            if (todos.get(i).getPriority() > max) {
                max = todos.get(i).getPriority();
            }
        }

        for (Todo todo : todos) {

            if (todo.getPriority() == max) {
                mostImportants.add(todo);
            }
        }

        return mostImportants;

    }

    public void deleteCompleted() {

        for (Todo todo : todos) {

            if (todo.getState() == State.COMPLETED) {
                todos.remove(todo);
            }
        }

    }

}
