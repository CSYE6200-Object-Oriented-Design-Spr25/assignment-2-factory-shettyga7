package edu.neu.csye6200;

public class ServiceItemFactory implements FactoryInterface{
    private static final ServiceItemFactory instance = new ServiceItemFactory();
    
    private ServiceItemFactory(){

    }

    public static ServiceItemFactory getInstance(){
        return instance;
    }

    @Override
    public Item createItem(String csv_String){
        return new ServiceItem(csv_String);
    }
}
