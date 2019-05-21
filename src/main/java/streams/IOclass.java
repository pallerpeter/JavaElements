package streams;

import java.io.IOException;

public class IOclass {

    public static void main(String[] args) throws IOException {
        // read one character from input field
        int input = System.in.read();

        // print the variable value
        System.out.println(input);
        System.out.println( (char) input);

        // we can print error message
        System.err.println("Some error message");

        // print to the file with Writer class
        Writer w = new Writer();
        w.writeSingleCharacter();
        w.writeText();

        // read a character from file with Reader class
        Reader r = new Reader();
        r.readSingleChar();

        // read a text from file with Reader class - readtext method
        r.readText();

    }
}
