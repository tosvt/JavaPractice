package ru.m.lab16;

public final class Menu_Drink extends Menu_MenuItem implements Menu_Alcoholable{

    private final double alcoholVal;
    private final Menu_DrinkType type;

    public Menu_Drink(int cost, String name, String description, double alcoholVal, Menu_DrinkType type) {
        super(cost, name, description);
        this.alcoholVal = alcoholVal;
        this.type = type;
    }

    public Menu_Drink(String name, String description, double alcoholVal, Menu_DrinkType type) {
        super(name, description);
        this.alcoholVal = alcoholVal;
        this.type = type;
    }

    @Override
    public boolean isAlcoholicDrink() {
        return AlcoholRegistry.getInstance().check(type);
    }

    @Override
    public double getAlcoholValue() {
        return alcoholVal;
    }
}

