package SaturdayJan21.HashMap;

import SaturdayJan21.OptionalClass.User;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String,String> creds = new HashMap();
        creds.put("Rajan", "Rajan123"); // Rajan -> 4455 % 16 = 9
        creds.put("pankaj", "Pankaj123"); // pankaj -> 5566 % 16 = 3
        creds.put("Arpinder", "Arpinder123");// Arpinder -> 6677 % 16 = 9
        creds.put("Sukhjeet", "Sukhjeet123");// Sukhjeet -> 6677 % 16 = 9
        creds.put("Sukhjeet", "Gill123"); // Sukhjeet -> 6677 % 16 = 9
        creds.get("Sukhjeet"); // Sukhjeet -> 6677 -> 9

    }
}
