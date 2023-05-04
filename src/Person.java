public class Person {
    // list all attributes
    private String name;
    private int age;
    private int height;
    private double weight;

    // method constructor
    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    //create getter and setter methods for each of the attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // growOlder behavioral method
    public void growOlder(){
        setAge(getAge() + 1); // person grow older by 1 year
        setHeight(getHeight() -1); // person grow shorter by 1 cm
        setWeight(getWeight() - 0.5); // person lighter by 0.5 lbs
    }
}
