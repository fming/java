enum Shrubbery {GROUND, CRAWLING, HANGING }

public class EnumClass {
    static <T> void print(T out) {
        System.out.print(out);
    }

    static <T> void  println(T out) {
        System.out.println(out);
    }
    public static void main(String[] args) {
        for (Shrubbery s : Shrubbery.values()) {
            println(s + " ordinal: " + s.ordinal());
            print(s.compareTo(Shrubbery.CRAWLING) + " ");
            print(s.equals(Shrubbery.CRAWLING) + " ");
            print(s == Shrubbery.CRAWLING);
            println(s.getDeclaringClass());
            println(s.name());
            println("--------------------------");

        }

        // Produce an enum value from a string name:
        for(String s: "HANGING CRAWLING GROUND".split(" ")) {
            Shrubbery shrub = Enum.valueOf(Shrubbery.class, s);
            println(shrub);
        }
    }
}