package week3TreeReview.trees_review.oracle;

public class OracleTreeQuestionTest {
    public static void main(String[] args) {
    Tree oracleTree=new Tree();
    int[] testData={3, 1, 5, 0, 2, 4, 6, 8,7};
        for (int i = 0; i < 9; i++) {
           oracleTree.insert(testData[i]);
        }
        VisualizeTree.printTree(oracleTree.root, null, false);
        System.out.println("Find Path: "+ oracleTree.findPath(-3));
    }

}
