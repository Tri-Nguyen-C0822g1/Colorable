public class Square extends Rectangle implements Colorable {
    private double side = 1.0;

    public Square() {
    }

    public Square(double side) {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    @Override
    public String
    toString() {
        return "Square{" +
                "side=" + side +
                '}' + toString();
    }
    @Override
    public void howToColor(){
        System.out.println("Color all four sides with " + getColor());
    }
}