package Exercise4;



public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee e1 = new Employee("1", "Alice", "Manager", 80000);
        Employee e2 = new Employee("2", "Bob", "Developer", 60000);
        Employee e3 = new Employee("3", "Charlie", "Designer", 50000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee searchResult = ems.searchEmployee("2");
        if (searchResult != null) {
            System.out.println("Employee found: " + searchResult);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 2:");
        ems.deleteEmployee("2");
        ems.traverseEmployees();
    }
}
