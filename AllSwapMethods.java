public class AllSwapMethods {

    public static void main(String[] args) {

        int a, b;

        // 1️⃣ Swap Using Third Variable
        a = 10;
        b = 20;
        System.out.println("----- Swap Using Third Variable -----");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap:  a = " + a + ", b = " + b);
        System.out.println();


        // 2️⃣ Swap Without Third Variable (Using + and -)
        a = 10;
        b = 20;
        System.out.println("----- Swap Using + and - -----");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:  a = " + a + ", b = " + b);
        System.out.println();


        // 3️⃣ Swap Without Third Variable (Using * and /)
        a = 10;
        b = 20;
        System.out.println("----- Swap Using * and / -----");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After Swap:  a = " + a + ", b = " + b);
        System.out.println();


        // 4️⃣ Swap Using Bitwise XOR
        a = 10;
        b = 20;
        System.out.println("----- Swap Using Bitwise XOR -----");
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After Swap:  a = " + a + ", b = " + b);
    }
}
