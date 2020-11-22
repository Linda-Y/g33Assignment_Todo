package se.lexicon.Linda.Sara.Model;

import se.lexicon.Linda.Sara.Data.TodoSequancer;

public class Todo {

    // fields
    private final int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    // constructor
    public Todo(String description)

    {
        this.todoId= TodoSequancer.getnextTodoId();
        this.description=description;

    }

    // getter & setter

    public int getTodoId() {
        return todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "todoId=" + todoId +
                ", description='" + description + '\'' +
                ", done=" + done +
                ", assignee=" + assignee +
                '}';
    }
}
