package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Writer {

    public void writeSingleCharacter(){
        try {
            FileOutputStream fos = new FileOutputStream("D:\\IO_test\\character.txt");
            fos.write(65);
            fos.flush();
            fos.close();
            System.out.println("done");
        } catch (FileNotFoundException e) {
            System.out.println("" + e);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeText(){
        try {
            FileOutputStream fos = new FileOutputStream("D:\\IO_test\\text.txt");
            String text = "loremIpsum JavaWord";
            byte b[] = text.getBytes();
            fos.write(b);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    
}
