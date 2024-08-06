package com.gentech.gettersetter;

class Animals {
    String animalType;
    int averageLifeSpan;
    Domestic dom = new Domestic();

    public String getSpeciesName() {
        return dom.getSpeciesName();
    }

    public void setSpeciesName(String speciesName) {
        dom.setSpeciesName(speciesName);
    }

    public String getFoodItem() {
        return dom.getFoodItem();
    }

    public void setFoodItem(String foodItem) {
        dom.setFoodItem(foodItem);
    }

    private class Domestic {
        private String speciesName;
        private String foodItem;

        public String getSpeciesName() {
            return speciesName;
        }

        public void setSpeciesName(String speciesName) {
            this.speciesName = speciesName;
        }

        public String getFoodItem() {
            return foodItem;
        }

        public void setFoodItem(String foodItem) {
            this.foodItem = foodItem;
        }
    }
}

public class Program1 {
    public static void main(String[] args) {
        Animals ob = new Animals();
        ob.animalType = "Domestic";
        ob.averageLifeSpan = 20;
        ob.setSpeciesName("Dog");
        ob.setFoodItem("Milk, Meat");

        String animalType = ob.animalType;
        int averageLifeSpan = ob.averageLifeSpan;
        String speciesName = ob.getSpeciesName();
        String foodItem = ob.getFoodItem();

        System.out.println("Animal Type: " + animalType + ", Average Lifespan: " + averageLifeSpan + ", Species Name: " + speciesName + ", Food: " + foodItem);
    }
}
