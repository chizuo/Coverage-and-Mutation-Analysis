package trees;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TreeOperationsTest {
    @Test

    public void Testpreorder() {
        Node<String> H = new Node<String>("H", null, null);
        Node<String> I = new Node<String>("I", H, null);
        Node<String> C = new Node<String>("C", null, null);
        Node<String> E = new Node<String>("E", null, null);
        Node<String> A = new Node<String>("A", null, null);
        Node<String> D = new Node<String>("D", C, E);
        Node<String> B = new Node<String>("B", A, D);
        Node<String> G = new Node<String>("G", null, I);
        Node<String> F = new Node<String>("F", B, G);
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
        assertEquals(expects, TreeOperations.preorder(F));
        assertEquals(TreeOperations.preorder(F), TreeOperations.preorder(F));
    }
}
