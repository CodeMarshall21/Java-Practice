package com.Arrays.HeterogeneousArray.Excercise1;

public class Main {
    public static void main(String[] args) {

        Product[] items = {
            new Product("Soap",2003,21.6),
            new Product("Comb",2004,25.2),
            new Product("Shampoo",2010,81.6),
            new Product("Brush",2003,59.62),
        };

        for (Product item: items){
            item.showProduct();
        }
    }
}
