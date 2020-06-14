import java.util.Random;

public class ServerNameGenerator {
    //creating an array of adjectives
    private static String[] adjectives = {
            "ambitious",
            "brave",
            "fancy",
            "muscular",
            "plump",
            "fierce",
            "groovy",
            "chubby",
            "gentle",
            "zealous"
    };
    //creating an array of nouns
    private static String[] nouns = {
            "skateboard",
            "boxing glove",
            "pc tower",
            "manga",
            "tokyo",
            "horse",
            "cat",
            "skeleton",
            "halloween",
            "boozer"
    };

    static Random randomizer = new Random();

    public static String randomElem(String[] words) {
        return words[randomizer.nextInt(words.length)];
    }

    public static String serverName(String a, String b) {
        return "Your new server name is: " + a + "-" + b;
    }





    public static void main(String[] args) {
        System.out.println(serverName(randomElem(adjectives),randomElem(nouns)));
        System.out.println(serverName(randomElem(adjectives),randomElem(nouns)));

    }
}
