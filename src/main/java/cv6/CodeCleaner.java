package cv6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CodeCleaner {
        private Scanner file;
        private PrintWriter writer;
        
        public void clean(String filename, String final_filename){
            try {

            file = new Scanner(new File(filename));
            writer = new PrintWriter(final_filename);

            while (file.hasNext()) {
                String line = file.nextLine();
                //odsazovani zleva
                line = line.trim().replaceAll("\\s{2,}", " ");
                //odstraneni nevyznamnych komentářů
                line = line.replaceAll("\\/{2,}.*", " ");
                
                
                
                //odstraneni bílych neviditelnych znaku a tabulatoru
                if (line.length() >0) {                
                while (line.endsWith("\s") || line.endsWith("\t")) {
                   line = line.substring(0, line.length() - 1);
                    }
                }                
                if ((!line.isEmpty())||(line.equals("\t")||(line.equals(" ")))) {
                    writer.write(line);
                    writer.write("\n");
                }
                //jeden řádek
                if (line.endsWith("{")){
                    writer.write("\n");
                }
            }
            file.close();
            writer.close();

        } catch (FileNotFoundException ex) {
            System.out.print(ex);
        }
    }
}
