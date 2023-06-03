abstract class Animal {
    // attributes
    private String name;
    private int age;
    private String gender;

    // constructor
    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // methods
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }

    public abstract void speak();
    public abstract void displayInfo();
}
