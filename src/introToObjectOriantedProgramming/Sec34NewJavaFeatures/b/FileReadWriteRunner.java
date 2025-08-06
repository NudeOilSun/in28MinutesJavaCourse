package introToObjectOriantedProgramming.Sec34NewJavaFeatures.b;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReadWriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("./resources/sample.txt");
        String fileContent = Files.readString(path);

        System.out.println(fileContent); //reads out file

        String fileNewContent = fileContent.replace("Line", "Lines"); //replaces
        Path newFilePath = Paths.get("./resources/sample-new.txt"); //creates new file path
        Files.writeString(newFilePath, fileNewContent); //creates new file with replacement
    }
}


