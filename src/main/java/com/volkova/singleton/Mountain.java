package main.java.com.volkova.singleton;

public class Mountain {
    private static Mountain instance;
    public static String name;

    private Mountain (String name){
        this.name = name;
    }

    public static void getInstance(String name){
        if (instance == null){
            instance = new Mountain(name);
        }
    }
}
