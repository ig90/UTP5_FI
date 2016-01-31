package zad1.model.containers;

import zad1.model.flowers.Flower;

import java.util.Collection;

public interface Container {
    void addFlower(Flower flower);
    void addAll(Collection<Flower> flowers);
    double sum();
    Collection<Flower> getAll();
}
