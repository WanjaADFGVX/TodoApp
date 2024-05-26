package com.example.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    public void testAddTask() {
        TaskManager manager = new TaskManager();
        manager.addTask("Learn Java");
        assertEquals(1, manager.getTasks().size());
        assertEquals("Learn Java", manager.getTasks().get(0).getDescription());
    }

    @Test
    public void testMarkTaskAsDone() {
        TaskManager manager = new TaskManager();
        manager.addTask("Learn Java");
        manager.markTaskAsDone(0);
        assertTrue(manager.getTasks().get(0).isDone());
    }
}
