import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileRead {
    public static List<String> fileLineByLines(String path){
        List<String> lines = new ArrayList<>();

        try(Scanner sc = new Scanner(new File(path))){
          while (sc.hasNextLine()){
              lines.add(sc.nextLine());
          }
        }catch (FileNotFoundException e){
            System.out.println("Not found!");
        }
        return lines;
    }
}
