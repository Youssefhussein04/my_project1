/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test1;

/**
 *
 * @author Mega Store
 */
public class Cart {

   private int customerId;
    private int nproducts;
   private Product[] products;
    private int productcount;

    public Cart() {
    }

    public Cart(int nProducts, int customerId) {
        this.customerId = Math.abs(customerId);
        this.nproducts = Math.abs(nProducts);
        this.products = new Product[this.nproducts];
        int productcount = 0;
    }

    public void setCustomerId(int customerId) {
        if (customerId < 0) {
            this.customerId = Math.abs(customerId);
        } else {
            this.customerId = customerId;
        }
    }

    public void setNproducts(int nproducts) {
        if (nproducts < 0) {
            this.nproducts = Math.abs(nproducts);
        } else {
            this.nproducts = nproducts;
        }
        this.products = new Product[this.nproducts];
    }

    public void setProducts(Product[] products) {
        if (products == null || products.length != this.nproducts) {
            System.out.println("Invalid products array");
        }
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getNproducts() {
        return nproducts;
    }

    public Product[] getProducts() {
        return products;
    }

    public void addProductById(int productId, Product[] inventory) {
        if (productcount >= nproducts) {
            System.out.println("Cart is full. Cannot add more products.");
            return;
        }

        for (Product product : inventory) {
            if (product.getProductId() == productId) {
                products[productcount++] = product; // finaly productcount=2 by pre increment
                return;
            }

        }
        System.out.println("Product with ID " + productId + " not found in inventory."); // if he enter id gratter than 3 
        System.out.println("Try another id \n");

    }

    public void removeProduct(int index) {
        if (index >= 0 && index < nproducts) {
            products[index - 1] = null;
        } else {
            System.out.println("Invalid index.");
        }
    }

    public double calculatePrice() {
        double totalprice = 0.0;
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                totalprice += products[i].getPrice();
            }
        }
        return totalprice;

    }

    public void placeOrder(int x) {
        if (x == 1) {
            System.out.println("Order placed successfully for customer: " + customerId);
        } else if (x == 2) {
            System.out.println("Order canceled");
        } else {
            System.out.println("invalid choice for placed");
        }

    }

}
