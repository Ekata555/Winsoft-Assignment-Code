package Assignments;

import java.util.HashSet;
import java.util.Set;

public class Duplichar {
	 public static void main(String[] args) {
	        String input = "This is winsoft online assignment";
	        Set<Character> duplicates = findDuplicates(input);
	        
	        System.out.println("Duplicate characters in the string '" + input + "' are:");
	        for (Character ch : duplicates) {
	            System.out.print(ch + " ");
	        }
	    }

	    public static Set<Character> findDuplicates(String str) {
	        Set<Character> set = new HashSet<>();
	        Set<Character> duplicates = new HashSet<>();

	        for (char ch : str.toCharArray()) {
	            if (!set.add(ch)) {
	                duplicates.add(ch);
	            }
	        }
	        return duplicates;
	    }
}
