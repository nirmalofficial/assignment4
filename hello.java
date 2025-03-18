public class Hello {
    public String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        Hello hello = new Hello();
        System.out.println(hello.greet("World"));
    }
}
