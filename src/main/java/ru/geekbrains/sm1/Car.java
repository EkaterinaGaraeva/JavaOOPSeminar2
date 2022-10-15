// 1. Основываясь на примере с урока продолжить развивать
// систему классов, описывающих структуру и функционирование
// легкового автомобиля. Добавить сам класс автомобиля,
// который будет включать созданную нами базу.
// Помимо базы добавить такие компоненты, как двери, кондиционер,
// рулевое управление и др. Наладить их взаимодействие.

package ru.geekbrains.sm1;

public class Car {
    private Base base;
    private Door door1;
    private Door door2;
    private Door door3;
    private Door door4;
    private Conditioner conditioner;
    private Steering steering;

    public Car() {
        this.base = new Base();
        this.door1 = new Door();
        this.door2 = new Door();
        this.door3 = new Door();
        this.door4 = new Door();
        this.conditioner = new Conditioner();
        this.steering = new Steering();
    }

    public void unlockDoors() {
        door1.unlock();
        door2.unlock();
        door3.unlock();
        door4.unlock();
    }

    public void openDoor(int number) {
        if (number == 1) {
            door1.open();
        } else if (number == 2) {
            door2.open();
        } else if (number == 3) {
            door3.open();
        } else if (number == 4) {
            door4.open();
        }
    }
    public void closeDoor(int number) {
        if (number == 1) {
            door1.close();
        } else if (number == 2) {
            door2.close();
        } else if (number == 3) {
            door3.close();
        } else if (number == 4) {
            door4.close();
        }
    }
    public void start() {
        if (door1.getClosed() && door2.getClosed() && door3.getClosed() && door4.getClosed()) {
            base.start();
        }
    }

    public void climat(int temperature) {
        conditioner.turnOn();
        conditioner.setTemperature(temperature);
        int temp = conditioner.getTemperature();
        System.out.printf("Temperature is %d%n", temp);
    }

    public void drive(String steeringWheelPosition) {
        if (steeringWheelPosition.equals("right")) {
            steering.setRight(true);
            base.driveRight();
        } else if (steeringWheelPosition.equals("left")) {
            steering.setLeft(true);
            base.driveLeft();
        }
    }

    public void drive(int number) {
        base.drive(number);
    }

    public void stop() {
        base.stop();
        conditioner.turnOff();
    }

    public void lockDoors() {
        door1.lock();
        door2.lock();
        door3.lock();
        door4.lock();
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.unlockDoors();
        car.openDoor(1);
        car.closeDoor(1);
        car.start();
        car.climat(22);
        car.drive(1);
        car.drive("left");
        car.drive(1);
        car.drive(2);
        car.drive(1);
        car.drive("right");
        car.drive(1);
        car.stop();
        car.openDoor(1);
        car.closeDoor(1);
        car.lockDoors();
    }
}
