public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
    }
    public static class Singleton {
        public static Singleton obj;
        private Singleton() {
            System.out.println("Obj created");
        }
        // Apply Double-Checked Locking for thread safety
        public static Singleton getInstance() {
            if(obj==null) {
                synchronized (Singleton.class) {
                    if(obj==null) {
                        obj = new Singleton();
                    }
                }
            }
            return null;
        }
    }
}