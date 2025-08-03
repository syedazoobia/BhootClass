public class Main {
    public static void main(String[] args) throws Exception {
        Bhoot b1 = new Bhoot(true, "ALI", 10, "KITCHEN");
        b1.display();
        System.out.println("----------------");
        b1.appear();
        System.out.println("----------------");
        b1.fight();
        System.out.println("----------------");
        b1.haunt();
        System.out.println("----------------");
        b1.disappear();
    }
}
