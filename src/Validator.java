import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Validator {

    public static final String PATH = "./resources/filename.txt";

    public boolean validate(List<Map<String, String>> dataTable, Path path) throws IOException {

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); //file -> list of lines
        //ToDo: validate data

        return true;

    }

    public List diff(List<Map<String, String>> dataTable, Path path) throws IOException {

        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8); //file -> list of lines
        //ToDo: find differences

    }


    public static void main(String[] args) throws IOException {
        Validator validator = new Validator();
        TestData testData = new TestData();
        boolean result = validator.validate(testData.generate(), Paths.get(PATH));
        System.out.println(result);
        List diff = validator.diff(testData.generate(), Paths.get(PATH));
    }

}
