package myclass42;

import java.io.File;

public interface DirectoryScanner {
    String directoryPath = "123";
    void printDirectoryFiles(File[] files);

    default File[] getDirectoryFiles(String dirPath) {
            File directory = new File(dirPath);
            return directory.listFiles();

    }

    default void readAndPrint(String directoryPath) {
        File[] files = getDirectoryFiles(directoryPath);
        printDirectoryFiles(files);
    }
}
