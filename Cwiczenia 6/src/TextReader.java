import java.io.*;

public class TextReader {
    public static void copyAndReplaceSpaces(String inputFilePath, String outputFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String modifiedLine = line.replaceAll(" ", "-");
                writer.write(modifiedLine);
                writer.newLine();
            }
            System.out.println("File copied.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found. Please check the file path.");
        } catch (IOException e) {
            System.out.println("Error: An I/O exception occurred.");
        }
    }

    public static void main(String[] args) {

        String inputPath = "C:\\Users\\Lookie\\myCode\\Java\\firstJava\\Cwiczenia 6\\wejscie.txt";
        String outputPath = "C:\\Users\\Lookie\\myCode\\Java\\firstJava\\Cwiczenia 6\\wyjscie.txt";

        copyAndReplaceSpaces(inputPath, outputPath);
    }
}
