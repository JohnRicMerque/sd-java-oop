abstract class Reptile extends Animal {
    public Reptile(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public void speak() {
        System.out.println("Reptile speaks");
    }

    public void displayInfo() {
        System.out.println("Reptile - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
