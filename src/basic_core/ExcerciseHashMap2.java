package basic_core;

import java.util.HashMap;
import java.util.Map;

class Books {
	int id;
	String name;
	String author;
	String publisher;
	int quantity;
	
	public Books(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}

public class ExcerciseHashMap2 {	
	public static void main(String[] args) {		
		HashMap<Integer, Books> hashMap = new HashMap<Integer, Books>();
		
		Books book1 = new Books(11, "Stranger in the mirror", "sidney sheldon", "American", 10);
		Books book2 = new Books(12, "The Secret", "Rhonda Byrne", "American", 12);
		Books book3 = new Books(13, "Whol will cry when you die", "Robin Sharma", "American", 16);
		Books book4 = new Books(14, "Mrutyunjay", "Sawant", "American", 18);
		
		hashMap.put(1, book1);
		hashMap.put(2, book2);
		hashMap.put(3, book3);
		hashMap.put(4, book4);
		
		// traverse hashMap
		for(Map.Entry<Integer, Books> entry:hashMap.entrySet()){    
	        int key = entry.getKey();  
	        Books b = entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);   
	    } 


		
	}
}
