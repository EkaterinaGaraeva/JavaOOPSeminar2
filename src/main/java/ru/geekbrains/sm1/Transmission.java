package ru.geekbrains.sm1;

public class Transmission implements Checkable {
    private int gearNumber;

    public void switchGear(int number) {
        this.gearNumber = number;
        System.out.printf("Speed switched to %d%n", number);
    }

    public int getGearNumber() {
        return gearNumber;
    }

    public void check() {
        System.out.println("Transmission okay");
    }
}
