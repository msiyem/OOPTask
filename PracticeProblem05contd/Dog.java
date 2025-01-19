package PracticeProblem05contd;

public class Dog {
    // Attributes
    private String name;
    private int age;
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    // Methods
    public void bark() {
        System.out.println(name + " is barking.");
    }

    public void spin() {
        System.out.println(name + " is spinning.");
    }

    public void run() {
        System.out.println(name + " is running.");
    }

    // Getters and Setters
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

