public interface AnimalSpeak {
    default void speak() {
        System.out.println("Makes a generic sound");
    }
}
