package com.company;

import interfacetest.Bus;
import interfacetest.Subway;
import interfacetest.Vehicle;

public class Main {

    public static void main(String[] args) {
//        Vehicle v = new Vehicle();
        Vehicle sb = new Subway();
        sb.countPassanger();
        sb.pay();
        sb.time();

        Vehicle b = new Bus();
        b.countPassanger();
        b.pay();
        b.time();
    }
}
