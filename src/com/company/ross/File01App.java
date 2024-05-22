package com.company.ross;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class File01App {
    public static final String RESOURCE = "src/com/company/resouerce/";

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Hasan", "Gonag", 28));
        person.add(new Person("Sha", "A", 28));
        person.add(new Person("Ilgar", "Gonag", 28));
        person.add(new Person("Aqil", "Gonag", 28));


        try (FileOutputStream fos = new FileOutputStream(RESOURCE + "person.ser");
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.getMessage();
        }
        try (FileInputStream fis = new FileInputStream(RESOURCE + "person.ser");
             BufferedInputStream bis = new BufferedInputStream(fis);
             ObjectInputStream ois = new ObjectInputStream(bis)
        ) {
            Object person1 = ois.readObject();
            if (person1 instanceof ArrayList<?>) {
                System.out.println(person1);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
