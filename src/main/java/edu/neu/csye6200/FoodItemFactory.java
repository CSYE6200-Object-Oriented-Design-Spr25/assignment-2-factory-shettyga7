package edu.neu.csye6200;

public class FoodItemFactory implements FactoryInterface{
    @Override
    public Item createItem(String csv_String){
        return new FoodItem(csv_String);
    }
}
