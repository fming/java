import static Food.*;

import Food.Appetizer;
import Food.Coffee;
import Food.Dessert;
import Food.MainCourse;

public class TypeOfFood {
    public static void main(String[] args) {
        Food food = Appetizer.SALAD;

        food = MainCourse.LASAGNE;
        food = Dessert.GELATO;
        food = Coffee.CAPPUCCINO;
    }
}