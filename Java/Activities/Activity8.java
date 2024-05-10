package Activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity8 {
    public static void main(String[] a){
        try {
            // Method call with correct input
            Activity8.exceptionTest("console Print");
            // Method call with incorrect input
            Activity8.exceptionTest(null); // Exception is thrown here
            Activity8.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("catch block Message: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("Value is null");
        } else {
            System.out.println(str);
        }
    }
}
