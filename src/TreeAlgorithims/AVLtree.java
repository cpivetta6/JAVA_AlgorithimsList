package TreeAlgorithims;
import javax.swing.tree.TreeNode;

public class AVLtree {

	//AVL Tree: It is a self-balancing binary search tree, where the height difference between the left and right subtrees of any node is limited to 1.
	//This ensures that operations such as insert, delete, and search take O(log n) time, where n is the number of nodes in the tree.
	
}
/*
public TreeNode insert(TreeNode root, int key) {
	   if (root == null) {
	      return new TreeNode(key);
	   }
	   if (key < root.val) {
	      root.left = insert(root.left, key);
	   } else if (key > root.val) {
	      root.right = insert(root.right, key);
	   }
	   int heightDiff = getHeightDiff(root);
	   if (heightDiff > 1 && key < root.left.val) {
	      return rightRotate(root);
	   }
	   if (heightDiff < -1 && key > root.right.val) {
	      return leftRotate(root);
	   }
	   if (heightDiff > 1 && key > root.left.val) {
	      root.left = leftRotate(root.left);
	      return rightRotate(root);
	   }
	   if (heightDiff < -1 && key < root.right.val) {
	      root.right = rightRotate(root.right);
	      return leftRotate(root);
	   }
	   root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
	   return root;
	}*/