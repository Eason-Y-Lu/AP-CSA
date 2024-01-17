public class Wombat extends Animal {
    public Wombat() {
        setName("Anonymous Wombat");
        setWeight(1800);
    }

    public static void eat(int amtEaten) {
        System.out.println("Wombats don't gain weight when they eat!");
    }
}
