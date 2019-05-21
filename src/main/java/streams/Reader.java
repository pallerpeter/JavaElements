package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reader {

    public void readSingleChar(){
        try {
            FileInputStream fis = new FileInputStream("D:\\IO_test\\character.txt");
            int i = fis.read();
            System.out.println((char) i);
            fis.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readText(){
        try {
            FileInputStream fis = new FileInputStream("D:\\IO_test\\text.txt");
            int i = 0;
            String result = "";
            while ((i=fis.read()) != -1){
                result += (char) i;
            }
            System.out.println(result);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
