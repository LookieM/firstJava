import java.math.BigDecimal;
import java.math.RoundingMode;

public class vatCalculator {
    public static void main(String[] args) {
        double nettoPrice = 9.99;
        double bruttoPrice = nettoPrice * 1.23;
        double nettoValue = nettoPrice * 10000;
        double bruttoValue = bruttoPrice * 10000;

        System.out.printf("Cena bez Vatu %f\n", nettoPrice);
        System.out.printf("Cena z Vatem %.9f\n", bruttoPrice);
        System.out.printf("Wartość bez Vatu %.9f\n", nettoValue);
        System.out.printf("Wartość z Vatem %.9f\n\n", bruttoValue);

        BigDecimal netto = new BigDecimal(9.99);
        BigDecimal vatRate = new BigDecimal(1.23);

        BigDecimal brutto = netto.multiply(vatRate).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal nettoOverall = netto.multiply(new BigDecimal(10000)).setScale(2, RoundingMode.HALF_EVEN);
        BigDecimal bruttoOverall = brutto.multiply(new BigDecimal(10000).setScale(2, RoundingMode.HALF_EVEN));

        System.out.printf("Po użyciu BigDecimal\n\n");
        System.out.printf("Cena bez Vatu %s\n", netto);
        System.out.printf("Cena z Vatem %s\n", brutto);
        System.out.printf("Wartość bez Vatu %s\n", nettoOverall);
        System.out.printf("Wartość z Vatem %s\n", bruttoOverall);


    }
}
