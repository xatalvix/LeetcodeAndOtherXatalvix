package com.xatalvix.ExEnum;

public class DemoEnum_v1 {
    public static void main(String[] args) {
        Transport tp;

        System.out.println("Типичная скорость самолёта: " +
                Transport.AIRPLANE.getSpeed() + " км в час\n");
        System.out.println("Типичные скорости движения" +
                "транспортных средств");
        for (Transport t : Transport.values())
            System.out.println(t + ": " + t.getSpeed() + " км в час");
    }
}

enum Transport {
    CAR(100), TRUCK(80), AIRPLANE(900), TRAIN(120), BOAT(35);

    private final int speed;

    Transport(int s) {
        speed = s;
    }

    int getSpeed() {
        return speed;
    }
}
