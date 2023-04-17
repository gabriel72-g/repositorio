package org.example;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Salida {
    void escribir() {


        byte CR = 13;
        byte LF = 10;
        try {


            FileOutputStream fos = new FileOutputStream("C:\\ficheros\\fichi1.bin");
            fos.write('a');
            fos.write('e');
            fos.write('i');
            fos.write(CR);
            fos.write(LF);
            fos.close();
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
