package testForBranch;

import java.util.Stack;

public class TestForBranch {
    public static void main(String[] args) {


        Stack<Integer> testStack = new Stack<>();

        testStack.add(23);
        testStack.add(24);
        testStack.add(25);
        testStack.add(26);
        testStack.add(27);
        System.out.println(testStack);

        testStack.pop();
        testStack.pop();

        System.out.println(testStack);

    }
}
