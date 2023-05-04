import java.util.Scanner;

public class StringUtils {
    public static void print(char[] charArray) {
        for (char i : charArray) {
            System.out.print(i);
        }
    }

    public static void println(char[] array) {
        print(array);
        System.out.println();
    }


    public static boolean isBlank(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!Character.isWhitespace(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            if (!isRussian(charArray[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isRussian(char charik) {
        return (charik >= 'А' && charik <= 'я') || charik == 'ё' || charik == 'Ë';
    }


    public static boolean ifContains2(char[] chararray, char[] chararray2) {
        for (int i = 0; i <= chararray2.length - chararray.length; i++) {
            boolean tr = true;
            for (int j = 0; j < chararray.length; j++) {
                if (chararray2[i + j] != chararray[j]) {
                    tr = false;
                    break;
                }
            }
            if (tr) return true;
        }
        return false;
    }

    public static int parseInt(char[] array) {
        int finNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > '9' || array[i] < '0') {
                throw new IllegalArgumentException("Input data contains not just numbers");
            }
            int num = array[i] - '0';
            finNum = finNum * 10;
            finNum = finNum + num;
        }
        return finNum;
    }

    public static char[] getArray() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toCharArray();
    }
}
