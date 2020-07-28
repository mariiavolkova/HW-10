package main.java.com.volkova.singleton;

public class Mountain {
    private String name;
    private static Mountain instance;

    public static Mountain getInstance(String name){
        if (instance == null){
            instance = new Mountain();
        }
        return null;
    }
}
