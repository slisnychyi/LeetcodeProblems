package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static java.util.Arrays.asList;
import static java.util.List.of;

public class IterrativePreOrderTreeTraversal {

    public static void main(String[] args) {
        Node root = new Node(1, asList(
                new Node(2),
                new Node(3, of(new Node(6), new Node(7, of(new Node(11))))),
                new Node(4, of(new Node(8, of(new Node(12))))),
                new Node(5, of(new Node(9, of(new Node(13))), new Node(10)))
        ));
        System.out.println(new IterrativePreOrderTreeTraversal().preorder(root));

    }

    public String removeOuterParentheses(String s) {
        String result = "";
        int pointer = 1;
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        stack.push(arr[0]);
        while(pointer < arr.length){
            if(arr[pointer] == ')'){
                stack.pop();
                if(stack.isEmpty()){
                    if(pointer == arr.length - 1) break;
                    stack.push(arr[pointer + 1]);
                    pointer += 2;
                } else {
                    result += ")";
                    pointer++;
                }
            } else {
                stack.push(arr[pointer]);
                result += "(";
                pointer++;
            }
        }
        return result;
    }

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node pop = stack.pop();
            List<Node> children = pop.children;
            result.add(pop.val);
            if(children != null){
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
        }
        return result;
    }

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
