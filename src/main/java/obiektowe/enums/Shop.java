package obiektowe.enums;

public class Shop {

    public void pack(Shirt shirt) {

        switch (shirt.getSize()){
            case XXL:
            case XL:
            case L:
            case M:
                System.out.println("Pakuję do dużej torby");
                break;
            case S:
            case XS:
            case XXS:
                System.out.println("Pakuję do małej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");
        }
        System.out.println("Rozmiar liczbowo: " + shirt.getNumericSize());


    }


}
