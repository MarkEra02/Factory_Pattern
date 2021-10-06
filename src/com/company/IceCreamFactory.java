package com.company;

public class IceCreamFactory {
    public IceCream getDoughnut(IceCreamTypes type) {
        IceCream toReturn = null;
        switch (type) {
            case CHOCOLATE:
                toReturn = new ChocolateIceCream();
                break;
            case STRAWBERRY:
                toReturn = new StrawberryIceCream();
                break;
            case PISTACHIO:
                toReturn = new PistachioIceCream();
                break;
            default:
                throw new IllegalArgumentException("Wrong IceCream type:" + type);
        }
        return toReturn;
    }
}
