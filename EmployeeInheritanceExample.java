class Employee {
    private String name;
    private int employeeId;
    
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

class Manager extends Employee {
    private String department;
    
    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }
    
    
    void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class EmployeeInheritanceExample {
    public static void main(String[] args) {
        Manager manager = new Manager("John", 101, "HR");
        manager.displayInfo();
    }
}
