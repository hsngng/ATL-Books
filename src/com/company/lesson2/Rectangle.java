package com.company.lesson2;

public class Rectangle implements Shape{
    private int sideN, sideU;


    public Rectangle(int sideN, int sideU) {
        this.sideN = sideN;
        this.sideU = sideU;
    }

    @Override
    public double perimetr() {
        return (this.sideN + this.sideU)*2;
    }

    @Override
    public double sahe() {
        return this.sideU*this.sideN;
    }

    public int getSideN() {
        return sideN;
    }

    public void setSideN(int sideN) {
        this.sideN = sideN;
    }

    public int getSideU() {
        return sideU;
    }

    public void setSideU(int sideU) {
        this.sideU = sideU;
    }
}
