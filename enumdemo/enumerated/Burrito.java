// static import brings all the enum instance identifiers into local namespace,
// so they don't need to be qualified.
import static Spiciness.*;
//import Spiciness;


public class Burrito {
    Spiciness degree;
    public Burrito(Spiciness degree) {this.degree = degree; }

    public String toString() {return "Burrito is " + degree;}

    public static void main(String[] args) {
        System.out.println(new Burrito(NOT));
        System.out.println(new Burrito(MEDIUM));
        System.out.println(new Burrito(HOT));
    }

}