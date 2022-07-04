package obiektowe.enums;

public class Shirt {

    private Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return size;
    }

    public int getNumericSize() {
        return size.getNumericSize();
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "size='" + size + '\'' +
                '}';
    }
}
