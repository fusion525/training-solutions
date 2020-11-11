package enumtype;

public enum LengthUnit {

    MILLIMETER(true,1), CENTIMETER(true, 10), METER(true, 100), YARD(false, 914.4), FOOT(false, 304.1), INCH(false,25.4);


    private boolean isSi;
    private double inMillimeters;

    LengthUnit(boolean isSi, double inMillimeters) {
        this.isSi = isSi;
        this.inMillimeters = inMillimeters;

    }

    public double getInMillimeters() {
        return inMillimeters;
    }
}
