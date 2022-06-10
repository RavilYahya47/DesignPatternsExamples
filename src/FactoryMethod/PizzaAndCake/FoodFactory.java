package FactoryMethod.PizzaAndCake;

public class FoodFactory {
    public Food getFood(String foodType){
        if(foodType.equals("Cake"))
            return new Cake();
        else if(foodType.equals("Pizza"))
            return new Pizza();
        else return null;
    }
}
