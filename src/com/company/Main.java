package com.company;

public class Main {

    public static void main(String[] args) {
        IceCreamFactory factory = new IceCreamFactory();

        IceCream chocolate = factory.getDoughnut(IceCreamTypes.CHOCOLATE);
        IceCream strawberry = factory.getDoughnut(IceCreamTypes.STRAWBERRY);
        IceCream pistachio = factory.getDoughnut(IceCreamTypes.PISTACHIO);

        chocolate.made();
        strawberry.made();
        pistachio.made();
    }
}
