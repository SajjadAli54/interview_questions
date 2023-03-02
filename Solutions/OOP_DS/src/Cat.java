public class Cat extends Animal{
    private Breed breed;

    public Cat() {
        double x = Math.random() * 50 - 25;
        double y = Math.random() * 50 - 25;
        double z = 0;

        Position position = new Position(x, y, z);
        setPosition(position);
    }

    public void eat(Bird bird){
        System.out.println("Cat is eating bird");

    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat [breed=" + breed + ", id=" + getId() + ", name=" + getName() + ", age=" + getAge() + ", position="
                + getPosition() + "]";    
    }

    
}
