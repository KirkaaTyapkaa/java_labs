import java.util.Scanner;

public class Zoo {


    static Animal[] cages = new Animal[6];
    String name;

    public Zoo() {
        cages[0] = new Hunter("Simba", "Lion", "Raarh");
        cages[1] = new fly("Gesha", "rare parrot");
        cages[2] = new Water("Nemo", "water plant");
        cages[3] = new Hunter("Akela", "Tiger", "Hrrrrrrrr");
        cages[4] = new fly("Dydy", "toucan");
        cages[5] = new Water("Mr.Shark", "tiny fhish");

        this.name = "ZOOPARK";

    }

    public static Animal getAnimal() {
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        for (Animal cages : cages) {
            if (cages.getName().equals(name)) {
                return cages;
            }
        }

        System.out.println("No animals found with the name " + name);
        return null;
    }


    public static void listNames() {
        String[] names = new String[3];
        for (Animal cages : cages) {
            System.out.println(cages.getName());
        }
    }

    public static void feed() {
        Animal animal = getAnimal();
        if (animal != null) {
            animal.feed();
        }
    }

    public static void care() {
        Animal animal = getAnimal();
        if (animal != null) {
            animal.needCare();
        }
    }

    public static void listenAnimal() {
        Animal animal = getAnimal();
        if (animal != null) {
            animal.speak();
        }
    }


    public static void status() {
        Animal animal = getAnimal();
        if (animal != null) {
            System.out.println("Type of animal: " + animal.getType());
            if (animal.hungry) {
                System.out.println("Hungry");
            } else {
                System.out.println("Not hungry");
            }
            if (animal.needCare) {
                System.out.println("Need care");
            } else {
                System.out.println("Don`t need care");
            }

        }
    }


}




