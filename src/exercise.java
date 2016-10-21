/**
 * Created by opilane on 21.10.2016.
 */
public class exercise {


    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() { //kui invoked, siis lisab sõna "wug"
        System.out.print("wug");
        ping();
    }

    public static void ping() { //kui invoked, siis lisab punkti.
        System.out.println(".");
    } //kui lisan siia lõppu baffle, siis tuleb endless loop.

}
