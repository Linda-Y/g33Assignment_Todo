package se.lexicon.Linda.Sara.Data;

public class TodoSequancer {

    private static int todoId;

    public static int getnextTodoId()

    {
        todoId=todoId+1;
    return TodoSequancer.todoId;

    }
}
