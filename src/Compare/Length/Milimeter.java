package Compare.Length;

import java.util.HashMap;

public class Milimeter implements Unit {
    private double value;

    public Milimeter(double value) {
        this.value = value;
    }

    private Unit getScaleFor(Class className){
        HashMap<Class ,Unit> scales =  new HashMap<Class , Unit>();
        scales.put(Inch.class , new Inch(value/(2.5*10)));
        scales.put(Feet.class , new Feet(value/(12*2.5*10)));
        scales.put(Centimeter.class , new Centimeter(value/10));
        scales.put(Milimeter.class , new Milimeter(value));
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

        Unit milimeter = ((Unit) o).convertTo(new Milimeter(0));

        return Double.compare(milimeter.getValue(), value) == 0;

    }

}