package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        //declaring Arraylist of String objects
        ArrayList<String> myList = new ArrayList<String>();
        //Adding objects to Array List at default index
        myList.add("Strawberry");
        myList.add("Grapes");
        myList.add("Pineapple");
        //Adding object at specific index
        myList.add(3, "Mango");
        myList.add(1, "Apple");

        System.out.println("Objects :");
        for(String s:myList){
            System.out.println(s);
        }

        System.out.println("3rd element : " + myList.get(2));
        System.out.println("Is Dragon fruit is present: " + myList.contains("Dragon fruit"));
        System.out.println("ArrayList Size: " + myList.size());

        myList.remove("Apple");

        System.out.println("New Size of ArrayList: " + myList.size());
    }
}
