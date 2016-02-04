package com.cs442.ppatil5_a6;

/**
 * Created by Priyanka on 9/26/2015.
 */
public class FoodItem {
    private int id;
    private String name;
    private double price;

    private String shortDesc;
    private String ingredients;
    private String cookingStyle;


    public FoodItem(){
    }

    public FoodItem(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public FoodItem(int id, String name, double price, String shortDesc, String ingredients, String cookingStyle) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shortDesc = shortDesc;
        this.ingredients = ingredients;
        this.cookingStyle = cookingStyle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getCookingStyle() {
        return cookingStyle;
    }

    public void setCookingStyle(String cookingStyle) {
        this.cookingStyle = cookingStyle;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}