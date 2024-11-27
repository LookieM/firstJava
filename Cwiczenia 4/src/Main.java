public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Czesiek", 5, 15.0, "Brown", "Mieszany");
        Dog dog2 = new Dog(2, 10.0, "Black", "Bulldog");
        Pigeon pigeon1 = new Pigeon("Perry", 1, 0.5, "Gray", true);
        Pigeon pigeon2 = new Pigeon("Polly", 2, "White", false);
        Pike pike1 = new Pike("Król wód", 3, 4.5, 8, 120.5);
        Pike pike2 = new Pike("Hunter", 2, 3.0, 85.0);



        System.out.println(pigeon1);
        pigeon1.getVoice();
        pigeon1.eat();
        System.out.println(pigeon2);
        pigeon2.getVoice();
        pigeon2.eat();
        System.out.println(pike1);
        pike1.getVoice();
        pike1.eat();
        System.out.println(pike2);
        pike2.getVoice();
        pike2.eat();
        System.out.println(dog1);
        dog1.getVoice();
        dog1.eat();
        System.out.println(dog2);
        dog2.getVoice();
        dog2.eat();
    }
}



