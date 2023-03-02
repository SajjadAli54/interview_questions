public class Animal implements Comparable<Animal>{
    private int id;
    private String name;
    private double age;
    private Position position;

    public Animal() {
    }

    public Animal(int id, String name, double age, Position position) {
        this.setId(id);
        this.setName(name);
        this.setAge(age);
        this.setPosition(position);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public void move(double dx, double dy, double dz) {
        position.move(dx, dy, dz);
    }

    public void move(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + ", age=" + age + ", position=" + position + "]";
    }

    @Override
    public int compareTo(Animal o) {
        return this.name.compareTo(o.name);
    }

    
}
