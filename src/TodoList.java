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

    public void markTaskAsDone(int index) {
        tasks[index].markAsDone();
    }

    public void markTaskAsUndone(int index) {
        tasks[index].markAsUndone();
    }

    public void printTasks() {
        for (int i = 0; i < taskCount; i++) {
            Task task = tasks[i];
            System.out.println((i + 1) + ". " + task.getName() + " - " + task.getDescription() + " - " + (task.isDone() ? "Done" : "Not done"));
        }
    }
    
}