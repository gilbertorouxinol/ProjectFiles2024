package fileobject;

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
public class MainFileObject {
    public static void main(String[] args) {
        // Some tools
        int i = 0;

        // Create an empty list
        ArrayList<Person> list = new ArrayList<>();

        // Create some Person and add it to the list
        Person p1 = new Person("Name 1",1, true);
        list.add(p1);
        Person p2 = new Person("Name 2",12, false);
        list.add(p2);
        Person p3 = new Person("Name 3",123, false);
        list.add(p3);
        Person p4 = new Person("Name 4",1234, true);
        list.add(p4);

        // Check list elements
        System.out.println("The list of objects write:");
        show(list);

        // WRITE the list of Person to an object file named "person.dat"
        FileObject<Person> fObjPerson = new FileObject<>();
        fObjPerson.writer("person.dat", list);

        // READ a listRead of Person from an object file named "person.dat"
        ArrayList<Person> listRead;
        listRead = fObjPerson.reader("person.dat");

        // Check listRead elements
        System.out.println("The list of objects read:");
        show(listRead);
    }

    static void show(ArrayList<Person> lt){
        int i = 0;
        for (Person p:  lt) {
            System.out.println("Object " + (i++) + ":");
            System.out.println("   " + p.getName());
            System.out.println("   " + p.getNumber());
            System.out.println("   " + p.isRegistered());
        }
    }
}
