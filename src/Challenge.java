public class Challenge {
    public static void main(String[] args) {
       System.out.println("5ft 8 = " + convertToCentimeters(5, 8) + "cm");
       System.out.println("5 inche " + convertToCentimeters(5) + "cm");
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches ) {
        double v = convertToCentimeters((feet * 12) + inches);
        return v;
    }
//    public static double convertToCentimeters(int feet, int inches ) {
//        return ((feet * 12) + inches) * 2.54;
//    }
}
