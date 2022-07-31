import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) throws Exception {
        CalculatorHelper calculatorHelper = new CalculatorHelper();
        System.out.println("Vvedite virazenie:");
        Scanner myObj = new Scanner(System.in);
        String input = myObj.nextLine();
        System.out.println(calculatorHelper.calc(input));
    }

        public class ExpressionParser {

            private static final List<String> allowedArabic = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

            private static final List<String> allowedRoman = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");


            }
    static class CalculatorHelper {
        public String calc(String input) throws Exception {
            String[] splitText = input.split(" ");
            if ((!ExpressionParser.allowedArabic.contains(splitText[0]) && !ExpressionParser.allowedRoman.contains(splitText[0])) ||
                    (!ExpressionParser.allowedArabic.contains(splitText[2]) && !ExpressionParser.allowedRoman.contains(splitText[2]))) {
                throw new Exception("Eror");
            }
                if (splitText.length != 3) {
                    throw new Exception("Error please try again");
                }

                boolean rome = false;
                int letter1, letter2;

                int countLetters = 0;

                for (int i = 0; i < 3; i += 2) {
                    try {
                        Integer.parseInt(splitText[i]);
                    } catch (NumberFormatException e) {
                        rome = true;
                        countLetters++;
                    }
                }

                if (countLetters == 1) {
                    throw new Exception();
                }

                letter1 = getLetter(splitText[0]);
                letter2 = getLetter(splitText[2]);
                int result = getResult(letter1, letter2, splitText[1]);
                String output;


                if (rome) {
                    if (result > 100 || result <=0) {
                        throw new Exception("Rome 1 and 10");
                    } else output = getRomeNumber(result);
                } else {

                    if (result > 100) {
                        throw new Exception("Arab >= 0");
                    } else output = String.valueOf(result);

                }
                return output;
            }

            public Integer getLetter (String letter) throws Exception {
                int integer = 0;

                try {
                    integer = Integer.parseInt(letter);
                } catch (Exception e) {
                    switch (letter.toLowerCase(Locale.ROOT)) {
                        case "i":
                            integer = 1;
                            break;
                        case "ii":
                            integer = 2;
                            break;
                        case "iii":
                            integer = 3;
                            break;
                        case "iv":
                            integer = 4;
                            break;
                        case "v":
                            integer = 5;
                            break;
                        case "vi":
                            integer = 6;
                            break;
                        case "vii":
                            integer = 7;
                            break;
                        case "viii":
                            integer = 8;
                            break;
                        case "ix":
                            integer = 9;
                            break;
                        case "x":
                            integer = 10;
                            break;
                        default:
                            throw new Exception("Arab > 100");
                    }
                }
                return integer;
            }

            public String getRomeNumber ( int num) throws Exception {
                String romeNum = null;
                switch (num) {
                    case 1:
                        romeNum = "I";
                        break;
                    case 2:
                        romeNum = "II";
                        break;
                    case 3:
                        romeNum = "III";
                        break;
                    case 4:
                        romeNum = "IV";
                        break;
                    case 5:
                        romeNum = "V";
                        break;
                    case 6:
                        romeNum = "VI";
                        break;
                    case 7:
                        romeNum = "VII";
                        break;
                    case 8:
                        romeNum = "VIII";
                        break;
                    case 9:
                        romeNum = "IX";
                        break;
                    case 10:
                        romeNum = "X";
                        break;
                    case 11:
                        romeNum = "XI";
                        break;
                    case 12:
                        romeNum = "XII";
                        break;
                    case 13:
                        romeNum = "XIII";
                        break;
                    case 14:
                        romeNum = "XIV";
                        break;
                    case 15:
                        romeNum = "XV";
                        break;
                    case 16:
                        romeNum = "XVI";
                        break;
                    case 17:
                        romeNum = "XVII";
                        break;
                    case 18:
                        romeNum = "XVIII";
                        break;
                    case 19:
                        romeNum = "XIX";
                        break;
                    case 20:
                        romeNum = "XX";
                        break;
                    case 21:
                        romeNum = "XXI";
                        break;
                    case 22:
                        romeNum = "XXII";
                        break;
                    case 23:
                        romeNum = "XXIII";
                        break;
                    case 24:
                        romeNum = "XXIV";
                        break;
                    case 25:
                        romeNum = "XXV";
                        break;
                    case 26:
                        romeNum = "XXVI";
                        break;
                    case 27:
                        romeNum = "XXVII";
                        break;
                    case 28:
                        romeNum = "XXVIII";
                        break;
                    case 29:
                        romeNum = "XXIX";
                        break;
                    case 30:
                        romeNum = "XXX";
                        break;
                    case 31:
                        romeNum = "XXXI";
                        break;
                    case 32:
                        romeNum = "XXXII";
                        break;
                    case 33:
                        romeNum = "XXXIII";
                        break;
                    case 34:
                        romeNum = "XXXIV";
                        break;
                    case 35:
                        romeNum = "XXXV";
                        break;
                    case 36:
                        romeNum = "XXXVI";
                        break;
                    case 37:
                        romeNum = "XXXVII";
                        break;
                    case 38:
                        romeNum = "XXXVIII";
                        break;
                    case 39:
                        romeNum = "XXXIX";
                        break;
                    case 40:
                        romeNum = "XL";
                        break;
                    case 41:
                        romeNum = "XLI";
                        break;
                    case 42:
                        romeNum = "XLII";
                        break;
                    case 43:
                        romeNum = "XLIII";
                        break;
                    case 44:
                        romeNum = "XLIV";
                        break;
                    case 45:
                        romeNum = "XLV";
                        break;
                    case 46:
                        romeNum = "XLVI";
                        break;
                    case 47:
                        romeNum = "XLVII";
                        break;
                    case 48:
                        romeNum = "XLVIII";
                        break;
                    case 49:
                        romeNum = "XLIX";
                        break;
                    case 50:
                        romeNum = "L";
                        break;
                    case 51:
                        romeNum = "LI";
                        break;
                    case 52:
                        romeNum = "LII";
                        break;
                    case 53:
                        romeNum = "LIII";
                        break;
                    case 54:
                        romeNum = "LIV";
                        break;
                    case 55:
                        romeNum = "LV";
                        break;
                    case 56:
                        romeNum = "LVI";
                        break;
                    case 57:
                        romeNum = "LVII";
                        break;
                    case 58:
                        romeNum = "LVIII";
                        break;
                    case 59:
                        romeNum = "LIX";
                        break;
                    case 60:
                        romeNum = "LX";
                        break;
                    case 61:
                        romeNum = "LXI";
                        break;
                    case 62:
                        romeNum = "LXII";
                        break;
                    case 63:
                        romeNum = "LXIII";
                        break;
                    case 64:
                        romeNum = "LXIV";
                        break;
                    case 65:
                        romeNum = "LXV";
                        break;
                    case 66:
                        romeNum = "LXVI";
                        break;
                    case 67:
                        romeNum = "LXVII";
                        break;
                    case 68:
                        romeNum = "LXVIII";
                        break;
                    case 69:
                        romeNum = "LXIX";
                        break;
                    case 70:
                        romeNum = "LXX";
                        break;
                    case 71:
                        romeNum = "LXXI";
                        break;
                    case 72:
                        romeNum = "LXXII";
                        break;
                    case 73:
                        romeNum = "LXXIII";
                        break;
                    case 74:
                        romeNum = "LXXIV";
                        break;
                    case 75:
                        romeNum = "LXXV";
                        break;
                    case 76:
                        romeNum = "LXXVI";
                        break;
                    case 77:
                        romeNum = "LXXVII";
                        break;
                    case 78:
                        romeNum = "LXXVIII";
                        break;
                    case 79:
                        romeNum = "LXXIX";
                        break;
                    case 80:
                        romeNum = "LXXX";
                        break;
                    case 81:
                        romeNum = "LXXXI";
                        break;
                    case 82:
                        romeNum = "LXXXII";
                        break;
                    case 83:
                        romeNum = "LXXXIII";
                        break;
                    case 84:
                        romeNum = "LXXXIV";
                        break;
                    case 85:
                        romeNum = "LXXXV";
                        break;
                    case 86:
                        romeNum = "LXXXVI";
                        break;
                    case 87:
                        romeNum = "LXXXVII";
                        break;
                    case 88:
                        romeNum = "LXXXVIII";
                        break;
                    case 89:
                        romeNum = "LXXXIX";
                        break;
                    case 90:
                        romeNum = "XC";
                        break;
                    case 91:
                        romeNum = "XCI";
                        break;
                    case 92:
                        romeNum = "XCII";
                        break;
                    case 93:
                        romeNum = "XCIII";
                        break;
                    case 94:
                        romeNum = "XCIV";
                        break;
                    case 95:
                        romeNum = "XCV";
                        break;
                    case 96:
                        romeNum = "XCVI";
                        break;
                    case 97:
                        romeNum = "XCVII";
                        break;
                    case 98:
                        romeNum = "XCVIII";
                        break;
                    case 99:
                        romeNum = "XCIX";
                        break;
                    case 100:
                        romeNum = "C";
                        break;

                    default:
                        throw new Exception("result > 100");
                }
                return romeNum;
            }

            public Integer getResult ( int letter1, int letter2, String s) throws Exception {
                int result = 0;
                switch (s) {
                    case "/":
                        result = letter1 / letter2;
                        break;
                    case "+":
                        result = letter1 + letter2;
                        break;
                    case "-":
                        result = letter1 - letter2;
                        break;
                    case "*":
                        result = letter1 * letter2;
                        break;
                    default:
                        throw new Exception("operation format");
                }

                return result;

            }
        }}