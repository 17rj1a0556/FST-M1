package Activities;


interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {

        // Lambda expression without return keyword.
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(30, 50));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(10, 20));
    }
}