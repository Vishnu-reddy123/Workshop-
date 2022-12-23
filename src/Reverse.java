public class Reverse {
    public static void main(String[] args) {
        String string = "Hi my name is your name";
        System.out.println("original string" + string);
        StringBuilder reverseString = new StringBuilder(string);
        reverseString.reverse();
        String result = reverseString.toString();
        System.out.println("Reversed string:"+result);
    }
}
