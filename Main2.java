import java_cup.runtime.*;
import java.io.*;

class Main2 {
    public static void main(String[] argv) throws Exception{
        PrintStream file = new PrintStream(new FileOutputStream("Main.java"));
        System.setOut(file);
        Parser p = new Parser(new Scanner(new InputStreamReader(System.in)));
        p.parse();
    }
}
