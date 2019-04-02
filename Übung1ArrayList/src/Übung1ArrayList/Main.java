package Übung1ArrayList;
public class Main {
    public static void main(String[] args) {
        CharElement stack = new CharElement();
        stack.push('a');
        stack.push('b');
        stack.push('c');

        System.out.println(stack.toString());

        System.out.println(stack.size());

        stack.pop();

        System.out.println(stack.toString());

        System.out.println(stack.size());

        System.out.println(stack.isPalindrom("Rotor"));
        System.out.println(stack.isPalindrom("Motor"));
        System.out.println(stack.isPalindrom("Otto"));
        System.out.println(stack.isPalindrom("Die Liebe fleht: Helfe bei Leid!"));

    }
}
