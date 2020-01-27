package com.kodilla.spring.portfolio;

public class Board {
    public TaskList toDoList;
    public TaskList inProgressList;
    public TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void getTasksFromBoard() {
        System.out.println("Tasks to do:");
        toDoList.tasks.forEach((task)-> System.out.println(task));
        System.out.println("Tasks in progress:");
        inProgressList.tasks.forEach((task)-> System.out.println(task));
        System.out.println("Tasks done:");
        doneList.tasks.forEach((task)-> System.out.println(task));
    }
}
