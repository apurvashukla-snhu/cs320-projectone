package projectOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
	@Test
	void testTask() {
		Task task = new Task("12345", "Sample Task", "Runs a sample task.");
		assertTrue(task.getTaskId().equals("12345"));
		assertTrue(task.getTaskName().equals("Sample Task"));
		assertTrue(task.getTaskDescribe().equals("Runs a sample task."));
	}
	@Test
	void testTaskLongID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("1234567", "Sample Task", "Runs a sample task.");
		});
	}
	@Test
	void testTaskNullID() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "Sample Task", "Runs a sample task.");
		});
	}
	@Test
	void testTaskLongName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Sample task with a very long name.", "Runs a sample task.");
		});
	}
	@Test
	void testTaskNullName() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", null, "Runs a sample task.");
		});
	}
	@Test
	void testTaskLongDescribe() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Sample Task", "Runs a sample task with a very very very very very long description.");
		});
	}
	@Test 
	void testTaskNullDescribe() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "Sample Task", null);
		});
	}
}
