package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Overflow
        System.out.println("Busted MAX value: " + (myMaxIntValue + 1));

        // Underflow
        System.out.println("Busted MIN value: " + (myMinIntValue -1));

        // `````````````````````````````````````````````````````````````````````````````````

        // Reformatting for readability if preferred
        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        // Probably wont use this type a lot range is small.  Data in that range might be optimized from this though.
        System.out.println("Byte Minimum Value: " + myMinByteValue);
        System.out.println("Byte Maximum Value: " + myMaxByteValue);

        // `````````````````````````````````````````````````````````````````````````````````

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;


        System.out.println("Short Minimum Value: " + myMinShortValue);
        System.out.println("Short Maximum Value: " + myMaxShortValue);

        // `````````````````````````````````````````````````````````````````````````````````

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;


        System.out.println("Long Minimum Value: " + myMinLongValue);
        System.out.println("Long Maximum Value: " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinIntValue /2);

        // Error because it sees the value as an int cant be fixed with casting
//        byte myNewByteValue = (myMinByteValue /2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);

        // Challenge

        byte one = 4;
        short two = 100;
        int three = 66;

        // Long accepts int no casting required
        long four = 50000L + 10L * (one + two + three);
        System.out.println(four);

        short test = (short) (1000 + 10 * (one + two + three));
    }
}
