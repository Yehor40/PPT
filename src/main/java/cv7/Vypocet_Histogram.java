package cv7;

import java.io.IOException;
import static java.lang.Character.isUpperCase;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
public class Vypocet_Histogram {   
    private final int N = 'Z' - 'A' + 1;
    private final int[] hist = new int[N];
    
    public void hist(String text) { 
            init(hist);            
            execute(text, hist);           
            print(hist);

    }
    public void hist2(String filename) throws IOException {             
            String text=readFile(filename, StandardCharsets.UTF_8);
            init(hist);            
            execute(text, hist);           
            print(hist);
    }
    static String readFile(String path, Charset encoding)
      throws IOException
    {
      byte[] encoded = Files.readAllBytes(Paths.get(path));
      return new String(encoded, encoding);
    }
    public int[] getHistogram(){        
        return this.hist;
    }
    private void init(int[] hist) {
        for (int i = 0; i < ('Z' - 'A' + 1); i++)
            hist[i] = 0;
    }
    private void execute(String text, int[] hist) {
        for (char z : text.toCharArray()) {
            if(isUpperCase(z)){
                hist[z - 'A']++;
            }
            else {            
            hist['z' - 'A']++;
            }
        }
    }

    private void print(int[] hist) {
        //Print out the letter with the frequencies.
        for(int i = 0; i < ('Z' - 'A' + 1); i++){        
        String stars = "";
        for(int j = 0; j < hist[i]; j++){
        stars += "*";
        }
        System.out.println((char)('A' + i) + " " + stars + " - " + hist[i]);
        }
    }
}
