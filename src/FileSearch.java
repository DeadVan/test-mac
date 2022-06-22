import java.io.File;
import java.io.IOException;

public class FileSearch {
    public static void main(String[] args) throws IOException {
        File filess = new File("/.");
        if(!filess.exists() || !filess.isDirectory()) {
            System.out.println("filebi ar arsebobs!!!");
            return;
        }
        findexe(filess,".exe");

        System.out.println("Absolute path: " + filess.getAbsolutePath());
        String[] files2 = filess.list();
        for (int i = 0; i < files2.length; i++) {

            File dirItem = new File(filess, files2[i]);
            System.out.print(dirItem.getAbsolutePath());
            System.out.print(" | ");
            System.out.print(dirItem.getCanonicalPath());
            System.out.print(" ");
            if (dirItem.isDirectory()) {
                System.out.println(" - Directory");
            }
            if (dirItem.isFile()) {
                System.out.println(" - File");
            }
        }
    }

    public static void findexe(File sourceDir, String  name)throws IOException{
        File[] childfiles = sourceDir.listFiles(new FileSearcher(name));
        if (childfiles != null){
            for ( int i = 0; i < childfiles.length; i++){
                if(childfiles[i].isFile()){
                    System.out.print(childfiles[i].getCanonicalPath());
                }else {
                    findexe(childfiles[i],name);
                }
        }

        }
    }
}

