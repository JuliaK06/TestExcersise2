package bg.smg;

public class Main {

    public static void main(String[] args) {
	AnimalHouse<Pinguin> pinguinHouse=new AnimalHouse<>();
        AnimalHouse<Bird> birdHouse=new AnimalHouse<>();

        Pinguin pinguin=new Pinguin("Kowalski");
        Bird bird=new Bird(12.0);

        pinguinHouse.animal=pinguin;
        birdHouse.animal=bird;
    }
}
