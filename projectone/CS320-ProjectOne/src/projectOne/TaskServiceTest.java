package projectOne;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskServiceTest {
	@Test
	// tests if the task service class is not null
	void testTaskServiceClass() {
		TaskService.addTask("1235", "Sample Task", "Runs a sample task.");
		assertTrue(TaskService.taskList.get(0).getTaskId().equals("1235"));
		assertTrue(TaskService.taskList.get(0).getTaskName().equals("Sample Task"));
		assertTrue(TaskService.taskList.get(0).getTaskDescribe().equals("Runs a sample task."));
	}
	@Test
	void testTaskServiceAddTask() {
		TaskService taskservice = new TaskService();
		TaskService.addTask("9019", "Add Task", "Add task test.");
		assertTrue(TaskService.taskList.get(0).getTaskId().equals("90196"));
	}
	@Test
	void testTaskDeleteTask() {
		TaskService.addTask("90197", "Delete Task", "Test for delete sample task.");
		TaskService.deleteTask("90197");
		assertFalse(TaskService.taskList.get(0).getTaskId().equals(null));
	}
	@Test
	void testTaskUpdateName() {
		TaskService.addTask("90198", "Update Name", "Updates name test.");
		TaskService.updateName("90198", "New Name");
		assertTrue(TaskService.taskList.get(0).getTaskName().equals("New Name"));
	}
	@Test
	void testTakeUpdateDescription() {
		TaskService.addTask("90199", "Update Describe", "Updates description.");
		TaskService.updateDescription("90199", "Updated description today.");
		assertTrue(TaskService.taskList.get(0).getTaskName().equals("Updated description today."));
	}

}
