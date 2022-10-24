package com.spring.hafta4.config;

import com.spring.hafta4.model.ToDo;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class ToDoConfiguration {
    public static List<ToDo> todoList = new CopyOnWriteArrayList<>();

   
}
