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
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
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

    public double findDistance(Position other) {
        double dx = getX() - other.getX();
        double dy = getY() - other.getY();
        double dz = getZ() - other.getZ();
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }
}
