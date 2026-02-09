public class Main {

    public static void main(String[] args) {
        // create a few Animal instances
        Animal a1 = new Animal("Milo", "Cat");
        Animal a2 = new Animal("Bella", "Dog");
        Animal a3 = new Animal("Tweety", "Bird");

        // print their info
        printAnimal(a1);
        printAnimal(a2);
        printAnimal(a3);

        // modify one and print again
        a1.setName("Milo Jr.");
        a1.setSpecies("Cat (Tabby)");
        System.out.println("After update:");
        printAnimal(a1);
    }

    private static void printAnimal(Animal a) {
        System.out.println("Name: " + a.getName() + ", Species: " + a.getSpecies());
    }
}
