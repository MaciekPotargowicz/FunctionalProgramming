import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        int result = IntStream.iterate(1, x -> x + 1).filter(x -> checkIsDivided(x)).findFirst().getAsInt();

        System.out.println("The result is: " + result);
    }

    private static boolean checkIsDivided(int number) {
        int i = 1;
        while (i <= 20) {
            if (number % i == 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
