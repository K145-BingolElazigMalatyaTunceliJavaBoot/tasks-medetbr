package com.spring.hafta4.controller;

import com.spring.hafta4.model.ToDo;
import com.spring.hafta4.service.ToDoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/api/todo")
public class ToDoController {
    private final ToDoService todoService;

    public ToDoController(ToDoService todoService) {
        this.todoService = todoService;
    }
    @PostMapping("/")
    public ResponseEntity create(@RequestBody ToDo requestToDo){
        todoService.insert(requestToDo);
        return ResponseEntity.status(200).body("ToDo created");
    }
    @GetMapping("/{id}")
    public ToDo getOneToDo(@PathVariable Long id){
        return todoService.findToDoById(id);
    }
    @GetMapping("/")
    public List<ToDo> getAllToDo(){
        return todoService.findToDoAll();
    }
    @PostMapping("/completed/{id}")
    public void complatedToDo(@PathVariable Long id){
        todoService.completedToDo(id);
    }
    @GetMapping("/sort-by-status")
    public List<ToDo> getAllToDoByStatus(@RequestParam boolean status){
        return todoService.findAllToDoByStatus(status);
    }
    @GetMapping("/sort-by-day")
    public List<ToDo> getAllToDoByDay(@RequestParam int day){
        return todoService.findAllToDoByDay(day);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity deleteToDo(@PathVariable Long id){
        return ResponseEntity.status(200).body(todoService.deleteOneToDo(id));
    }

}
