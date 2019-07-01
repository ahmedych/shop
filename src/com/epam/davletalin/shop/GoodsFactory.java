package com.epam.davletalin.shop;

import com.epam.davletalin.shop.Depo.*;

public class GoodsFactory {
    Goods getGoods(GoodsEnum goods) {
        Goods toReturn;
        switch (goods) {
            case EGG:
                toReturn = new Egg();
                break;
            case MEAT:
                toReturn = new Meat();
                break;
            case RICE:
                toReturn = new Rice();
                break;
            case SUGAR:
                toReturn = new Sugar();
                break;
            case CAP:
                toReturn = new Cap();
                break;
            case PANTS:
                toReturn = new Pants();
                break;
            case SOCKS:
                toReturn = new Socks();
                break;
            case UNDERWEAR:
                toReturn = new Underwear();
                break;
            default:
                throw new IllegalArgumentException("Wrong coffee type:" + goods);        }
        return toReturn;
    }
}
