package FactoryMethod.PizzaAndCake;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //creating the factory
        FoodFactory foodFactory = new FoodFactory();

        //factory instantiates an object
        Food food = foodFactory.getFood(sc.nextLine());

        System.out.println("The factory returned "+food.getClass());
        System.out.println(food.getType());
    }
}
