package trees;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

public class TreeOperationsTest {
    Node<String> K = new Node<String>("K", null, null);
    Node<String> J = new Node<String>("J", null, K);
    Node<String> H = new Node<String>("H", null, null);
    Node<String> I = new Node<String>("I", H, J);
    Node<String> C = new Node<String>("C", null, null);
    Node<String> E = new Node<String>("E", null, null);
    Node<String> A = new Node<String>("A", null, null);
    Node<String> D = new Node<String>("D", C, E);
    Node<String> B = new Node<String>("B", A, D);
    Node<String> G = new Node<String>("G", null, I);
    Node<String> F = new Node<String>("F", B, G);

    @Test
    public void TestPreOrder() {
        ArrayList<String> expects = new ArrayList<String>();
        expects.add("F");
        expects.add("B");
        expects.add("A");
        expects.add("D");
        expects.add("C");
        expects.add("E");
        expects.add("G");
        expects.add("I");
        expects.add("H");
        expects.add("J");
        expects.add("K");
        assertEquals(expects, TreeOperations.preorder(F));
        assertEquals(TreeOperations.preorder(F), TreeOperations.preorder(F));
    }

    @Test
    public void TestMaxDepth() {
        assertEquals(5, TreeOperations.maxDepth(F));
        assertEquals(3, TreeOperations.maxDepth(B));
        assertEquals(4, TreeOperations.maxDepth(G));
        assertEquals(2, TreeOperations.maxDepth(D));
        assertEquals(TreeOperations.maxDepth(B), TreeOperations.maxDepth(I));
    }
}
