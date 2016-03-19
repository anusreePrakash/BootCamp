package Compare.Length;

public class Meter {
    private double value;

    public Meter(double value) {
        this.value = value;
    }
    public double convertToInches(){
        return value*12;
    }
}
