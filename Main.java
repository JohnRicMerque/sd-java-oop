public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Mufasa", 8, "male");
        Elephant elephant = new Elephant("Meena", 5, "female");
        Snake snake = new Snake("Valentina", 3, "female");
        Lizard lizard = new Lizard("Rango", 6, "male");
        Eagle eagle = new Eagle("Pagasa", 5, "male");
        Parrot parrot = new Parrot("Hedwig", 2, "male");

        // class instatiate
        lion.displayInfo();
        lion.speak();

        elephant.displayInfo();
        elephant.speak();

        snake.displayInfo();
        snake.speak();

        lizard.displayInfo();
        lizard.speak();

        eagle.displayInfo();
        eagle.speak();

        parrot.displayInfo();
        parrot.speak();

    }
}