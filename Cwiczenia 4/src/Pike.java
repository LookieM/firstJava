public class Pike extends Fish implements AnimalBehavior,AnimalMove,AnimalSpeak{
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Pike(String name, int age, double weight, int numberOfFins, double length) {
        super(name, age, weight, numberOfFins);
        this.length = length;
    }

    public Pike(String name, int age, double weight, double length) {
        super(name, age, weight);
        this.length = length;
    }

    public Pike() {
    }
    @Override
    public void getVoice() {
        System.out.println(getName() + " plops out of water.");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating smaller fish.");
    }

    @Override
    public String toString() {
        return "Pike{" +
                "length=" + length +
                '}';
    }
    @Override
    public void sleep(){
        System.out.println(getName() + "sleeps in the riverbed");
    }
    @Override
    public void move(){
        System.out.println(getName() + "zooms through the river");
    }
    @Override
    public void speak(){
        System.out.println(getName() + "speaks into the river");
    }
}
