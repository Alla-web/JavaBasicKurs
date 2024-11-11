package lesson_42.selfLearning;

import java.util.HashMap;
import java.util.Map;

public class MilkPrice {
    /*
    Напишите программу, которая создает карту Map<String, Integer>,
    где ключом является название товара, а значением — его цена.
    Затем, используя итератор, пройдите по всем записям карты и выведите
    на экран только те товары, цена которых выше заданного значения.

Инструкции:
Создайте Map<String, Integer> и добавьте несколько товаров с ценами.
Задайте пороговую цену.
Используя итератор, пройдите по записям карты и выведите название и цену
только тех товаров, которые дороже порогового значения.
     */
    public static void main(String[] args) {
        Map<String, Double> productsPrices = new HashMap<>();
        productsPrices.put("milk", 1.9);
        productsPrices.put("bread", 1.1);
        productsPrices.put("juice", 2.1);
        productsPrices.put("eggs", 2.7);
        productsPrices.put("apple", 2.5);
        System.out.println(productsPrices);

        double boundaryPrice = 2.0;

        /*for (Map.Entry<String, Integer> entry : productsPrices.entrySet()) {
            if (entry.getValue() > boundaryPrice) {
                System.out.println(productsPrices.entrySet());
            }
        }

         */


    }

}
