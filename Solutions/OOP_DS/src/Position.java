public class Position {
    private double x;
    private double y;
    private double z;

    public Position(double x, double y, double z) {
        this.setX(x);;
        this.setY(y);
        this.setZ(z);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = format(x);
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = format(y);
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = format(z);
    }

    /**
     * @param dx
     * @param dy
     * @param dz
     * 
     * camps to max values of +/- 100 for the edges
     */
    public void move(double dx, double dy, double dz) {
        setX(getX() + dx);
        setY(getY() + dy);
        setZ(getZ() + dz);
    }

    private double format(double value) {
        if(value < -10) return -10;
        if(value > 10) return 10;
        return value;
    }
}
