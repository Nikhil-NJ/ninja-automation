package basic_core;

import java.util.HashMap;
import java.util.Map; 
  
public class ExcerciseHashmap3 { 
    public static void main(String[] args) 
    { 
        // Create an empty hash map 
        HashMap<String, Integer> map = new HashMap<>(); 
  
        // Add elements to the map 
        map.put("Nikhil", 10); 
        map.put("Khurram", 30); 
        map.put("Discovery", 20); 
  
        // Print size and content 
        System.out.println("Size of map is:- " + map.size()); 
        
        System.out.println(map); 
  
        // Check if a key is present and if 
        // present, print value 
        if (map.containsKey("Discovery")) { 
            Integer value = map.get("Discovery"); 
            System.out.println("value for key" + " \"Discovery\" is:- " + value + "\n"); 
        } 
        
        for (Map.Entry<String, Integer> e : map.entrySet()) 
            System.out.println(e.getKey() + " " + e.getValue()); 
    } 
} 