package fileobject;

import java.io.Serializable;

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
public class Person implements Serializable {

    private String name;
    private int number;
    private boolean registered;

    public Person(String name, int number, boolean registered) {
        this.name = name;
        this.number = number;
        this.registered = registered;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", registered=" + registered +
                '}';
    }
}
