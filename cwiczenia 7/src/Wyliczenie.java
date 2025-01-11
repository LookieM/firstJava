public class Wyliczenie {
    enum Shape {
        KWADRAT(1),
        PROSTOKAT(2),
        KOLO(3),
        TRAPEZ(4),
        ROMB(5),
        TROJKAT(6),
        OWAL(7),
        SZESCIOKAT(8);

        private final int value;

        Shape(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        System.out.println("Nazwa\t\t Wartosc poczatkowa\t Wartosc porzadkowa");
        System.out.println("-------------------------------------------------");
        for (Shape shape : Shape.values()) {
            System.out.println(shape.name());
            System.out.println(shape.ordinal());
            System.out.println(shape.getValue());
        }
    }
}

