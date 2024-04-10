package filetext;

import java.util.ArrayList;
import java.util.Scanner;

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
public class MainReadFileText {

    public static void main(String[] args) {
        Scanner anne = new Scanner(System.in);

        // Create an ArrayList<String> to store line by line
        // the text file that will be read
        ArrayList<String> list;

        // Put the file path name
        String filePathNameRead;
        System.out.println("Select the file to read: \n  1 - loremipsum.txt; \n  2 - empty.txt");
        int opt = anne.nextInt();
        if(opt != 1)
            filePathNameRead = "empty.txt" ;
        else
            filePathNameRead = "loremipsum.txt";

        // Read the text file
        FileText ftr = new FileText();

        list = ftr.reader(filePathNameRead);

        // Check the content read
        if(list.isEmpty())
            System.out.println("The \"" + filePathNameRead + "\" is as empty file.");
        else
            for (String str: list) System.out.println(str);
    }
}
