package com.company.ross;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileB {
    public static final String ROSS = "src/com/company/ross/" ;

    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream(ROSS + "io.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("Hesen".getBytes(StandardCharsets.UTF_8));
            bos.close();
            fos.close();
        }catch (IOException e){
            e.getMessage();
        }

        try{
            FileInputStream fis = new FileInputStream(ROSS + "io.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            byte[] bytes = bis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
            System.out.println(Arrays.toString(bytes));
        } catch (IOException e){
            e.getMessage();
        }
    }
}
