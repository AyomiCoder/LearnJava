package learnJava;

public class Cast {

	public static void main(String[] args) {
		int a = 215;
        byte b = 0x5F;
        double c = 20.36;
        float d = 12.02f;
        long e = 2 ^ 32; // Note: 2 ^ 32 is XOR, not power of 2.

        int res1 = a + b + 5; // Result is int.
        double res2 = c - e + d - a; // Result is double.
        float res3 = a + b + d + e; // Result is float.
        long res4 = e - 2 * a + b; // Result is long.

        double resSum = res1 + res2 + res3 + res4; // Result is double.
        System.out.println(resSum);
	}
}
