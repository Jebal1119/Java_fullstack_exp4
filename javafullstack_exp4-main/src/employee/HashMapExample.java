package employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {

        // Create HashMap
    	 System.out.println("URK23CS1134");
        HashMap<String, String> map = new HashMap<>();

        // Add employee details
        map.put("101", "Pavarna");
        map.put("102", "Uday");
        map.put("103", "Sainath");
        map.put("104", "Pranu");

        // Check whether key 102 exists
        String key = "102";

        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists.");
        } else {
            System.out.println("Key " + key + " does not exist.");
        }

        // Check whether value Sainath exists
        String value = "Sainath";

        if (map.containsValue(value)) {
            System.out.println("Value " + value + " exists.");
        } else {
            System.out.println("Value " + value + " does not exist.");
        }

       

        System.out.println("\nHashMap elements:");

        // Display all elements using Iterator
        Iterator<Map.Entry<String, String>> iterator =
                map.entrySet().iterator();

        while (iterator.hasNext()) {

            Map.Entry<String, String> entry = iterator.next();

            System.out.println(
                    "Key: " + entry.getKey() +
                    ", Value: " + entry.getValue()
            );
        }
    }
}