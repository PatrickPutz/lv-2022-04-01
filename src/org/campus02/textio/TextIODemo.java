package org.campus02.textio;

import java.io.*;

public class TextIODemo {

    public static void main(String[] args) throws IOException {

        File f = new File("C:\\Studium\\temp\\readme.txt");

        FileReader fl = new FileReader(f);
        BufferedReader br = new BufferedReader(fl);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }

        br.close();

    }

}
