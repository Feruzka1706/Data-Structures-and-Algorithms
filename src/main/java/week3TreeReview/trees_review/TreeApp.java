package week3TreeReview.trees_review;

public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < 11; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root, null, false);

        tree.printLeaves(tree.root);
        System.out.println("Leaves amount: "+ tree.countLeaves( tree.root));
        System.out.println("Leaves amount 2: "+ tree.countLeaves2( tree.root));

        System.out.println("Calculate sum of leaves: "+ tree.findSumOfLeaves(tree.root));
        System.out.println("Calculate node of sum "+ tree.calculateNodeSums(tree.root));




//        System.out.println("Tree contains 42:  " + tree.contains(42));
//        System.out.println("Node is a leaf node is : " + tree.isLeaf(tree.root.leftChild.rightChild));
//        tree.printLeaves(tree.root);
//        System.out.println("Height of the tree is: " + tree.height(tree.root));
//        System.out.println("Number of leaves:  " + tree.countLeaves(tree.root));
//
//        System.out.println("Sum of Leaf Nodes: " + tree.findSumOfLeaves(tree.root));
//        System.out.println("Sum of all node values is: " + tree.calculateNodeSums(tree.root));
//        /*System.out.println();
//        System.out.println("Number of leaves:  " +tree.countLeaves(tree.root));
//
//        ;
//        // System.out.println("Sum of Node Depths is: " + tree.calculateNodeDepthSums());
//        */

    }
}
