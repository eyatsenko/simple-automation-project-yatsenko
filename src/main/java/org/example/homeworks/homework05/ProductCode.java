package org.example.homeworks.homework05;

/*
6. Product code validation eg: AX6BYU56UX6CV6BNT7NM 287430
1st part can contain only capital letters and 6 digits. 2nd part is all digits and = the product of the
first 6 digits taken in groups of two from the left. Eg 65*66*67 = 287430.
*/

public class ProductCode {
    public static void main(String[] args) {
        String productCode = "AX6BYU56UX6CV6BNT7NM 287430";

        String[] partsOfCode = productCode.split(" ");
        String firstPart = partsOfCode[0];
        String secondPart = partsOfCode[1];

        if (isLengthValid(firstPart) && isLetterUpper(firstPart) && isCountOfNumbersValid(firstPart) && isSecondPartEqualMultiply(firstPart, secondPart)){
            System.out.println("Code is valid");
        } else System.out.println("Code is invalid");
    }

    public static boolean isLengthValid(String code) {
        boolean result = false;
        if (code.length()== 20){
            result = true;
        }
        return result;
    }

    public static boolean isCountOfNumbersValid(String firstPart) {
        boolean result = false;

        // получаем все цифры из первой части
        String[] numbersS = firstPart.replaceAll("[^0123456789]", "").split("\\s+");

        if (numbersS[0].length() == 6) {
            result = true;
        }
        return result;
    }

    public static boolean isSecondPartEqualMultiply (String firstPart, String secondPart) {
        boolean result = false;
        int multiplyResult = Integer.parseInt(secondPart);

        // получаем все цифры из первой части
        String[] numbersS = firstPart.replaceAll("[^0123456789]", "").split("\\s+");

        int firstNumberInt = Integer.parseInt(numbersS[0].charAt(0) + "" + numbersS[0].charAt(1));
        int secondNumberInt = Integer.parseInt(numbersS[0].charAt(2) + "" + numbersS[0].charAt(3));
        int thirdNumberInt = Integer.parseInt(numbersS[0].charAt(4) + "" + numbersS[0].charAt(5));

        if ((firstNumberInt * secondNumberInt * thirdNumberInt) == multiplyResult){
            result = true;
        }
        return result;
    }

    public static boolean isLetterUpper(String firstPart) {
        boolean result = false;

        // убираю цифры и строчные буквы
        String[] onlyUpper = firstPart.replaceAll("[A-Z 0123456789]", "").split("\\s+");

        if (onlyUpper[0] == ""){
            result = true;
        }
        return result;
    }
}
