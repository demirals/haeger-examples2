package de.haegerconsulting.concepts.inheritence;

public class Customer extends Person{

    private String companyName;
    private String customerNo;

    public Customer(Long id, String firstName, String lastName, String eMailAddress, String password, String companyName, String customerNo) {
        super(id, firstName, lastName, eMailAddress, password);
        this.companyName = companyName;
        this.customerNo = customerNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    @Override
    public String toString() {
        return super.toString() + " -> Customer{" +
                "companyName='" + companyName + '\'' +
                ", customerNo='" + customerNo + '\'' +
                '}';
    }
}
