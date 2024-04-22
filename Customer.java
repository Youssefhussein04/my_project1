/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Mega Store
 */
public class Customer {

    private int customerId;
    private String name;
    private String address;

    public Customer() {
    }

    public Customer(int customerId, String name, String address) {
        this.customerId = Math.abs(customerId);
        this.name = name;
        this.address = address;
    }

    public void setCustomerId(int customerId) {
        if (customerId < 0) {
            this.customerId = Math.abs(customerId); //23011634
        } else {
            this.customerId = customerId;
        }
    }

    public void setName(String name) {
        this.name = name;                   //Youssef Hussein Sophy Elbhraweiy
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

}
