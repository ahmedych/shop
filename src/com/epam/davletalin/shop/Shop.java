package com.epam.davletalin.shop;
import com.epam.davletalin.shop.Depo.*;

public class Shop {
    public static void main(String[] args) {
        CashRegister kassa1=new CashRegister();
        CashRegister kassa2=new CashRegister();
        CashRegister kassa3=new CashRegister();
        CustomerFactory factory=new CustomerFactory();
        for (int i = 0; i < 100; i++) {
            Customer customer=factory.getCustomer();
            customer.name=i+" client";
            customer.fillCart();
            System.out.println(customer);
        }

    }
}
