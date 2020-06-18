import java.util.List;
import java.util.stream.IntStream;


public class Main {

    public static void main(String[] args) {

        CubeRoot cubeRoot = value -> {

            double start = 0, end = value;

            double precision = 0.0000001;

            while (true) {
                double center = (start + end) / 2;
                double mistake = checkIsDifferent(value, center);

                if (mistake <= precision)
                    return center;

                if ((center * center * center) > value)
                    end = center;

                else
                    start = center;
            }
        };

        List<Person> list = InMemoryDatabase.createList().createList();
        Person person = InMemoryDatabase.createPerson().create();
        list.add(person);
        List<Person> personList = InMemoryDatabase.createListOfPerson(new Person(), new Person()).createList();
        personList.stream().forEach(System.out::println);

        double cubeRootResult = cubeRoot.countCubeRoot(3);
        System.out.println("CubeResult is: " + cubeRootResult);

        int result = IntStream.iterate(1, x -> x + 1).filter(x -> checkIsDivided(x)).findFirst().getAsInt();
        System.out.println("Eauler result is: " + result);
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

    static double checkIsDifferent(double value, double center) {
        if (value > (center * center * center))
            return (value - (center * center * center));
        else
            return ((center * center * center) - value);
    }
}
