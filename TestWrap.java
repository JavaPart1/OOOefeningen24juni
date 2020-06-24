package be.vdab.OefWrapper;

public class TestWrap {
    public static void main(String[] args) {
        int testint = 4;
        String testStr = "56";

        Double testDob = (double) testint; //typecasting
        Integer testInt = Integer.valueOf(testStr);
        String resStr = Integer.toString(testint);
        System.out.println("Integer to String");
        System.out.println("Integer : " + testint);
        System.out.println("String : " + resStr);
        System.out.println("en omgekeerd...");
        System.out.println("String : " + testStr);
        System.out.println("Integer : " + testInt);
    }

}
