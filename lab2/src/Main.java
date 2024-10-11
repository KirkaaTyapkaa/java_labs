import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.println("""
                    \n1 - watch list of animals
                    2 - check status of animal
                    3 - feed animal
                    4 - care animal
                    5 - listen animal
                    0 - exit
                    
                    Enter what you want to do
                    """);
            n = sc.nextInt();

            switch (n) {
                case 1:
                    Zoo.listNames();
                    break;
                case 2:
                    Zoo.status();
                    break;
                case 3:
                    Zoo.feed();
                    break;
                case 4:
                    Zoo.care();
                    break;
                case 5:
                    Zoo.listenAnimal();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (n != 0);
    }
}



