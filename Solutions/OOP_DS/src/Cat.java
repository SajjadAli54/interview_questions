public class Cat extends Animal {
    private Breed breed;

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
