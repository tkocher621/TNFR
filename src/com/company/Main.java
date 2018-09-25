package com.company;
import java.util.*;

public class Main {

    public static String ToHex(int i)
    {
        return Integer.toHexString(i);
    }
    public static String ToBinary(int i)
    {
        return Integer.toBinaryString(i);
    }
    public static String ToOctal(int i)
    {
        return Integer.toOctalString(i);
    }
    public static int ToDecimal(char i)
    {
        return (int)i;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char[] inputChar = input.toCharArray();

        System.out.println(ToDecimal('c'));

    }
}
