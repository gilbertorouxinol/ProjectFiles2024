package filetext;

import java.io.*;
import java.util.ArrayList;

/**
 * IntelliJ IDEA 2021.2.2 (Ultimate Edition)<br>
 * Licensed to Gilberto Rouxinol<br>
 * For educational use only.<br><br>
 * <p>
 * Polytechnic Institute of Viseu<br>
 * School of Technology and Management of Viseu<br><br>
 * <p>
 * Class created by Gilberto Rouxinol on 2024<br>
 * Copyright © 2024 Gilberto Rouxinol<br>
 * All rights reserved<br><br>
 * <p>
 * The static FileText class has two methods: one to read a text file line by line and write
 * each line to an ArrayList<String>; another to write each element of an ArrayList<String>,
 * line by line, in a text file<br>
 * <p>
 * The static FileText class implements a BufferedReader and BufferedWriter object
 * to read and write from or for a text file.<br>
 * <p>
 * The static FileText class has the following methods:<br>
 * (1) reader(String filePathName)                            - read a text file and return an ArrayList;<br>
 * (2) writer(String filePathName, ArrayList<String> list)    - read an ArrayList and write it in a text file;<br>
 * <p>
 * @author Gilberto Rouxinol
 * @version 2024.04.04
 */
public class FileText {

    /**
     * Read a text file, line by line, and store it or write it in an ArrayList<String>
     * @param    filePathName    the path name text file
     * @return result, an ArrayList(String) with all
     *                 line read. Each line is one String.
     * @IOException    If an input exception occurred.
     *                 The exceptions produced by failed or interrupted I/O operations.
     * @NullPointerException The exceptions is thrown if resolver is null or it
     *                       trying to access a part of something that doesn't exist.
     */
    public static ArrayList<String> reader(String filePathName) {
        ArrayList<String> result = new ArrayList<>();
        boolean EOF = false;

        try {
            File f = new File(filePathName);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            while (!EOF) {
                try {
                    String line = br.readLine();
                    if (line != null) {
                        result.add(line);
                    } else {
                        EOF = true;
                    }
                } catch (NullPointerException error) {
                    System.out.println("Error Message: " + error.getMessage());
                    error.printStackTrace();
                }
            }

            br.close();
            fr.close();

        } catch (IOException error) {
            System.out.println("Error Message: " + error.getMessage());
            error.printStackTrace();
        }

        return result;
    }


    /**
     * Read each element of a ArrayList<String> and write it, line by line, in a text file.
     * @param    filePathName    the path name text file
     * @param    list    the name of the ArrayList(String) with
     *                   all the lines to write
     * @IOException If an input exception occurred.
     *                     The exceptions produced by failed or interrupted I/O operations.
     */
    public static void writer(String filePathName, ArrayList<String> list) {

        try {
            File f = new File(filePathName);
            FileWriter fw = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String str : list) {
                bw.write(str + "\n", 0, str.length() + 1);
                //or
                //bw.write(str, 0, str.length() );
                //bw.newLine();
            }

            bw.close();
            fw.close();

        } catch (Exception error) {
            System.out.println("Error Message: " + error.getMessage());
            error.printStackTrace();
        }
    }
}
