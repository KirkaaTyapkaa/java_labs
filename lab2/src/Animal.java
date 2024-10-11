public class Animal {
    String name;
    String type;
    String sound;
    boolean needCare;
    boolean hungry;
    String food;

    public Animal(String name, String type, String sound, String food) {
        this.name = name;
        this.type = type;
        this.sound = sound;
        this.needCare = true;
        this.hungry = true;
        this.food = food;
    }

    public void speak() {
        System.out.println(this.name + " speaks " + this.sound);
    }

    public void feed() {
        if (this.hungry) {
            System.out.println(this.name + " eats " + this.food);
            this.hungry = false;
        }
        else {
            System.out.println(this.name + " doesn't want to eat");
        }
    }

    public void needCare() {
        if (this.needCare) {
            System.out.println(this.name + " have care");
            this.needCare = true;
        }
        else {
            System.out.println(this.name + " doesn't need to be care");
        }

    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}

class Hunter extends Animal {
    public Hunter(String name, String type, String sound) {
        super(name, type, sound, "meat");
    }
}

class fly extends Animal {
    public fly(String name, String type) {
        super(name, type, "peep", "seeds");
    }
}

class Water extends Animal {
    public Water(String name, String food) {
        super(name, "fish", "boolyck", food);
    }
}