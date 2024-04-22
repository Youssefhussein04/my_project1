/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Mega Store
 */
public class Product {

   protected int productId;
   protected String name;
    protected float price;

    public Product() {
    }

    
    public Product(int productId, String name, double price) {
        this.productId = Math.abs(productId);
        this.name = name;
        this.price = (float) Math.abs(price);
    }

    public void setProductId(int productId) {
        if (productId < 0) {
            this.productId = Math.abs(productId);
        } else {
            this.productId = productId;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        if (price < 0) {
            this.price = Math.abs(price);
        } else {
            this.price = price;
        }

    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

}
