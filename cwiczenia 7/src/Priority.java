public class Priority implements Runnable{
    int count; Thread thread; static boolean stop = false; static String currentName;


    Priority(String name){
        thread = new Thread(this, name);
        count = 0;
        currentName = name;
    }
    public void run() {
        System.out.println(thread.getName() + "rozpoczyna działanie");
        do {
            count++;
            if (currentName.compareTo(thread.getName()) != 0) {
                currentName = thread.getName();
                System.out.println(currentName + " jest wykonany");
            }
        } while (stop == false && count < 10_000_000);
        stop = true;
        System.out.println("\n" + thread.getName() + " kończy działanie");
    }}

class PriorityDemo{
    public static void main(String[] args) {
        Priority m1 = new Priority("Wątek o wysokim priorytecie");
        Priority m2 = new Priority("Wątek o niskim priorytecie");
        Priority m3 = new Priority("Wątek nr 1 o normalnym priorytecie");
        Priority m4 = new Priority("Wątek nr 2 o normalnym priorytecie");
        Priority m5 = new Priority("Wątek nr 3 o normalnym priorytecie");

        m1.thread.setPriority(Thread.MAX_PRIORITY);
        m2.thread.setPriority(Thread.MIN_PRIORITY);

        m1.thread.start();m2.thread.start();m3.thread.start();m4.thread.start();m5.thread.start();
        try {
            m1.thread.join();
            m2.thread.join();
            m3.thread.join();
            m4.thread.join();
            m5.thread.join();
        } catch (InterruptedException e){
            System.out.println("Główny wątek rozpoczyna działanie");}
        System.out.println("\nWątek o wysokim priorytecie doliczył do " + m1.count);
        System.out.println("Wątek o niskim priorytecie doliczył do " + m2.count);
        System.out.println("1. Wątek o normalnym priorytecie doliczył do " + m3.count);
        System.out.println("2. Wątek o normalnym priorytecie doliczył do " + m4.count);
        System.out.println("3. Wątek o normalnym priorytecie doliczył do " + m5.count);

    }



}
