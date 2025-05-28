public class Main {
    public static void main(String[] args) {
        // Define some example variables
        int a = 60; // In binary: 0011 1100
        int b = 13; // In binary: 0000 1101

        // Bitwise AND (&)
        int andResult = a & b;
        System.out.println("a & b: " + andResult);
        System.out.println("Binary representation of a & b: " + Integer.toBinaryString(andResult));

        // Bitwise OR (|)
        int orResult = a | b;
        System.out.println("a | b: " + orResult);
        System.out.println("Binary representation of a | b: " + Integer.toBinaryString(orResult));

        // Bitwise XOR (^)
        int xorResult = a ^ b;
        System.out.println("a ^ b: " + xorResult);
        System.out.println("Binary representation of a ^ b: " + Integer.toBinaryString(xorResult));

        // Bitwise NOT (~)
        int notResult = ~a;
        System.out.println("~a: " + notResult);
        System.out.println("Binary representation of ~a: " + Integer.toBinaryString(notResult));

        // Left shift (<<)
        int leftShiftResult = a << 2; // Shifts the bits of 'a' 2 positions to the left
        System.out.println("a << 2: " + leftShiftResult);
        System.out.println("Binary representation of a << 2: " + Integer.toBinaryString(leftShiftResult));

        // Right shift (>>)
        int rightShiftResult = a >> 2; // Shifts the bits of 'a' 2 positions to the right
        System.out.println("a >> 2: " + rightShiftResult);
        System.out.println("Binary representation of a >> 2: " + Integer.toBinaryString(rightShiftResult));

        // Unsigned right shift (>>>)
        int unsignedRightShiftResult = a >>> 2; // Shifts the bits of 'a' 2 positions to the right with zero fill
        System.out.println("a >>> 2: " + unsignedRightShiftResult);
        System.out.println("Binary representation of a >>> 2: " + Integer.toBinaryString(unsignedRightShiftResult));
    }
}
