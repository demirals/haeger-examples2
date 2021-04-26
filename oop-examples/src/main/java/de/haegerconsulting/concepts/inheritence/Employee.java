package de.haegerconsulting.concepts.inheritence;

public class Employee extends Person{

    public int employeeNo;

    public Employee(Long id, String firstName, String lastName, String eMailAddress, String password, int employeeNo) {
        super(id, firstName, lastName, eMailAddress, password);
        this.employeeNo = employeeNo;
    }

    public int getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(int employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Employee{" +
                "employeeNo=" + employeeNo +
                '}';
    }
}
