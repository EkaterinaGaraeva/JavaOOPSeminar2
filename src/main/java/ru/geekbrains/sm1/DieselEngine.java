package ru.geekbrains.sm1;

public class DieselEngine extends Engine{
    @Override
    protected void startInternal() {
        System.out.println("Diesel engine started");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Diesel engine stopped");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Diesel throttle open on %d%n", level);
    }

    @Override
    public void check() {
        System.out.println("Diesel engine okay");
    }
}
