package zad1.model.containers;

import zad1.model.flowers.Flower;
import zad1.model.pricelist.Pricelist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class AbstractContainer implements Container {
    private List<Flower> flowers;

    public AbstractContainer(){
        flowers = new ArrayList<>();
    }

    @Override
    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    @Override
    public void addAll(Collection<Flower> flowers) {
        this.flowers.addAll(flowers);
    }

    @Override
    public double sum() {
        double sum = 0.00;
        Pricelist pl = Pricelist.getInstance();
        for(Flower f : flowers){
            Double price = pl.getPrice(f);
            if(price != null) sum += price;
        }

        return sum;
    }

    @Override
    public Collection<Flower> getAll() {
        return flowers;
    }
}
