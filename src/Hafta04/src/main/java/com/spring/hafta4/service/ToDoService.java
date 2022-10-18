package com.spring.hafta4.service;


import com.spring.hafta4.config.ToDoConfiguration;
import com.spring.hafta4.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ToDoService {
    List<ToDo> todoList;

    public String insert(ToDo requestToDo) {
        ToDo todo = new ToDo();
        todo.setId(requestToDo.getId());
        todo.setTitle(requestToDo.getTitle());
        if (requestToDo.getDayId() < 0 || requestToDo.getDayId() > 6) return "Geçerli gün id'si girin";
        todo.setDayId(requestToDo.getDayId());
        todo.setCompleted(false);
        todoList = ToDoConfiguration.todoList;
        todoList.add(todo);
        return "Kullanıcı başarılı bir şekilde oluşturuldu.";
    }

    public ToDo findToDoById(Long id) {
        todoList = ToDoConfiguration.todoList;
        for (ToDo todo :
                todoList) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

    public List<ToDo> findToDoAll() {
        todoList = ToDoConfiguration.todoList;
        return todoList;
    }

    public void completedToDo(Long id) {
        ToDo todo = this.findToDoById(id);
        todo.setCompleted(true);
    }

    public List<ToDo> findAllToDoByStatus(boolean status) {
        todoList = ToDoConfiguration.todoList;
        List<ToDo> filteredToDo = new ArrayList<>();
        for (ToDo todo :
                todoList) {
            if (todo.isCompleted() == status) {
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

    public List<ToDo> findAllToDoByDay(int day) {
        todoList = ToDoConfiguration.todoList;
        List<ToDo> filteredToDo = new ArrayList<>();
        for (ToDo todo :
                todoList) {
            if (todo.getDayId() == day) {
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

    public String deleteOneToDo(Long id) {
        todoList = ToDoConfiguration.todoList;
        if (this.findToDoById(id) != null) {
            todoList.remove(this.findToDoById(id));
            return "Silme işlemi başarılı";
        }
        return "Geçersiz id";
    }
}
