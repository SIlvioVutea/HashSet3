import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> setOfNumbers = getIntegerSet();
        Integer numberToCheck = 4;

        Iterator<Integer> iterator = setOfNumbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            System.out.println("Setted number : " + number);
            if (number.equals(numberToCheck)) {
                iterator.remove();
            }
        }
        System.out.println(setOfNumbers);
        setOfNumbers.removeAll(setOfNumbers);
        System.out.println(setOfNumbers.size());
        System.out.println(setOfNumbers);

    }

    public static HashSet<Integer> getIntegerSet() {
        HashSet<Integer> integerSet = new HashSet<Integer>();
        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        return integerSet;
    }

}