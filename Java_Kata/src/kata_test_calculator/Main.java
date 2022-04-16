package kata_test_calculator;

import java.util.Scanner;

class Main {
    public static String calc(String input) throws InvalidInputException {

        String[] arr1 = input.split(" ", 3);

        if ((arr1[0].contains("1") || arr1[0].contains("2") || arr1[0].contains("3") || arr1[0].contains("4") || arr1[0].contains("5") || arr1[0].contains("6") || arr1[0].contains("7") || arr1[0].contains("8") || arr1[0].contains("9") || arr1[0].contains("10"))
                & (arr1[2].contains("1") || arr1[2].contains("2") || arr1[2].contains("3") || arr1[2].contains("4") || arr1[2].contains("5") || arr1[2].contains("6") || arr1[2].contains("7") || arr1[2].contains("8") || arr1[2].contains("9") || arr1[2].contains("10"))
                & (arr1[1].contains("+") || arr1[1].contains("-") || arr1[1].contains("*") || arr1[1].contains("/"))) {
            int numOne = Integer.parseInt(arr1[0]);
            int numTwo = Integer.parseInt(arr1[2]);
            int resArabNum;

            if (numOne < 1 || numOne > 10 || numTwo < 1 || numTwo > 10) {
                throw new InvalidInputException("Вы ввели числа не подходящие под условия!");
            }

            switch (arr1[1]) {
                case ("+"):
                    resArabNum = numOne + numTwo;
                    System.out.println(resArabNum);
                    break;
            }

            switch (arr1[1]) {
                case ("-"):
                    resArabNum = numOne - numTwo;
                    System.out.println(resArabNum);
                    break;
            }

            switch (arr1[1]) {
                case ("*"):
                    resArabNum = numOne * numTwo;
                    System.out.println(resArabNum);
                    break;
            }

            switch (arr1[1]) {
                case ("/"):
                    resArabNum = numOne / numTwo;
                    System.out.println("Output:" +resArabNum);
                    break;
            }

        } else if ((arr1[0].contains("I") || arr1[0].contains("II") || arr1[0].contains("III") || arr1[0].contains("IV") || arr1[0].contains("V") || arr1[0].contains("VI") || arr1[0].contains("VII") || arr1[0].contains("VIII") || arr1[0].contains("IX") || arr1[0].contains("X"))
                & (arr1[2].contains("I") || arr1[2].contains("II") || arr1[2].contains("III") || arr1[2].contains("IV") || arr1[2].contains("V") || arr1[2].contains("VI") || arr1[2].contains("VII") || arr1[2].contains("VIII") || arr1[2].contains("IX") || arr1[2].contains("X"))
                & (arr1[1].contains("+") || arr1[1].contains("-") || arr1[1].contains("*") || arr1[1].contains("/"))) {

            int romanNumOne = 0;
            int romanNumTwo = 0;
            int resRomanNum;
            String resRomanString;
            for (EnumRomanNumerals arrRomanOne : EnumRomanNumerals.values()) {
                if (arr1[0].equals(arrRomanOne.getRomanName())) {
                    romanNumOne = arrRomanOne.getRomanToArabNum();
                    if (romanNumOne < 1 || romanNumOne > 10) {
                        throw new InvalidInputException("Вы вводите некорректные данные, диапазон для римских цифр: от I до X включительно");
                    }
                }
            }

            for (EnumRomanNumerals arrRomanTwo : EnumRomanNumerals.values()) {
                if (arr1[2].equals(arrRomanTwo.getRomanName())) {
                    romanNumTwo = arrRomanTwo.getRomanToArabNum();
                    if (romanNumTwo < 1 || romanNumTwo > 10) {
                        throw new InvalidInputException("Вы вводите некорректные данные, диапазон для римских цифр: от I до X включительно");
                    }
                }
            }

            if (romanNumOne == 0 || romanNumTwo == 0) {
                throw new InvalidInputException("Вы вводите некорректные данные, диапазон для римских цифр: от I до X включительно");
            }

            switch (arr1[1]) {
                case ("+"):
                    resRomanNum = romanNumOne + romanNumTwo;
                    String fromIntToStringRes = Integer.toString(resRomanNum);
                    for (EnumRomanNumerals arrRomanExam1 : EnumRomanNumerals.values()) {
                        if (resRomanNum == (arrRomanExam1.getRomanToArabNum())) {
                            resRomanString = arrRomanExam1.getRomanName();
                            System.out.println(resRomanString);
                        }
                    }
                    break;
            }

            switch (arr1[1]) {
                case ("-"):
                    resRomanNum = romanNumOne - romanNumTwo;
                    if (resRomanNum < 1) {
                        throw new InvalidInputException("Римские цифры не могут быть меньше I");
                    }
                    String fromIntToStringRes = Integer.toString(resRomanNum);
                    for (EnumRomanNumerals arrRomanExam1 : EnumRomanNumerals.values()) {
                        if (resRomanNum == (arrRomanExam1.getRomanToArabNum())) {
                            resRomanString = arrRomanExam1.getRomanName();
                            System.out.println(resRomanString);
                        }
                    }
                    break;
            }

            switch (arr1[1]) {
                case ("*"):
                    resRomanNum = romanNumOne * romanNumTwo;
                    String fromIntToStringRes = Integer.toString(resRomanNum);
                    for (EnumRomanNumerals arrRomanExam1 : EnumRomanNumerals.values()) {
                        if (resRomanNum == (arrRomanExam1.getRomanToArabNum())) {
                            resRomanString = arrRomanExam1.getRomanName();
                            System.out.println(resRomanString);
                        }
                    }
                    break;
            }

            switch (arr1[1]) {
                case ("/"):
                    resRomanNum = romanNumOne / romanNumTwo;
                    String fromIntToStringRes = Integer.toString(resRomanNum);
                    for (EnumRomanNumerals arrRomanExam1 : EnumRomanNumerals.values()) {
                        if (resRomanNum == (arrRomanExam1.getRomanToArabNum())) {
                            resRomanString = arrRomanExam1.getRomanName();
                            System.out.println(resRomanString);
                        }
                    }
                    break;
            }

        } else {
            throw new InvalidInputException("Вы ввели некорректные данные");
        }
        return input;
    }
}

