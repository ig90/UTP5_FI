package zad1.model.flowers;

public class FlowerFactory {
    private String[] flowerNames = {"goździk", "róża", "tulipan", "słonecznik"};
    private Flower[] flowers = new Flower[flowerNames.length];
    private static FlowerFactory instance;

    private FlowerFactory(){
    }

    public static FlowerFactory getInstance(){
        if(instance == null) instance = new FlowerFactory();
        return instance;
    }

    public Flower getFlower(String name){
        for(int i = 0; i < flowerNames.length; i++){
            if(flowerNames.equals(name)){
                if(flowers[i] == null) {
                    if(name.equals("goździk")) flowers[i] = new Carnation();
                    else if(name.equals("róża")) flowers[i] = new Rose();
                    else if(name.equals("tulipan")) flowers[i] = new Tulip();
                    else if(name.equals("słonecznik")) flowers[i] = new Sunflower();
                }

                return flowers[i];
            }
        }

        return null;
    }
}
