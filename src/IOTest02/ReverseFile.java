package IOTest02;

import java.io.*;
public class ReverseFile {
    public static void main(String[] args) {
        InputStream inp = null;
        InputStream buf = null;
        try {
            inp = new BufferedInputStream(new FileInputStream("")); //macbookze gadmovedi da gamichirdaa zepirad gavakete titkmis kodi wordic arcmaq jer :D shemdeze gavmartav kvelaferss
            buf = new BufferedInputStream(inp); // wakitxva buferidan moxdeba
            int biti;

            while (-1 != (biti = inp.read())) {
                System.out.print(biti + " ");
            }
            System.out.println(); System.out.println("Done!");
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        } catch (IOException e) {
            throw new RuntimeException("I/O Exception Occured", e);
        } finally {
            if (inp != null) {
                try { inp.close(); } catch (IOException e) {}
                System.out.println("ar daiketa input steammm");
            }
        }
    }
}