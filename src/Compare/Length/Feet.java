package Compare.Length;

import java.util.HashMap;

public class Feet implements Unit {

    private double value;

    public Feet(double value) {
        this.value = value;
    }

    @Override
    public Unit convertTo(Unit other) {
        return getScaleFor(other.getClass());
    }

    private Unit getScaleFor(Class className){
        HashMap<Class ,Unit> scales =  new HashMap<Class , Unit>();
        scales.put(Inch.class , new Inch(value*12));
        scales.put(Feet.class , new Feet(value));
        scales.put(Centimeter.class , new Centimeter(value*12*2.5));
        scales.put(Milimeter.class , new Milimeter(value*12*2.5*10));
        return  scales.get(className);
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public Unit add(Unit other) {
        Unit otherUnit =  other.convertTo(new Inch(0));
        Unit inch = getScaleFor(Inch.class);
        double sum = inch.getValue()+ otherUnit.getValue();
        return new Inch(sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null ||!(o instanceof Unit)) return false;

        Unit feet =  ((Unit) o).convertTo(new Feet(0));
        return Double.compare(feet.getValue(), value) == 0;
    }

}