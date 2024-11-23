public abstract class Fish extends Animal {
    private int numberOfFins;

    public int getNumberOfFins() {
        return numberOfFins;
    }

    public void setNumberOfFins(int numberOfFins) {
        this.numberOfFins = numberOfFins;
    }

    public Fish(String name, int age, double weight, int numberOfFins) {
        super(name, age, weight);
        this.numberOfFins = numberOfFins;
    }

    public Fish(String name, int age, double weight) {
        super(name, age, weight);
    }
    public Fish() {}

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes bubbling sounds.");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish.");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "numberOfFins=" + numberOfFins +
                '}';
    }
}
