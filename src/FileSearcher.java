import java.io.File;
import java.io.FilenameFilter;

public class FileSearcher implements FilenameFilter {
    private String filename;
    public FileSearcher(String fileName) {
        this.filename = fileName;
    }

    public boolean accept(File dir, String name) {
        File file = new File(dir, name);
        if (file.isFile() && name.equals(filename)) {
            return true;
        }

        if (file.isDirectory()) {
            return true;
        }

        return false;
    }
}

