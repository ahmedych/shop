package com.epam.davletalin.shop;

import com.epam.davletalin.shop.Depo.*;

import java.util.*;

public class Customer {
    String name;
    int wallet;
    Map<String,Integer> cartInside=new HashMap<>();
    List<Goods> cart = new ArrayList<>();


    void fillCart() {
        GoodsFactory factory=new GoodsFactory();
        int randomItemCount = new Random().nextInt(100);

        for (int i = 0; i < randomItemCount; i++) {
            int randomlyChoosenItem=new Random().nextInt(GoodsEnum.values().length);
            String toPut=factory.getGoods(GoodsEnum.values()[randomlyChoosenItem]).getClass().getSimpleName();
            //cart.add(factory.getGoods(GoodsEnum.values()[randomlyChoosenItem]));
            cartInside.putIfAbsent(toPut,0);
            cartInside.computeIfPresent(toPut,(key,value)->value+1);
        }
    }

    void pay() {

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", cartInside=" + cartInside +
                '}';
    }
}
