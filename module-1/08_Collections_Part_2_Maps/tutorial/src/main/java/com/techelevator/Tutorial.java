package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Tutorial {
	

    public static void main(String[] args) {

        // Step One: Declare a Map

        Map<String, String> projects = new HashMap<>();
    	
    	// Step Two: Add items to a Map

    	projects.put("Gary", "invented wind");
        projects.put("Ben", "invented corn");
        projects.put("Richard", "invented inventing");

    	// Step Three: Loop through a Map

        for(Map.Entry<String, String> project : projects.entrySet()) {
            System.out.println("The key " + project.getKey() + " is linked to the value " + project.getValue());
        }
        }

    }


