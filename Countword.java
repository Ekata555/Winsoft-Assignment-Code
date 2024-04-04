package Assignments;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Countword {
	 public static void main(String[] args)
	    {
	 
	        String str = "I love Dance and I love singing";
	        Map<String, Integer> hashMap = new HashMap<>();

	        String[] words = str.split(" ");
	 
	        for (String word : words) {

	            Integer integer = hashMap.get(word);
	 
	            if (integer == null)
	                hashMap.put(word, 1);
	            else {
	                hashMap.put(word, integer + 1);
	            }
	        }
	        System.out.println(hashMap);
	    }
}