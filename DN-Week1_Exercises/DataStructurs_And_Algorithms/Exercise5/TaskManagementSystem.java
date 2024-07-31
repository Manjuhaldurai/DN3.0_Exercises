package Exercise5;



public class TaskManagementSystem {

    public static void main(String[] args) {
        LinkedList taskList = new LinkedList();

        Task t1 = new Task("1", "Task A", "Pending");
        Task t2 = new Task("2", "Task B", "In Progress");
        Task t3 = new Task("3", "Task C", "Completed");

        taskList.addTask(t1);
        taskList.addTask(t2);
        taskList.addTask(t3);

        System.out.println("All Tasks:");
        taskList.traverseTasks();

        System.out.println("\nSearching for Task with ID 2:");
        Task searchResult = taskList.searchTask("2");
        if (searchResult != null) {
            System.out.println("Task found: " + searchResult);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID 2:");
        taskList.deleteTask("2");
        taskList.traverseTasks();
    }
}
