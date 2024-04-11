package fileobject;

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
 * The generic FileObject<T extends Serializable> class has two methods: one to read a
 * object file object by object and write each object to an ArrayList<T>; another to
 * write each object of an ArrayList<T>, object by object, in a object file<br>
 * <p>
 * The generic FileObject<T extends Serializable> class implements a FileInputStream and
 * ObjectInputStream object to read and write from or for an object file.<br>
 * <p>
 * The generic FileObject<T extends Serializable> class has the following methods:<br>
 * (1) reader(String filePathName)                    - read an object file and return an ArrayList of objects;<br>
 * (2) writer(String filePathName, ArrayList<T> list) - read an ArrayList of objects and write it in an object file;<br>
 * <p>
 * @author Gilberto Rouxinol
 * @version 2024.04.04
 */
public class FileObject<T extends Serializable> implements Serializable {

    /**
     * Read an object file, object by object, and store it or write it in an ArrayList<T> of object
     * @param    filePathName    the path name text file
     * @return result, an ArrayList(T) with all
     *                 object read. Each element is an object of generic type T.
     * @IOException          If an input exception occurred.
     *                              The exceptions produced by failed or interrupted I/O operations.
     * @ClassNotFoundException If an error occurred while attempting to load the class.
     */
    public ArrayList<T> reader(String filePathName) {
        ArrayList<T> result = new ArrayList<>();

        try {

            File f = new File(filePathName);
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while (fis.available() > 0) {

                try {

                    T obj;
                    obj = (T) ois.readObject();
                    result.add(obj);

                } catch (ClassNotFoundException error) {

                    System.out.println("Error Message (ClassNotFoundException): " + error.getMessage());
                    error.printStackTrace();

                }

            }

            fis.close();
            ois.close();

        } catch (IOException error) {

            System.out.println("Error Message (IOException): " + error.getMessage());
            error.printStackTrace();

        }

        return result;
    }

    /**
     * Write each element of an ArrayList<T> of generic object in
     * an object file
     * @param    filePathName    the path name object file
     * @param    list    the name of the ArrayList(T) with
     *                   all the objects to write
     * @IOException If an input exception occurred.
     *              The exceptions produced by failed or interrupted I/O operations.
     */
    public void writer(String filePathName, ArrayList<T> list) {

        try {

            File f = new File(filePathName);
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (T obj: list) {
                oos.writeObject(obj);
            }

            fos.close();
            oos.close();

        } catch (IOException error) {

            System.out.println("Error Message: " + error.getMessage());
            error.printStackTrace();

        }
    }
}
