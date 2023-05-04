public class Main {
    public static void main(String[] args) {
     CalcServise service = new CalcServise();

        System.out.println();
        System.out.println("5 / 6");
        System.out.println(service.max(5,6));

        System.out.println();
        System.out.println("10 / 10");
        System.out.println(service.max(10,10));

        System.out.println();
        System.out.println("-10 / -20");
        System.out.println(service.max(-10,-20));
    }
}