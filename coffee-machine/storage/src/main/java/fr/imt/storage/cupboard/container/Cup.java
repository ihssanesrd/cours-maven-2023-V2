package fr.imt.storage.cupboard.container;

public class Cup extends Container{

    public Cup(double capacity){
        super(capacity);
    }

    public Cup(Container container){
        super(container);
    }
}