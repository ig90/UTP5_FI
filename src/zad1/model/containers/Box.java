package zad1.model.containers;

public class Box extends AbstractContainer {
    public Box(ShoppingCart sc){
        pack(sc);
    }

    public void pack(ShoppingCart sc){
        addAll(sc.getAll());
        sc.getAll().clear();
    }
}
