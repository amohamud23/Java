import java.util.Stack;
import java.util.Arrays;

class Node{

    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = right = null;

    }
}

public class Trees {

    Node root;

    Trees(int key){
        root = new Node(key);
    }

    Trees(){
        root = null;
    }

    public static void main(String[] args){

        Trees tree = new Trees();

        tree.root = new Node(2);

        Node n2 = new Node(3);
        Node n3 = new Node(9);
        tree.root.left = n2;
        tree.root.right = n3;
        Node n4 = new Node(7);
        Node n5 = new Node(1);
        n3.left = n4;
        n3.right = n5;

//        Trees tree2 = new Trees();
//
//        tree2.root = new Node(2);
//
//        Node k2 = new Node(1);
//        Node k3 = new Node(3);
//        tree2.root.left = k2;
//        tree2.root.right = k3;

        Node p = new Node(7);
        Node q = new Node(1);


        //Node n6 = new Node(6);
        //n5.left = n6;
        Node foo = lowestCommonAncestor(tree.root, p, q);

        //tree.root.right = new Node(3);
        //inOrderTraversal(tree.root);
        //System.out.println("\n"+getHeight(tree.root));
    }


    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null || root.key == p.key || root.key == q.key) {
            return root;
        }

        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);

        if (left != null) {
            if (right != null) {
                return root;
            }
            return left;
        }
        return right;
    }

//    public static boolean isBinarySearch(Node root){
//
//        if(root.left.key> )
//
//
//        return isBinarySearch(root.left) && isBinarySearch(root.right);
//    }

    public static boolean isIdentical(Node node1, Node node2){
        if (node1 == null && node2 == null)
            return true;

        if(node1 == null || node2 == null) {
            return false;
        }
        if (node1.key != node2.key)
            return false;

        return isIdentical(node1.left, node2.left) && isIdentical(node1.right, node2.right);

    }

//    public static Node duplicateleft(Node node){
//
//        if (node != null){
//
//            Node newNode = O;
//            Node temp = node.left;
//
//            node.left = newNode;
//
//            node.left.left = duplicateleft(temp);
//
//            node.right = duplicateleft(node.right);
//
//        }
//
//        return node;
//    }

    public static void preOrderTraverse(Node node){

        if (node != null){



            System.out.print(node.key + " ");
            //System.out.print(node.key + "->");
            preOrderTraverse(node.left);
            preOrderTraverse(node.right);
        }
    }

    public static void postOrderTraverse(Node node){

            if (node != null) {

                postOrderTraverse(node.left);
                postOrderTraverse(node.right);
                System.out.print(node.key + "->");
            }

    }

    public static void inOrderTraverse(Node node){
        if (node != null) {
            inOrderTraverse(node.left);
            System.out.print(node.key + "->");
            inOrderTraverse(node.right);
        }
    }

    public static void levelOrderTraverse(Node node){
        if (node != null){
            System.out.print(node.key + "->");
            levelOrderTraverse(node.left);
            levelOrderTraverse(node.right);

        }
    }

    public static void inOrderTraversal_(Node node){
        if (node != null) {

            char c = ' ';
            

            if ((getHeight(node.left) - getHeight(node.right ) <= 1))
            {
                System.out.println("\nBalanced");
            }
            if ((getHeight(node.left) - getHeight(node.right ) > 1))
            {
                System.out.println("\nNot Balanced");
            }

            System.out.println(node.key + " " + (getHeight(node.left) - getHeight(node.right)));

            //inOrderTraversal(node.left);
            //inOrderTraversal(node.right);
            }
            else
                System.out.println("End");
    }

    public static int getHeight(Node node){

        if (node != null) {

            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
        else
            return 0;
    }
}
