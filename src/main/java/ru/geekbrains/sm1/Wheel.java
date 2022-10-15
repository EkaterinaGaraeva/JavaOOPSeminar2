package ru.geekbrains.sm1;

public class Wheel implements Checkable {
    public void rotate() {
        System.out.println("Wheel rotate");
    }

    public void right() {
        System.out.println("Wheel right");
    }

    public void left() {
        System.out.println("Wheel left");
    }

    public void check() {
        System.out.println("Wheel okay");
    }
}
