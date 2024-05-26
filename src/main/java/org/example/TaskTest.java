package com.example.todo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    public void testTaskCreation() {
        Task task = new Task("Learn Java");
        assertEquals("Learn Java", task.getDescription());
        assertFalse(task.isDone());
    }

    @Test
    public void testMarkAsDone() {
        Task task = new Task("Learn Java");
        task.markAsDone();
        assertTrue(task.isDone());
    }
}
