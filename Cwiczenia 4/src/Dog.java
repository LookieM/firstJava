public class Dog extends Mammal implements AnimalBehavior, AnimalMove, AnimalSpeak{
    private String breed;

    public Dog(String name){
        super(name);
    }


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public Dog(){}

    public Dog(int age, double weight, String furColor, String breed) {
        super(age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }



    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void getVoice(){
        System.out.println(getName() + " barks.");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats a small mouse.");
    }
    @Override
    public void sleep(){
        System.out.println(getName() + "sleeps on the couch");
    }
    @Override
    public void move(){
        System.out.println(getName() + " runs on four paws");
    }
    @Override
    public void speak(){
        System.out.println(getName() + " barks");
    }
}
