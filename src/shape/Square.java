package shape;
/*
    Jobs of Square :
        - Perform all operations related to side.
 */
import Exceptions.InvalidArguments;

public class Square extends Rectangle{

    protected Square(double side) {
        super(side, side);
    }

    public static Square create(double side) throws InvalidArguments {
        if(side<=0){
            throw new InvalidArguments();
        }
        return new Square(side);
    }
}
