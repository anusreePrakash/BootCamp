package Compare.Length;

import java.util.HashMap;

public class Centimeter implements Unit {
    private double value;

    public Centimeter(double value) {
        this.value = value;
    }

    private Unit getScaleFor(Class className){
        HashMap<Class ,Unit> scales =  new HashMap<Class , Unit>();
        scales.put(Inch.class , new Inch(value/2.5));
        scales.put(Feet.class , new Feet(value/(12*2.5)));
        scales.put(Centimeter.class , new Centimeter(value));
        scales.put(Milimeter.class , new Milimeter(value/10));
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
        Unit inch = getScaleFor(Inch.class);
        double sum = inch.getValue()+ otherUnit.getValue();
        return new Inch(sum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || !(o instanceof Unit)) return false;
        Unit centimeter = ((Unit) o).convertTo(new Centimeter(0));
        return Double.compare(centimeter.getValue(), value) == 0;


    }

}
