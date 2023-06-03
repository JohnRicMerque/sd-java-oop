abstract class Mammal extends Animal {
    public Mammal(String name, int age, String gender) {
        super(name, age, gender);
    }
        @Override
        public void speak() {
            System.out.println("Mammal speaks");
        }

        public void displayInfo() {
            System.out.println("Mammal - Name: " + getName() + ", Age: " + getAge() + ", Gender: " + getGender());
        }
}
