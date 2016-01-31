package zad1.model.pricelist;

import zad1.model.flowers.Flower;

import java.util.HashMap;
import java.util.Map;

public class Pricelist {
    private static Pricelist instance;
    private Map<String, Double> prices;

    private Pricelist(){
        prices = new HashMap<>();
    }

    public static Pricelist getInstance() {
        if(instance == null) instance = new Pricelist();
        return instance;
    }

    public Double getPrice(Flower flower){
        return prices.get(flower.getName());
    }

    public void putPrice(Flower flower, double price){
        prices.put(flower.getName(), price);
    }
}
