public class Pigeon extends Bird implements AnimalMove, AnimalBehavior{
    private boolean domestic;

    public boolean isDomestic() {
        return domestic;
    }

    public void setDomestic(boolean domestic) {
        this.domestic = domestic;
    }

    public Pigeon(String name, int age, double weight, String featherColor, boolean domestic) {
        super(name, age, weight, featherColor);
        this.domestic = domestic;
    }

    public Pigeon(String name, int age, String featherColor, boolean domestic) {
        super(name, age, featherColor);
        this.domestic = domestic;
    }
    public Pigeon() {}

    @Override
    public void getVoice() {
        System.out.println(getName() + " coos.");
    }

    @Override
    public void eat(){
        System.out.println(getName() + " is eating bread crumbs.");
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "domestic=" + domestic +
                '}';
    }
    @Override
    public void sleep(){
        System.out.println(getName() + "sleeps atop a roof");
    }
}
