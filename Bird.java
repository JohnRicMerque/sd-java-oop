abstract class Bird extends Animal {
    public Bird(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public void speak() {
        System.out.println("Bird speaks");
    }

    public void displayInfo() {
        System.out.println("Bird - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
    }
}
