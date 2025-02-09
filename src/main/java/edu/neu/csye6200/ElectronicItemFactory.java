package edu.neu.csye6200;

public class ElectronicItemFactory implements FactoryInterface{
    private static ElectronicItemFactory instance;

    private ElectronicItemFactory(){

    }

    public static ElectronicItemFactory getInstance(){
        if(instance == null){
            instance = new ElectronicItemFactory();
        }
        return instance;
    }

    @Override
    public Item createItem(String csv_String){
        return new ElectronicItem(csv_String);
    }
    
}
