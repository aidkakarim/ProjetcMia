public class DataTypes {
    public static void main(String[] args) {


        // Primitive data types

        // Whole numbers

        byte b = 10, b1 =11;
        short s = 20;
        int i = 30;
        long l = 40;

        // Decimal numbers

        float ff = 1.5f;
        double dd = 2.5d, dd2 = 3.50d;


        // Character data types

        char c = '$', c2 = '*', c3 = '+';

        // Boolean data types

        boolean bb = true, bb2 = false;

        // Sum of variables byte

        byte myByte = (byte) (b1+b);
        System.out.println("The sum of my Byte : " + b + "and " + b1 + " is equal to : " + myByte );

        // Deduction of variable double

        double myDouble = (double) (dd-dd2);
        System.out.println("The deduction of my Double : " + dd + " and " + dd2 + " is equal to : " + myDouble);

        //Byte  and combining function

        byte byte1 =5, byte2 =10, byte3= (byte) (byte1 +byte2);
        System.out.println(byte3);

        //Short and subtracting function

        short short1 = 1000, short2 = 500, short3 = (short) (short1-short2);
        System.out.println( "The difference is : " + short3);

        // Integer  function

        int int1 = 10000, int2 = 500000, int3 = int1+int2;
        System.out.println(int3);

        //Long and combining function

        long long1 = 50, long2 = 100, long3 = long1+long2;
        System.out.println(long3);

        // Float and combining function

        float float1 = 10.55f, float2 = 5.95f, float3 = float1+ float2;
        System.out.println(float3);

        //Double and subtraction function

        double double1 =3.5, double2 = 6.8d, double3 = double1-double2;
        System.out.println(double3);

        // Task : eggs, milk, bread, apples and honey.

        // Casting smaller to larger
        float eggs = 3.99f;
        double eggsD = eggs;


        byte milk = 6;
        double bread = 4.50;
        long apple = 10;

        // Casting larger to smaller , explicit casting.
        int honey = 100;
        short honeyS = (short) honey; // Have to cast the same as variable

        int sum = honey +milk;
        int sum2= (int)(honey+apple);

        float sum3 = (float) (bread + apple+ milk+eggsD);








































    }
}
