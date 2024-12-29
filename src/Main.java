import java.util.ArrayList;
import java.util.List;

public class Main {

    static final int PART_SIZE = 10;

    public static void main(String[] args) {
        String string = "Принять в связи с достаточностью" +
                " знаний рядового соискателя на замечательную работу Джавовским Джуном";
        List<String> resultSpitString = splitString(string);
        for (String cutOfString : resultSpitString) {
            System.out.println(cutOfString);
        }
    }

    static List<String> splitString(String string) {
        List<String> splitString = new ArrayList<>();
        int lengthString = string.length();
        for (int i = 0; i < lengthString; i += PART_SIZE) {
            splitString.add(string.substring(i, Math.min(i + PART_SIZE, lengthString)));
        }

        return splitString;
    }
}