import java.util.ArrayList;
import java.util.Arrays;

public class InMemoryDatabase {

    public static CreatePerson createPerson(){
        return () -> new Person();
    }

    public static CreateList createList(){

        return ()-> new ArrayList<>();
    }

    public static CreateList createListOfPerson(Person ... people){
        return ()-> Arrays.asList(people);
    }
}
