import java.sql.SQLOutput;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(toRomanNumeral(1987));
    }

    public static String toRomanNumeral(int number) {
        String romanNumber = "";

        LinkedHashMap<Integer, String> roman_nums = new LinkedHashMap<>();

        roman_nums.put(1000, "M");
        roman_nums.put(900, "CM");
        roman_nums.put(500, "D");
        roman_nums.put(400, "CD");
        roman_nums.put(100, "C");
        roman_nums.put(90, "XC");
        roman_nums.put(50, "L");
        roman_nums.put(40, "XL");
        roman_nums.put(10, "X");
        roman_nums.put(9, "IX");
        roman_nums.put(5, "V");
        roman_nums.put(4, "IV");
        roman_nums.put(1, "I");

        for (int key : roman_nums.keySet()) {
            while (number >= key) {
                romanNumber = romanNumber.concat(roman_nums.get(key));
                number = number - key;
            }
        }

        return romanNumber;

    }
}