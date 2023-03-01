public class Snake extends Animal {
    private double length;
    private boolean venomous;

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
