package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList toDolist;
    @Autowired
    @Qualifier("inProgressList")
    TaskList inProgresslist;
    @Autowired
    @Qualifier("doneList")
    TaskList donelist;

    @Bean
    public Board getBoard() {
        return new Board(toDolist, inProgresslist, donelist);
    }

    @Bean(name = "toDoList")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getInProgressList() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getDoneList() {
        return new TaskList();
    }
}
