class Employee {
    // Private fields (Encapsulation)
    private int empId;
    private String name;
    private String department;
    private double salary;
    private String email;

    // Constructor
    public Employee(int empId, String name, String department, double salary, String email) {
        this.empId = empId;
        this.name = name;
        this.department = department;
        setSalary(salary);  // using setter for validation
        this.email = email;
    }

    // Public Getter and Setter methods (Controlled Access)

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("❌ Invalid salary: Cannot be negative.");
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        // simple validation
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("❌ Invalid email address.");
        }
    }

    // Business logic method
    public void giveRaise(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        } else {
            System.out.println("❌ Invalid raise percentage.");
        }
    }

    public void printEmployeeDetails() {
        System.out.println("🧑 Employee Details:");
        System.out.println("ID       : " + empId);
        System.out.println("Name     : " + name);
        System.out.println("Dept     : " + department);
        System.out.println("Salary   : ₹" + salary);
        System.out.println("Email    : " + email);
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create an Employee object
        Employee e1 = new Employee(101, "Vinit Solanki", "Engineering", 50000, "vinit@company.com");

        // Access and modify using encapsulated methods
        e1.printEmployeeDetails();

        System.out.println("\n🎯 Attempting to set invalid salary:");
        e1.setSalary(-10000);  // Will show validation error

        System.out.println("\n🎯 Giving 10% raise:");
        e1.giveRaise(10);  // Will increase salary by 10%

        System.out.println("\n🎯 Updated details after raise:");
        e1.printEmployeeDetails();

        System.out.println("\n🎯 Attempting to set invalid email:");
        e1.setEmail("vinit.company.com"); // invalid
    }
}