package com.company.lesson1;

public class JvThrds {
    public static void main(String[] args) {
        new JvTh("Aqil").start();
        new JvTh("Hesen").start();
        new JvTh("Ilqar").start();

    }

    public static class JvTh extends Thread{

        public JvTh(String name){
            super(name);
        }
        @Override
        public void run() {
            for (int i = 0; i < 3; i++) {
                System.out.println("Thread name:" + Thread.currentThread().getName());
            }
        }
    }
}
