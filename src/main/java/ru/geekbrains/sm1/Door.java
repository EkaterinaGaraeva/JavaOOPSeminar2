package ru.geekbrains.sm1;

public class Door {
    private Boolean closed = true;
    private Boolean locked = true;

    public void lock() {
        this.locked = true;
        System.out.println("Door locked");
    }

    public void unlock() {
        this.locked = false;
        System.out.println("Door unlocked");
    }

    public void close() {
        this.closed = true;
        System.out.println("Door closed");
    }

    public void open() {
        this.closed = false;
        System.out.println("Door open");
    }
    public boolean getClosed() {
        return closed;
    }

    public Boolean getLocked() {
        return locked;
    }
}
