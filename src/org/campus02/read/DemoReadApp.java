package org.campus02.read;

import java.io.*;

public class DemoReadApp {

    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Studium\\temp\\readme.txt");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));

        System.out.println(bufferedReader.readLine());

    }

}
