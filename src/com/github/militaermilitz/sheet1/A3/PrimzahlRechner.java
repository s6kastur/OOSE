package com.github.militaermilitz.sheet1.A3;

import java.util.ArrayList;
import java.util.List;

public class PrimzahlRechner extends Thread {
    private final int u, o;
    private final List<Integer> pNumbers = new ArrayList<>();

    public PrimzahlRechner(int u, int o) {
        if (u > o) {
            final int tmp = o;
            o = u;
            u = tmp;
        }
        this.u = u;
        this.o = o;
    }

    @Override
    public void run() {
        for (int i = u; i <= o; i++) {
            if (isPrim(i)) pNumbers.add(i);
        }
    }

    public List<Integer> getpNumbers(){
        return pNumbers;
    }

    private boolean isPrim(int n){
        if (n < 2) return false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public void print(){
        pNumbers.forEach(System.out::println);
    }
}
