import java.util.Scanner;

public class Zoo_old {


    static Animal[] cages = new Animal[6];
    String name;

    public Zoo_old() {
        cages[0] = new Hunter("Simba", "Lion", "Raarh");
        cages[1] = new fly("Gesha", "rare parrot");
        cages[2] = new Water("Nemo", "water plant");
        cages[3] = new Hunter("Akela", "Tiger", "Hrrrrrrrr");
        cages[4] = new fly("Dydy", "toucan");
        cages[5] = new Water("Mr.Shark", "tiny fhish");

        this.name = "ZOOPARK";

    }

    public static void listNames() {
        String[] names = new String[3];
        for (Animal cages : cages) {
            System.out.println(cages.getName());
        }
    }

    public static void feed() {
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int check = 0;
        for (Animal cages : cages) {
            if (cages.getName().equals(name)) {
                cages.feed();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("No animals found with the name " + name);
        }
    }

    public static void care() {
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int check = 0;
        for (Animal cages : cages) {
            if (cages.getName().equals(name)) {
                cages.needCare();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("No animals found with the name " + name);
        }
    }

    public static void listenAnimal() {
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int check = 0;
        for (Animal cages : cages) {
            if (cages.getName().equals(name)) {
                cages.speak();
                check++;
            }
        }
        if (check == 0) {
            System.out.println("No animals found with the name " + name);
        }
    }


    public static void status() {
        System.out.println("Input name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int check = 0;
        for (Animal cages : cages) {
            if (cages.getName().equals(name)) {
                check++;
                System.out.println("Type of animal: " + cages.getType());
                if (cages.hungry) {
                    System.out.println("Hungry");
                } else {
                    System.out.println("Not hungry");
                }
                if (cages.needCare) {
                    System.out.println("Need care");
                } else {
                    System.out.println("Don`t need care");
                }
            }

        }
        if (check == 0) {
            System.out.println("No animals found with the name " + name);
        }
    }


}




