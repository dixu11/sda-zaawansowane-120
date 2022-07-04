package obiektowe.enums;

public enum Size {

    XXL(46),
    XL(44),
    L(42),
    M(40),
    S(38),
    XS(36),
    XXS(34);

    private int numericSize;

   Size(int numericSize) {
        this.numericSize = numericSize;
    }

    public int getNumericSize() {
        return numericSize;
    }

    @Override
    public String toString() {
        return "Size{" +
                "numericSize=" + numericSize +
                '}';
    }
}
