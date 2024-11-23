public abstract class Mammal extends Animal {
    private String furColor;
    public Mammal() {
        super();
        this.furColor = " ";
    }
    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(int age, double weight, String furColor) {
        super(furColor, age, weight);
        this.furColor = furColor;
    }
    public String getFurColor() {
        return furColor;
    }
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    @Override
    public void getVoice() {
        System.out.println(getName() + " growls or makes a mammalian sound.");
    }
    @Override
    public void eat(){
        System.out.println(getName() + "drinks milk.");
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "furColor='" + furColor + '\'' +
                '}';
    }
}
