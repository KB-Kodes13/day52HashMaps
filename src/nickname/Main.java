package nickname;

import java.util.HashMap;
public class Main {
    public static void main(String[] args) {

        HashMap<String, String> nickname = new HashMap<>();

        nickname.put("matthew", "matt");
        nickname.put("michael", "mix");
        nickname.put("arthur", "artie");

        String name1 = nickname.get("matthew");

        System.out.println(name1);

    }
}