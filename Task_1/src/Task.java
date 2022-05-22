import java.io.File;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

public class Task {
    public static void searchFile(File rootFile, List<File> fileList) {
        if (rootFile.isDirectory()) {
            File[] directoreFiles = rootFile.listFiles();
            if (directoreFiles != null) {
                for (File file : directoreFiles) {
                    if (file.isDirectory()) {
                        searchFile(file, fileList);
                    } else {
                        if (file.getName().toLowerCase().endsWith(".txt")) {
                            fileList.sort(Comparator.comparing(File::getName));
                            fileList.add(file);


                        }
                    }
                }
            }
        }

    }

}

