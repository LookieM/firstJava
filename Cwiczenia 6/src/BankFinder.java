import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BankFinder {
    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Podaj trzy pierwsze cyfry numeru konta: ");
            String prefix = reader.readLine();

            if (prefix.length() != 3 || !prefix.matches("\\d{3}")) {
                System.out.println("Nieprawidłowy format cyfr. Program zakończony.");
                return;
            }

            String url = "https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt";
            String content = downloadFile(url);

            if (content != null) {
                String bankInfo = findBankInfo(content, prefix);

                if (bankInfo != null) {
                    System.out.println("Numer banku i jego nazwa: " + bankInfo);
                } else {
                    System.out.println("Nie znaleziono informacji dla podanych cyfr.");
                }
            } else {
                System.out.println("Błąd pobierania pliku.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String downloadFile(String urlString) {
        StringBuilder content = new StringBuilder();
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return content.toString();
    }

    private static String findBankInfo(String content, String prefix) {
        String[] lines = content.split("\n");

        for (String line : lines) {
            String bankNumber = line.split("\\s+")[0];

            if (bankNumber.startsWith(prefix)) {
                String bankName = line.substring(bankNumber.length()).trim();
                return "Numer banku: " + bankNumber + ", Nazwa banku: " + bankName;
            }
        }

        return null;
    }
}
