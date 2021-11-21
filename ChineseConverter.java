package com.company.itStep;

import java.util.HashMap;
import java.util.Scanner;

public class ChineseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(
                System.in
        );
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "\u4e00");
        hmap.put(2, "\u4e8c");
        hmap.put(3, "\u4e09");
        hmap.put(4, "\u56db");
        hmap.put(5, "\u4e94");
        hmap.put(6, "\u516d");
        hmap.put(7, "\u4e03");
        hmap.put(8, "\u516b");
        hmap.put(9, "\u4e5d");
        hmap.put(10, "\u5341");
        hmap.put(100, "\u767e");
        hmap.put(1000, "\u5343");

        String s = "";
        int number0 = number;
        while (number > 0) {
            s = s.concat(Integer.toString(number % 10));
            number = number / 10;
        }
        // System.out.println(s);

        int ones = 0, tens = 0, hundreds = 0;
        String sOnes = String.valueOf(s.charAt(0));
        ones = Integer.parseInt(sOnes);
        if (number0 > 9) {
            String sTens = String.valueOf(s.charAt(1));
            tens = Integer.parseInt(sTens);
        }
        if (number0 > 99) {
            String sHundreds = String.valueOf(s.charAt(2));
            hundreds = Integer.parseInt(sHundreds);
        }
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hundreds);

        s = "";
        if (hundreds == 1)
            s = s.concat(hmap.get(100));
                    else if (hundreds != 0)
                        s = s.concat(hmap.get(hundreds)).concat(hmap.get(100));

        s = "";
        if (tens == 1)
            s = s.concat(hmap.get(10));
        else if (tens != 0)
            s = s.concat(hmap.get(tens)).concat(hmap.get(10));
        if (ones !=0)
            s = s.concat(hmap.get(ones));
        System.out.println(s);

    }
}

