public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        try{
            generator.GenerateException();
        } catch(Exception e){
            System.out.println("Wystąpił NullPointerException");
            e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
