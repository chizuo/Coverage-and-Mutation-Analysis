package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeOperations {
    public static <A> ArrayList<A> bfs(final Node<A> root) {
        Queue<Node<A>> queue = new LinkedList<Node<A>>();
        var results = new ArrayList<A>();
        return results;
    }

    public static <A> ArrayList<A> preorder(final Node<A> root) {
        ArrayList<A> preOrder = new ArrayList<A>();
        Stack<Node<A>> stack = new Stack<Node<A>>();
        stack.push(root);
        while (!stack.empty()) {
            var node = stack.pop();
            if (node.right != null)
                stack.push(node.right);
            if (node.left != null)
                stack.push(node.left);
            preOrder.add(node.contents);
        }
        return preOrder;
    }

    public static <A> int maxDepth(final Node<A> root) {
        return 0;
    }
}
