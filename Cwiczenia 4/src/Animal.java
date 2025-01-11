public abstract class Animal {
    private String name;
    private int age;
    private double weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
        public void eat()
        {
            System.out.println("Eating...");
        }
        public void getVoice()
        {
            System.out.println("Voice...");
        }

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Animal() {}

    public Animal(String name){
        this.name = name;
    }

}
