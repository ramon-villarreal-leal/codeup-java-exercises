package collectionsLecture;
import java.util.HashMap;

public class HashMapLecture {


    public static void main(String[] args) {


        HashMap<String, Integer> userIds = new HashMap<>();
        HashMap<String, String> passwords = new HashMap<>();
        HashMap<String, String> horses = new HashMap<>();

        userIds.put("ramonipepperoni", 1);
        userIds.put("jreich", 2);
        userIds.put("orsinger", 3);
        userIds.putIfAbsent("jreich", 4);

        userIds.replace("ramonipepperoni", 7);
        userIds.remove("orsinger");

        System.out.println(userIds.isEmpty()); // false
        System.out.println(passwords.isEmpty()); //true nothing yet in there

        System.out.println(userIds.get("jreich"));
        //get value stored in key value pair!
        System.out.println(userIds.get("jreich5"));
        System.out.println(userIds.containsKey("dstephens"));
        System.out.println(userIds.containsValue(2));
        System.out.println(userIds.getOrDefault("dstephens",4));
        System.out.println(userIds);

        userIds.clear(); // returns empty hashmap
        System.out.println(userIds);

    }
}
