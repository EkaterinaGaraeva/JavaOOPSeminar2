package ru.geekbrains.sm1;

public class GasolineEngine extends Engine {
    @Override
    protected void startInternal() {
        System.out.println("Gasoline engine started");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Gasoline engine stopped");
    }

    @Override
    protected void throttleUpInternal(int level) {
        System.out.printf("Gasoline throttle open on %d%n", level);
    }

    @Override
    public void check() {
        System.out.println("Gasoline engine okay");
    }
}
