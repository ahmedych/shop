package com.epam.davletalin.shop;

import java.util.Random;

public class CustomerFactory {
    Random random=new Random();
    Customer getCustomer(){
        Customer customer=new Customer();
        customer.wallet=random.nextInt(500000);
        return customer;
    }

}
