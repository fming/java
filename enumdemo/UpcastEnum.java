// No Values() method if you upcast an enum

enum Search {HITHER, YON}

public class UpcastEnum {
    public static void main(String[] args) {
        Search[] vals = Search.values();

        Enum e = Search.HITHER; // Upcase
        // e.values() // No values in Enum
        for (Enum en : e.getClass().getEnumConstants()) {
            System.out.println(en);
        }

        // getEnumConstants is a method of Class
        Class<Integer> intClass = Integer.class;
        try {
            for(Object en : intClass.getEnumConstants())
                System.out.println(en);
        } catch(Exception ex) {
            System.out.println(ex);
        }



    }
}