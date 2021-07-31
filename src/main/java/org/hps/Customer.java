package org.hps;

public class Customer {
    private int customerID;
    private String customerName;
    public Customer(int ID, String name) {
        this.customerID = ID;
        this.customerName = name;
    }
    public int getID() {
        return customerID;
    }
    public String getName() {
        return customerName;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Customer{");
        sb.append("customerID=").append(customerID);
        sb.append(", customerName='").append(customerName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}