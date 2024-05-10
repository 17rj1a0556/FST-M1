package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        // Adding element to HashSet
        hs.add("Book");
        hs.add("Author");
        hs.add("Teasers");
        hs.add("Fanpages");
        hs.add("Trope");
        hs.add("Genre");

        //Print HashSet
        System.out.println("Original : " + hs);
        //Print size of HashSet
        System.out.println("HashSet Size: " + hs.size());

        //Remove element
        System.out.println("Removing : " + hs.remove("Fanpages"));
        //Remove element that is not present
        if(hs.remove("Trope")) {
            System.out.println("Trope gone");
        } else {
            System.out.println("There is no trope");
        }

        //Search for element
        System.out.println("Checking if Author is present: " + hs.contains("Author"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}