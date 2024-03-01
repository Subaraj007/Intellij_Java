public class Main {
    public void Animal(){
        System.out.println("This is animal.");
    }
    public static String Dog(){
        return "This is dog.";
    }
    public static void main(String[] args) {
        Main myMain = new Main();
        myMain.Animal();
        System.out.println(Dog());
    }
}