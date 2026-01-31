package utils;
import model.Property;
import java.util.List;
import java.util.Comparator;

public class SortingUtils {

    public static void sortByPrice(List<Property> properties) {
        properties.sort((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
}