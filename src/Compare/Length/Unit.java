package Compare.Length;

public interface Unit {
    Unit convertTo(Unit other);
    double getValue();
    Unit add(Unit other);
}
