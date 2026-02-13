package Tnsif_d6.Tnsif_d6;

public class TryWrapperClass {
	public static void main(String[] args) {
        // Primitive types
        int primitInt = 12;
        double primitDouble =13.12;

        // Wrapping primitives into wrapper objects
        Integer wrapperInt = Integer.valueOf(primitInt);
        Double wrapperDouble = Double.valueOf(primitDouble);

        // Auto-boxing (primitive to  wrapper)
        Integer autoBoxedInt = 30;
        Double autoBoxedDouble = 40.5;

        // Unboxing (wrapper to primitive)
        int unboxedInt = wrapperInt;
        double unboxedDouble = wrapperDouble;

        //  wrapper methods
        String str = "1213";
        int parsedInt = Integer.parseInt(str);

        System.out.println("Primitive int: " + primitInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Auto-boxed Integer: " + autoBoxedInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println("Parsed int from string: " + parsedInt);
    }
}
