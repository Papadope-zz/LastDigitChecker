package lastdigitchecker;

public class LastDigitChecker {

    public static void main(String[] args) {
        
    }

    public static boolean hasSameLastDigit(int valueOne, int valueTwo, int valueThree) {
        if (!(isValid(valueOne)) || !(isValid(valueTwo)) || !(isValid(valueThree))) {
            return false;
        }

        return (valueOne % 10 == valueTwo % 10) || (valueOne % 10 == valueThree % 10) || (valueTwo % 10 == valueThree % 10);
    }

    public static boolean isValid(int number) {
        if (!(number >= 10 && number <= 1000)) {
            return false;
        }
        return true;
    }
}
