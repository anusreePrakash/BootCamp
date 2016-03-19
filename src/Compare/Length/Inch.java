package Compare.Length;

import java.util.HashMap;

public class Inch implements Unit {
    private double value;

    public Inch(double value) {
        this.value = value;
    }


    private Unit getScaleFor(Class className){
        HashMap<Class ,Unit> scales =  new HashMap<Class , Unit>();
        scales.put(Inch.class , new Inch(value));
        scales.put(Feet.class , new Feet(value/12));
        scales.put(Centimeter.class , new Centimeter(value/2.5));
        return  scales.get(className);
    }

    @Override
    public Unit convertTo(Unit other) {
        return getScaleFor(other.getClass());
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    public Unit add(Unit other) {
        Unit otherUnit =  other.convertTo(new Inch(0));
        double sum = otherUnit.getValue()+value;
        return new Inch(sum);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || !(o instanceof Unit)) return false;
        Unit thisInInch = getScaleFor(Inch.class);
        Unit otherInInch = ((Unit) o).convertTo(new Inch(0));
        return Double.compare(thisInInch.getValue(), otherInInch.getValue()) == 0;
    }

}
