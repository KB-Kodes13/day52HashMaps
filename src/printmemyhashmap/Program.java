package printmemyhashmap;
import java.util.HashMap;
public class Program {
    public static void printKeys(HashMap<String, String> hashmap) {

        for (String key : hashmap.keySet()) {
            // Print the key
            System.out.println(key);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {

            if (key.contains(text)) {

                System.out.println(key);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {

        for (String key : hashmap.keySet()) {

            if (key.contains(text)) {

                String value = hashmap.get(key);

                System.out.println(value);
            }
        }
    }
}
