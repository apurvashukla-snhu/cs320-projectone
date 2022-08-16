package projectOne;

import java.util.ArrayList;

public class TaskService {
	private static String taskId;
	private String taskName;
	private String taskDescribe;
	
	//creating new array list for tasks.
	static ArrayList<Task> taskList = new ArrayList<Task> (0);
	
	//unique id generator
	public static String generateUniqueID() {
		String uniqueId;
		if(taskList.isEmpty()) {
			taskId = "0000000000";
		}
		else {
			int arraySize = taskList.size();
			taskId = taskList.get(arraySize - 1).getTaskId();
		}
		int temp = Integer.valueOf(taskId);
		temp += 1;
		uniqueId = Integer.toString(temp);
		return uniqueId;
	}
	//adding task to array list.
	public static void addTask(String id, String name, String describe) {
		String Id = generateUniqueID();
		Task task1 = new Task(id, name, describe);
		taskList.add(task1);
	}
	//deleteing task from array list.
	public static void deleteTask(String uniqueid) {
		for (int i = 0; i < taskList.size(); i++) {
			if(uniqueid.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.remove(i);
			}
		}
	}
	//update task name
	public static void updateName(String id, String name) {
		for (int i = 0; i < taskList.size(); i++) {
			if(id.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.get(i).setTaskName(name);
				
			}
		}
	}
	//update task descriptions
	public static void updateDescription(String id, String describe) {
		for (int i = 0; i < taskList.size(); i++) {
			if(id.compareTo(taskList.get(i).getTaskId()) == 0) {
				taskList.get(i).setTaskDescribe(describe);
			}
		}
	}
}
