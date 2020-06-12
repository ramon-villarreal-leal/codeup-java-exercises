package util;

public class InputTest {

    public static void main(String[] args) {
        Input input = new Input();
        System.out.println(input.yesNo());
//
        System.out.println(input.getInt());
        System.out.println(input.getInt(5,30));

        System.out.println(input.getDouble(5.5, 20.6));

    }
}
