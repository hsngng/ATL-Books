package com.company.training;

public class HesapMakinesi {
    public int a;
    public int b;

    HesapMakinesi(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int toplama() {
        return this.a + this.b;
    }
    public int cikma() {
        return this.a - this.b;
    }
    public int vurma() {
        return this.a * this.b;
    }
    public int bolme() {
        return this.a / this.b;
    }

}
