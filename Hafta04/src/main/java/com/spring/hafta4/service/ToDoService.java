package com.spring.hafta4.service;


import com.spring.hafta4.config.ToDoConfiguration;
import com.spring.hafta4.model.ToDo;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;


@Service
public class ToDoService {
    List<ToDo> todoList;

    public String insert(ToDo requestToDo) {
        try {
            if (requestToDo.getDayId() < 0 || requestToDo.getDayId() > 6) return "Geçerli gün id'si girin";
            ToDo todo = createToDo(requestToDo);
            todoList = ToDoConfiguration.todoList;
            todoList.add(todo);
            return "Kullanıcı başarılı bir şekilde oluşturuldu.";
        }catch (Exception e){
            return "Todo oluşturulurken bir hata oluştu";
        }

    }

    private ToDo createToDo(ToDo requestToDo) {
        ToDo todo = new ToDo();
        todo.setId(requestToDo.getId());
        todo.setTitle(requestToDo.getTitle());
        todo.setDayId(requestToDo.getDayId());
        todo.setCompleted(false);
        return todo;
    }

    public ToDo findToDoById(Long id) {
        try{
            todoList = ToDoConfiguration.todoList;
            for (ToDo todo :
                    todoList) {
                if (todo.getId() == id) {
                    return todo;
                }
            }
        }catch (Exception e){
            throw new RuntimeException("Bir hata oluştu");
        }
        return null;
    }

    public List<ToDo> findToDoAll() {
        try {
            todoList = ToDoConfiguration.todoList;
            return todoList;
        }catch (Exception e){
            throw new RuntimeException("Bir hata oluştu");
        }
    }

    public void completedToDo(Long id) {
        try {
            ToDo todo = this.findToDoById(id);
            todo.setCompleted(true);
        }catch (Exception e){
            throw new RuntimeException("Bir hata oluştu");
        }
    }
    public List<ToDo> findAllToDoByStatus(boolean status) {
        try {
            todoList = ToDoConfiguration.todoList;
            List<ToDo> filteredToDo = new ArrayList<>();
            for (ToDo todo :
                    todoList) {
                if (todo.isCompleted() == status) {
                    filteredToDo.add(todo);
                }
            }
            return filteredToDo;
        }catch (Exception e){
            throw new RuntimeException("Bir hata oluştu");
        }
    }

    public List<ToDo> findAllToDoByDay(int day) {
        try {
            todoList = ToDoConfiguration.todoList;
            List<ToDo> filteredToDo = new ArrayList<>();
            for (ToDo todo :
                    todoList) {
                if (todo.getDayId() == day) {
                    filteredToDo.add(todo);
                }
            }
            return filteredToDo;
        }catch (Exception e){
            throw new RuntimeException("Bir hata oluştu");
        }
    }

    public String deleteOneToDo(Long id) {
        try {
            todoList = ToDoConfiguration.todoList;
            if (this.findToDoById(id) != null) {
                todoList.remove(this.findToDoById(id));
                return "Silme işlemi başarılı";
            }
        }catch (Exception e){
            return "Geçersiz id";
        }
        return null;
    }
}
