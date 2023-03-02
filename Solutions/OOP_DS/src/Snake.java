public class Snake extends Animal{
    private double length;
    private boolean venomous;

    public Snake() {
        double x = Math.random() * 50 - 25;
        double y = Math.random() * 50 - 25;
        double z = 0;

        Position position = new Position(x, y, z);
        setPosition(position);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isVenomous() {
        return venomous;
    }

    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }

    @Override
    public String toString() {
        return "Snake [length=" + length + ", venomous=" + venomous + ", toString()=" + super.toString() + "]";
    }

  
}
