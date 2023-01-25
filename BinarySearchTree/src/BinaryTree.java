
public class BinaryTree implements BinarySearchTreeIF{
	private Node root;

	public Node getRoot() {
		return root;
	}

	public int count;

	public BinaryTree() {
		root = null;

	}

	public void BuildTree01() {
		Node n1 = new Node(5);
		Node n2 = new Node(15);
		Node n3 = new Node(7);
		Node n4 = new Node(10);
		Node n5 = new Node(20);
		Node n6 = new Node(14);
		Node n7 = new Node(1);
		Node n8 = new Node(9);

		n1.lchild = n2;
		n1.rchild = n3;
		n2.lchild = n4;
		n2.rchild = n5;
		n3.lchild = n6;
		n6.lchild = n7;
		n6.rchild = n8;

		root = n1;
	}

//	public int NodeCount(Node root) {
//		if (root == null)
//			return 0;
//		if (root.lchild == null && root.rchild == null)
//			return 1;
//
//		int lc = NodeCount(root.lchild);
//		int rc = NodeCount(root.rchild);
//		return lc + rc + 1;
//
//	}
//
//	public int LeafNodeCount(Node root) {
//		if (root == null)
//			return 0;
//		if (root.lchild == null && root.rchild == null)
//			return 1;
//
//		int lc = LeafNodeCount(root.lchild);
//		int rc = LeafNodeCount(root.rchild);
//		return lc + rc ;
//
//	}
//
//	public void preorder() {
//		count = 0;
//		preorder(root);
//		System.out.println("checked calls" + count);
//
//	}
//
//	private void preorder(Node root) {
//		count++;
//		if (root == null)
//			return;
//
//		System.out.println(root.getData());
//
//		if (root.lchild != null)
//			preorder(root.lchild);
//
//		if (root.rchild != null)
//			preorder(root.rchild);
//
//	}
//
//	public void preorderWOCheck() {
//		count = 0;
//		preorderWOCheck(root);
//		System.out.println("unchecked calls" + count);
//	}
//
//	private void preorderWOCheck(Node root) {
//		count++;
//		if (root == null)
//			return;
//		System.out.println(root.getData());
//		preorderWOCheck(root.lchild);
//		preorderWOCheck(root.rchild);
//	}
//
//	public void postorder() {
//		postorder(root);
//	}
//
//	private void postorder(Node root) {
//		if (root == null)
//			return;
//
//		postorder(root.lchild);
//		postorder(root.rchild);
//		System.out.println(root.getData());
//	}
//
//	public void inorder() {
//		inorder(root);
//	}
//
//	private void inorder(Node root) {
//		if (root == null)
//			return;
//
//		inorder(root.lchild);
//		System.out.println(root.getData());
//		inorder(root.rchild);
//
//	}
}
