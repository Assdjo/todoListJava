public class TodoList {
    private Task[] tasks;
    private int taskCount;

    public TodoList(int size) {
        tasks = new Task[size];
        taskCount = 0;
    }

    public void addTask(Task task) {

        tasks[taskCount] = task;
        taskCount++;
    }

    public void editTask(int index, String name, String description) {
        tasks[index-1].setName(name);
        tasks[index-1].setDescription(description);
    }

    public void deleteTask(int index) {
        for (int i = index-1; i < taskCount - 1; i++) {
            tasks[i] = tasks[i + 1];
        }
        taskCount--;
    }

    public void markTaskAsDone(int index) {
        tasks[index - 1].markAsDone();
    }

    public void markTaskAsUndone(int index) {
        tasks[index - 1].markAsUndone();
    }

    public void printTasks() {
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks[i];
            System.out.println((i + 1) + ". " + task.getName() + " - " + task.getDescription() + " - " + (task.isDone() ? "Done" : "Not done"));
        }
    }
    
}