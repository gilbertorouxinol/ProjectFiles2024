package filetext;

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
 * @author Gilberto Rouxinol
 * @version 2024.04.04
 */
public class MainWriteFileText {

    public static void main(String[] args) {

        // Create a text and store it line by line in an ArrayList<String>
        ArrayList<String> list = new ArrayList<>();
        list.add("https://loremipsum.io/generator/");
        list.add("Et netus et malesuada fames ac turpis egestas");
        list.add("bibendum ut tristique. Volutpat lacus laoreet");
        list.add("tellus in hac habitasse. Diam maecenas ult");

        // Put the file path name
        String filePathNameWrite = "name.txt";

        // Write each element of the ArrayList in the text file
        FileText ftw = new FileText();

        ftw.writer(filePathNameWrite, list);

        System.out.println("Text saved successfully in \"" + filePathNameWrite + "\" file.");
    }
}
