/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author Mega Store
 */
public class EcommerceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to E-Commerce System");
        
        ElectronicProduct e = new ElectronicProduct(1, "Smartphone", (float) 599.9, "sam", 2);
        ClothingProduct sh = new ClothingProduct(2, "T-Shirt", (float) 19.99, "medium", "Cotton");
        BookProduct bo = new BookProduct(3, "OOP", (float) 39.99, "O,Railly", "X publication");
        Product[] inventory = new Product[]{e, sh, bo}; // Quick array initialization
       
        System.out.println("please enter your name:");
        String name = in.nextLine();
        System.out.println(".......................");
        System.out.println("please enter your address:");
        String add = in.nextLine();
        System.out.println(".......................");
        System.out.println("please enter your id:");
        int id = in.nextInt();
        System.out.println(".......................");

        Customer cust = new Customer(id, name, add);

        System.out.println("How many products you want to order");
        int num = in.nextInt();
        
        System.out.println();
        
        Cart cart = new Cart(num, id);
        
        for (int i = 0; i < num; i++) {
            System.out.println("Wich product would you like to add: ");
            System.out.println("Available Products:");
            for (Product product : inventory) {  // to show products detail
                System.out.println("ID: " + product.getProductId() + " - " + product.getName() + " ($" + product.getPrice() + ")");
            }

            System.out.print("Enter the product ID to add to the cart or (enter -1 to stop): ");
            int productId = in.nextInt();
            if (productId == -1) {
                break;
            }
            if (productId != -1 && productId != 1 && productId != 2 && productId != 3) {
                i--;
            }

            // Add product to the cart by its ID
            cart.addProductById(productId, inventory);
        }
        int x;
        System.out.println("your total price is: " + cart.calculatePrice() + ". would you like place the order? 1-Yes 2-No");
        x = in.nextInt();
        cart.placeOrder(x);
        System.out.println("==============================");
        
        System.out.println();
        
        if (x == 1) {
            System.out.println("Here`s your order`s summary");
            Order order = new Order(cust.getCustomerId(), 1, cart.getProducts(), cart.calculatePrice());
            order.printOrderinfo();
        } else if (x == 2) {  //need some edit
            System.out.println("you want to remove order and continue shopping 1-yes 2-no");
            int r = in.nextInt();

            if (r == 1) {
                System.out.println("Enter id for product which you want to remove");
                int rm = in.nextInt();
                cart.removeProduct(rm);

                System.out.println("==========================");
                System.out.println("Now your order`s summary is:  ");
                Order order = new Order(cust.getCustomerId(), 1, cart.getProducts(), cart.calculatePrice());
                order.printOrderinfo();

                
            } else if (r == 2) {
                System.out.println("Thank you for shopping");
            } else {
                System.out.println("invalid choice");
            }
        }

    }
}

//hints for continue
//name in first name only done
//array make for loop not stop done
// cannot show summery of products
