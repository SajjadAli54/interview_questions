public class Bird extends Animal{
    private BirdName birdName;

    public Bird() {
        double x = Math.random() * 100 - 100;
        double y = Math.random() * 100 - 100;
        double z = Math.random() * 10;

        Position position = new Position(x, y, z);
        setPosition(position);
    }

    public String getBirdName() {
        return birdName.getName();
    }

    public void setBirdName(BirdName name) {
        this.birdName = name;
    }
    
    @Override
    public String toString() {
        return "Bird [name=" + birdName + ", id=" + getId() + ", age=" + getAge() + ", position=" + getPosition() + "]";
    }
}
    

