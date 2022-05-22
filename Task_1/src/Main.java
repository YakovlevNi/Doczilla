import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<File> fileList = new ArrayList<>();
        Task.searchFile(new File("путь на дерикторию с файлами"), fileList); //путь на дериктоию с фалами
        for (File textFiles : fileList) {
            System.out.println("Имя файла: " + textFiles.getName() + "\n" + "Содержимое: ");
            File file = new File(textFiles.getAbsolutePath());
           try {
                Scanner scanner = new Scanner(file);
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
