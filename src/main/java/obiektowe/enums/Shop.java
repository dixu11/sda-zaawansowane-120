package obiektowe.enums;

public class Shop {

    public void pack(Shirt shirt) {

        switch (shirt.getSize()){
            case Sizes.XXL:
            case Sizes.XL:
            case Sizes.L:
            case Sizes.M:
                System.out.println("Pakuję do dużej torby");
                break;
            case Sizes.S:
            case Sizes.XS:
            case Sizes.XXS:
                System.out.println("Pakuję do małej torby");
                break;
            default:
                System.out.println("Nie rozpoznano rozmiaru");



        }


    }


}
