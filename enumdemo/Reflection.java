// Analyzing enums using reflection
// javap xxxxx
import java.lang.reflect.*;
import java.util.*;

enum Explore {HERE, THERE} 

public class Reflection {
    public static Set<String> analyze(Class<?> enumClass) {
        System.out.println("----- Analyzing " + enumClass + " -----");
        System.out.println("Interfaces:");
        for(Type t : enumClass.getGenericInterfaces()) {
            System.out.println(t);
        }

        System.out.println("Base: " + enumClass.getSuperclass());
        System.out.println("Methods: ");
        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods()) {
            methods.add(m.getName());
            System.out.println(m);
        }

        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analyze(Explore.class);
        System.out.println("---------------------------------");
        Set<String> enumMethods = analyze(Enum.class);
        System.out.println("Explore.containsAll(Enum)? " + exploreMethods.containsAll(enumMethods));
        System.out.println("Explore.removeAll(Enum)? " + exploreMethods.removeAll(enumMethods));
        for(String m : exploreMethods) {
            System.out.println(m);
        }

        OSExecute.command("javap Explore");


    }
}