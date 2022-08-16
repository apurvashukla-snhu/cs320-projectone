package projectOne;


public class Task {
	private String taskId;
	private String taskName;
	private String taskDescribe;
	
	public Task(String id, String name, String describe) {
		if (id == null || id.length() > 5) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if (name == null || name.length() > 20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if (describe == null || describe.length() > 50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.taskId = id;
		this.taskName = name;
		this.taskDescribe = describe;
	}

	public String getTaskId() {
		return taskId;
	}

	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskDescribe() {
		return taskDescribe;
	}

	public void setTaskDescribe(String taskDescribe) {
		this.taskDescribe = taskDescribe;
	}
}

