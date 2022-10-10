package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeOperations {
    public static <A> ArrayList<A> bfs(final Node<A> root) {
        return new ArrayList<A>();
    }

    public static <A> ArrayList<A> preorder(final Node<A> root) {
        ArrayList<A> preOrder = new ArrayList<A>();
        Queue<Node<A>> queue = new LinkedList<Node<A>>();
        queue.add(root);
        return preOrder;
    }

    public static <A> int maxDepth(final Node<A> root) {
        return 0;
    }
}
