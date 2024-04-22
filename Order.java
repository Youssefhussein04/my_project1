/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Mega Store
 */
public class Order {

    private int customerId;
    private int orderId;
    private Product[] products;
    private float totalPrice;

    public Order() {
    }

    public Order(int customerId, int orderId, Product[] products, double totalPrice) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
        this.totalPrice = (float) Math.abs(totalPrice);
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public void setOrderId(int orderId) {
        this.orderId = Math.abs(orderId);
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = Math.abs(totalPrice);
    }

    public double calculateTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                total += products[i].getPrice();
            }
        }
        return total;
    }

    public void printOrderinfo() {
        System.out.println("customerId: " + customerId);
        System.out.println("orderId: " + orderId);
        System.out.println("products:");
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println("productName: " + products[i].getName() + "\nproductprice: " + products[i].getPrice());
            }
        }
        System.out.println("============================");
        System.out.println("totalPrice is: " + totalPrice);

    }

}
