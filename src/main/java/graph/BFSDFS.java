package graph;

import java.util.LinkedList;
import java.util.Queue;

public class BFSDFS {
    public static void main(String[] args) {
        Node tree = new Node(10,
                new Node(5, new Node(2, null, new Node(4, null, null)), null),
                new Node(15, null, null));

        bfs(tree);
    }

    static void bfs(Node root) {
        Queue<Node> values = new LinkedList<>();
        values.add(root);
        while (values.size() > 0){
            Node node = values.poll();
            System.out.println(node.value());
            if(node.left() != null) values.add(node.left());
            if(node.right() != null) values.add(node.right());
        }
    }

}

record Node(int value, Node left, Node right) {
}
