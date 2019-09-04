//I worked on the homework assignment alone, using only course materials.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File commandsFile = new File(args[0]);
        Scanner scanner = new Scanner(commandsFile);
        while (scanner.hasNextLine()) {
            String line = scanner.next();
            if (line.contains("allcaps")) {
                String capitalized = scanner.next();
                System.out.println(allCaps(capitalized));

            } else if (line.contains("power")) {
                String bottomString = scanner.next();
                String exponentString = scanner.next();
                int bottom = Integer.parseInt(bottomString);
                int exponent = Integer.parseInt(exponentString);
                System.out.println(power(bottom, exponent));

            } else if (line.contains("substring")) {
                String subStrings = scanner.next();
                String firstIndex = scanner.next();
                String secondIndex = scanner.next();
                int firstNum = Integer.parseInt(firstIndex);
                int lastNum = Integer.parseInt(secondIndex);
                int strLen = subStrings.length();
                if (firstNum <= strLen && lastNum <= strLen && firstNum >= 0 && lastNum >= 0 && firstNum < lastNum) {
                    String finalString = makeSubstring(subStrings, firstNum, lastNum);
                    System.out.println(finalString);
                } else {
                    System.out.println("Invalid command");
                }
            } else {
                line = scanner.nextLine();
            }
        }
    }
    // place the three required static methods here
    public static String allCaps(String str) {
        return str.toUpperCase();
    }
    public static double power(int base, int power) {
        return Math.pow(base, power);
    }
    public static String makeSubstring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }

}