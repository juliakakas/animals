import java.util.ArrayList;
import java.util.List;

public class Mainy {
    public static void main(String[] args) {
        List<String> line = FileRead.fileLineByLines("res/dog.txt");
        List<Animal> dogys = new ArrayList<>();

        for (String sor: line) {
            String[] lineArray = sor.split(",");
            dogys.add(new Dogy(lineArray[0],
                    Integer.parseInt(lineArray[1]),
                    lineArray[2]));

        }

        for (var actual : dogys) {
            System.out.println(actual);
        }

        List<String> liny = FileRead.fileLineByLines("res/chicken.txt");
        List<Animal> chickens = new ArrayList<>();

        for (String row: liny) {
            String[] linesArray = row.split(",");
            chickens.add(new Chicken
                    (Integer.parseInt(linesArray[0]),
                    Double.parseDouble(linesArray[1])));

        }

        for (var actualy : chickens) {
            System.out.println(actualy);
        }

        List<String> line1 = FileRead.fileLineByLines("res/vegyes.txt");
        List<Animal> vegyes = new ArrayList<>();

        for (String raw: line1) {
            String[] linesArrayV = raw.split(",");
            if (linesArrayV.length == 4){
                vegyes.add(new Dogy(linesArrayV[1],
                        Integer.parseInt(linesArrayV[2]),
                        linesArrayV[3]));

            } else {
                vegyes.add(new Chicken
                        (Integer.parseInt(linesArrayV[1]),
                        Double.parseDouble(linesArrayV[2])));
            }
        }

        for (var actualy : vegyes) {
            System.out.println(actualy);
        }
    }
}

