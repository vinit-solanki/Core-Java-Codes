class Employee {
    int empId;
    String name;
    int phoneNo;
    String email;
    String role;
    private int salary;

    Employee(int empId, String name, int phoneNo, String email, String role) {
        this.empId = empId;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
        this.role = role;
    }

    // Method to be overridden
    void showDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Phone No: " + phoneNo);
        System.out.println("Email: " + email);
        System.out.println("Role: " + role);
        System.out.println("Salary: " + getSalary());  // Print here
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

// ✅ Proper Overriding
class Developer extends Employee {
    Developer(int empId, String name, int phoneNo, String email) {
        super(empId, name, phoneNo, email, "Developer");
    }

    @Override
    void showDetails() {
        System.out.println("------Developer's Details------");
        super.showDetails();  // Call parent’s method
        System.out.println("Specialty: Full Stack Java Developer");
    }
}

class HR extends Employee {
    HR(int empId, String name, int phoneNo, String email) {
        super(empId, name, phoneNo, email, "HR");
    }

    @Override
    void showDetails() {
        System.out.println("------HR's Details------");
        super.showDetails();
        System.out.println("Manages: Employee Relations");
    }
}

class Intern extends Employee {
    Intern(int empId, String name, int phoneNo, String email) {
        super(empId, name, phoneNo, email, "Intern");
    }

    @Override
    void showDetails() {
        System.out.println("------Intern's Details------");
        super.showDetails();
        System.out.println("Internship Duration: 6 months");
    }
}

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Employee e1 = new Developer(101, "John", 123456, "john@gmail.com");
        e1.setSalary(85000);  // Set salary via setter
        e1.showDetails();     // Runtime Polymorphism

        System.out.println();

        Employee e2 = new HR(102, "Priya", 987654, "priya@company.com");
        e2.setSalary(95000);
        e2.showDetails();

        System.out.println();

        Employee e3 = new Intern(103, "Alex", 456789, "alex@intern.com");
        e3.setSalary(15000);
        e3.showDetails();
    }
}