/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Mega Store
 */
public class ElectronicProduct extends Product {

   private String brand;
    private int warrantyPeriod;

    public ElectronicProduct() {
    }

    public ElectronicProduct(int productId, String name, double price, String brand, int warrantyPeriod) {
        super(productId, name, price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs(warrantyPeriod);
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        if (warrantyPeriod < 0) {
            this.warrantyPeriod = Math.abs(warrantyPeriod);
        } else {
            this.warrantyPeriod = warrantyPeriod;
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

}
