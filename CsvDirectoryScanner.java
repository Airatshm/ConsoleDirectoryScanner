package myclass42;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CsvDirectoryScanner implements DirectoryScanner {

    @Override
    public void printDirectoryFiles(File[] files) {
        try {
            FileWriter fileWriter = new FileWriter("dir.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i=0; i<files.length; i++) {
                bufferedWriter.write(files[i].getName() + ";");
                if (files[i].isDirectory()) {
                    bufferedWriter.write("directory");
                } else {
                    bufferedWriter.write("file");
                }
                bufferedWriter.write("\n");

               bufferedWriter.write(files[i].getName() + "\n");
            }
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
