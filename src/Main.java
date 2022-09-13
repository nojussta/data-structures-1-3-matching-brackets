public class Main {
    public static void main(String[] args) {

        String test1 = "}";
        String test2 = "{()}{[]}";
        String test3 = "[{}}";
        String test4 = "{()[{}]}{}";
        String test5 = "{(})";
        String test6 = "([(]{)})";

        System.out.println(TaskUtils.isBracketsIsMatch(test6));
    }
}