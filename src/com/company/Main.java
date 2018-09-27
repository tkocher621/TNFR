package com.company;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Main {

    public static String ToHex(char i)
    {
        return Integer.toHexString(i);
    }
    public static String ToBinary(char i)
    {
        return Integer.toBinaryString(i);
    }
    public static String ToOctal(char i)
    {
        return Integer.toOctalString(i);
    }
    public static String ToDecimal(char i)
    {
        return Integer.toString((int)i);
    }

    public static int GetRandomNumber(int min, int max)
    {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char[] inputChar = input.toCharArray();

        Map<Integer, String> strDict = new HashMap<Integer, String>();

        int a = GetRandomNumber(1, 5); // Position in sequence
        int b = GetRandomNumber(0, inputChar.length-1); // Position in char array
        int c = 0; // Count
        while (c < inputChar.length)
        {
            if (a == 1)
            {
                strDict.put(b, ToBinary(inputChar[b]));
                System.out.println(inputChar[b] + " - " + ToBinary(inputChar[b]) + " - " + b);
            }
            else if (a == 2)
            {
                strDict.put(b, ToOctal(inputChar[b]));
                System.out.println(inputChar[b] + " - " + ToOctal(inputChar[b]) + " - " + b);
            }
            else if (a == 3)
            {
                strDict.put(b, ToDecimal(inputChar[b]));
                System.out.println(inputChar[b] + " - " + ToDecimal(inputChar[b]) + " - " + b);
            }
            else if (a == 4)
            {
                strDict.put(b, ToHex(inputChar[b]));
                System.out.println(inputChar[b] + " - " + ToHex(inputChar[b]) + " - " + b);
            }
            else if (a == 5)
            {
                strDict.put(b, Character.toString(inputChar[b]));
                System.out.println(Integer.toString(inputChar[b]));
            }
            c++;
            b = (b == inputChar.length-1) ? 0 : b+1;
            a = (a == 5) ? 1 : a+1;
        }

        String fs = "";

        for(Map.Entry<Integer, String> entry : strDict.entrySet())
            fs+= entry.getValue();

        System.out.println(fs);
    }
}
