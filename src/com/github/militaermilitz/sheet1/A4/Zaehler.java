package com.github.militaermilitz.sheet1.A4;

public class Zaehler {
    private int counter;

    public synchronized void inkrementiereCounter() {
        if (counter < 1000) {
            System.out.println(Thread.currentThread().getName() + " :: " + counter++);
        }
    }
}
