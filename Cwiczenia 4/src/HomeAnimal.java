public class HomeAnimal <T extends Animal & AnimalMove & AnimalSpeak> {
    T animal;

    HomeAnimal(T animal) {
        this.animal = animal;
    }

    String getObj() {
        return animal.getClass().getName();
    }

    void speak() {
        System.out.println(animal.getClass().getName() + " speaks");
    }

    void move() {
        System.out.println(animal.getClass().getName() + " moves");
    }

    void sleep() {
        System.out.println(animal.getClass().getName() + " sleeps on the couch");
    }

    void showType(){
        System.out.println("Type is " + animal.getClass().getName());
    }
}


    class GenericDemo{
        public static void main(String[] args){
            HomeAnimal<Dog> ob1 = new HomeAnimal<>(new Dog("Reksio"));
            HomeAnimal<Pigeon> ob2 = new HomeAnimal<>(new Pigeon("Ptaku"));
            HomeAnimal<Pike> ob3 = new HomeAnimal<>(new Pike());


            System.out.println(ob1.getObj());
            ob1.showType();

            System.out.println(ob2.getObj());
            ob2.showType();

            System.out.println(ob3.getObj());
            ob3.showType();

            ob1.sleep();
            ob2.sleep();
            ob3.sleep();
        }
    }

