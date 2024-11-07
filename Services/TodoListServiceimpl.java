package Services;

import Entities.TodoList;
import Repository.TodoListRepository;

public class TodoListServiceimpl implements TodoListService{
    private final TodoListRepository todoListRepository;

    public TodoListServiceimpl(final TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    @Override
    public TodoList[] getTodoList() {
        return todoListRepository.getAll();
    }

    @Override
    public void addTodoList(final String todo) {
        if (todo.isEmpty() || todo.isBlank()) {
            System.out.printf("masukkan todo dengan benar");
        }
    TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoListRepository.add(todoList);
    }

    @Override
    public Boolean removeTodoList(final Integer number) {
        return todoListRepository.remove(2 number);

    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        TodoList todoList = new TodoList();
        todoList.setTodo(todo);
        todoList.setId(number);
        return todoListRepository.edit(todoList);
    }
}
