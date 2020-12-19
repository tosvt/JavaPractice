package ru.m.lab16;

import java.util.HashMap;
import java.util.Map;

class AlcoholRegistry {

    private static volatile AlcoholRegistry instance;
    private static volatile Map <Menu_DrinkType, Boolean> alcoholMap = initMap();
    private AlcoholRegistry(){}

    public static AlcoholRegistry getInstance() {
        if (instance == null){
            synchronized (AlcoholRegistry.class){
                instance = new AlcoholRegistry();
            }
        }
        return instance;
    }

    private static Map<Menu_DrinkType, Boolean> initMap(){
        HashMap<Menu_DrinkType, Boolean> alc = new HashMap<>();
        alc.put(Menu_DrinkType.BEER, true);
        alc.put(Menu_DrinkType.WINE, true);
        alc.put(Menu_DrinkType.VODKA, true);
        alc.put(Menu_DrinkType.BRANDY, true);
        alc.put(Menu_DrinkType.CHAMPAGNE, true);
        alc.put(Menu_DrinkType.WHISKEY, true);
        alc.put(Menu_DrinkType.TEQUILA, true);
        alc.put(Menu_DrinkType.RUM, true);
        alc.put(Menu_DrinkType.VERMUTH, true);
        alc.put(Menu_DrinkType.LIQUOR, true);
        alc.put(Menu_DrinkType.JAGERMEISTER, true);
        return alc;
    }

    boolean check(Menu_DrinkType type){
        return alcoholMap.getOrDefault(type, false);
    }
}
