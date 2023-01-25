
public class BinaryTreeTester {

	public static void main(String[] args) {
	BinaryTree binaryTree01 =new BinaryTree();
	binaryTree01.BuildTree01();
	binaryTree01.preorder();
	System.out.println();
	binaryTree01.preorderWOCheck();
//	binaryTree01.postorder();
	//binaryTree01.inorder();
	
	System.out.println("No of Nodes in tree = "+binaryTree01.NodeCount(binaryTree01.getRoot()));
	System.out.println("No of Nodes in tree = "+binaryTree01.LeafNodeCount(binaryTree01.getRoot()));
	
	
	}

}
