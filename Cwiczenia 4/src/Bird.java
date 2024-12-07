public abstract class Bird extends Animal {
    private String featherColor;

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird() {
    }

    public Bird(String name, int age, String featherColor) {
        super(name, age);
        this.featherColor = featherColor;
    }
    @Override
    public void getVoice() {
        System.out.println(getName() + " chirps or sings.");
    }
    @Override
    public void eat(){
        System.out.println(getName() + " is eating seeds.");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }

    public abstract void sleep();
}
