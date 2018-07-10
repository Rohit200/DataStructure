package BinarySearch;
public class BinaryTree
{
 Node root;
 public BinaryTree()
 {
	 this.root=null;
 }
 public Node insertRec(Node root,int key)
 {
	 if(root==null)
	 {
		 root=new Node(key);
		 return root;
	 }
	 if(key<root.key)
		 root.left=insertRec(root.left,key);
	 else if(root.key<key)
	root.right=insertRec(root.right,key);
	 return root;
 }
 public void insert(int key)
 {
	 root=insertRec(root,key);
 }
 public void inorderRec(Node root)
 {
	 if(root!=null)
	 {
		 inorderRec(root.left);
		 System.out.println(root.key);
		 inorderRec(root.right);
		
		 }
 }
 public void inorder()
 {
	 inorderRec(root);
 }
 }

