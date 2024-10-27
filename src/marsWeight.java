public class marsWeight {


    public static void main(String[] args) {
        float weightMrozowski = 82.0f;
        float marsGravityMrozowski = 0.38f;
        float marsKgMrozowski = weightMrozowski * marsGravityMrozowski;
        double marsKgDoubleMrozowski = marsKgMrozowski;
        int marsWeightIntMrozowski = (int) marsKgDoubleMrozowski;
        char marsWeightCharMrozowski = (char) marsWeightIntMrozowski;
        int resultMrozowski = marsWeightCharMrozowski + 5;

        System.out.printf("%.2f kg na Ziemi to %f kg na Marsie\n", weightMrozowski, marsKgDoubleMrozowski);
        System.out.printf("Ciężar na Marsie po rzutowaniu na doubla: %.9f\n", marsKgDoubleMrozowski);
        System.out.printf("Ciężar na Marsie po rzutowaniu na doubla i zaokrągleniu: %.4f\n", marsKgDoubleMrozowski);
        System.out.println("Ciężar na Marsie po rzutowaniu na int: " + marsWeightIntMrozowski);
        System.out.println("Ciężar na Marsie po rzutowaniu na char: " + marsWeightCharMrozowski);
        System.out.println("Wynik po dodaniu 5 do wartości char (int): " + resultMrozowski);
    }
}

