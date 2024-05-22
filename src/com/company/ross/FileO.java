package com.company.ross;

import javax.imageio.IIOException;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class FileO {

    public static final String ROSS = "src/com/company/ross/" ;

    public static void main(String[] args) {

        Random rn = new Random();
        byte[] ra = new byte[20];

        for (int i = 0; i < ra.length; i++) {
            ra[i] = (byte) rn.nextInt(100);
        }

        try{
            FileOutputStream fos = new FileOutputStream(ROSS + "io.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write(ra);
            bos.close();
            fos.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            FileInputStream fis = new FileInputStream(ROSS + "io.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            System.out.println(Arrays.toString(bytes));
        }catch (IOException e){
            e.getMessage();
        }
    }
}
