package de.haegerconsulting.concepts.inheritence.abstraction;

public class ConcreteEmployee extends AbstractPerson{

    public int employeeNo;

    public ConcreteEmployee(Long id, String firstName, String lastName, String eMailAddress, String password, int employeeNo) {
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
        return super.toString() + " -> ConcreteEmployee{" +
                "employeeNo=" + employeeNo +
                '}';
    }
}
