

public class TestOperators {
    public static void main(String[] args) {
        int x = -128;
        int y = -32768;
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("y / x = " + (y / x));
        System.out.println("y % x = " + (y % x));
        System.out.println("x++   = " + (x++));
        System.out.println("x--   = " + (x--));
        System.out.println("y++   = " + (y++));
        System.out.println("++y   = " + (++y));
        int a = 50;
        int b = 10;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a == b = " + (a == b));
        System.out.println("b >= a = " + (b >= a));
        System.out.println("b <= a = " + (b <= a));
        System.out.println("a-- = " + (--b));

        String name = "denis";
        boolean result = name instanceof String;
        System.out.println(result);

        byte c = 20;
        byte r = 60;
        byte s = (byte) (c * r);
        System.out.print("Result overflow " + s);


        boolean lesson = false;
        if (lesson) {
            System.out.println("Basics");
        } else {
            System.out.println("Java");

            int liter_of_gasoline = 45;
            double month = 12;
            int days_in_a_month = 365;
            double Liters_per_year = ( days_in_a_month * liter_of_gasoline ); // Если заправляться каждый день
            System.out.print("Liters_per_year");




        }
    }
}



