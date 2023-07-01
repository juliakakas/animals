import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> lines = FileReader.fileLineByLine("res/dog.txt");
        List<Dog> dogs = new ArrayList<>();
        for (String line : lines) {
            String[] lineAsArray = line.split(",");
            dogs.add(new Dog(lineAsArray[0],
                    Integer.parseInt(lineAsArray[1]),
                    lineAsArray[2]));
        }

        for (var actual : dogs) {
            System.out.println(actual);
        }
    }
}
