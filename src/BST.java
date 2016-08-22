/**
 * Created by JOKER on 5/11/15.
 */
public class BST {
    public Node root;
    //	public BST(Word data){
//		root = new Node(data);
//	}
    public BST() {
        root = null;
    }
    public Node getRoot(){
        return this.root;
    }

    void add (Node newNode, Node rootNode){
        Node currNode = rootNode;
        // empty

        if(this.root == null){
            this.root = newNode;
            return ;
        }

        if(newNode.getKey().compareTo(currNode.getKey()) < 0){
            if(currNode.getLeft() == null){
                currNode.setLeft(newNode);
            }
            else{
                add(newNode, currNode.left);
            }
        }
        //
        if(newNode.getKey().compareTo(currNode.getKey()) > 0){
            if(currNode.right == null){
                currNode.right = newNode;
            }
            else{
                add(newNode, currNode.right);
            }
        }
    }

    public Node findParent(Node node, String t) {
        Node currNode = node;
        if (t.compareTo(currNode.getKey()) == 0) {
            return null;
        }
        if (t.compareTo(currNode.getKey()) < 0) {
            if (currNode.getLeft().getKey().equals(t)) {
                return currNode;
            }
            else {
                currNode = currNode.left;
                return findParent(currNode, t);
            }
        }
        if (t.compareTo(currNode.getKey()) > 0) {
            if (currNode.getRight().getKey().equals(t)) {
                return currNode;
            }
            else {
                currNode = currNode.right;
                return findParent(currNode, t);
            }
        }

        return null;

    }

    void delete (Node deleteNode){
        String k = deleteNode.getKey();
        Node parentNode = findParent(root,k);
        //no children
        if(deleteNode.getLeft()== null && deleteNode.getRight()==null){
            if(parentNode.left!=null){
                if(parentNode.left.equals(deleteNode)){
                    parentNode.setLeft(null);
                }
            }
            if(parentNode.right!=null){
                if(parentNode.getRight().equals(deleteNode)){
                    parentNode.right = null;
                }
            }


        }
        //one children
        if(deleteNode.getLeft()==null && deleteNode.getRight()!=null){
            if(parentNode.getKey().compareTo(deleteNode.getKey())<0){
                parentNode.right = deleteNode.right;
            }
            else{
                parentNode.left = deleteNode.right;
            }

        }
        if(deleteNode.getLeft()!=null && deleteNode.getRight()==null){
            if(parentNode.getKey().compareTo(deleteNode.getKey())<0){
                parentNode.right = deleteNode.left;
            }
            else{
                parentNode.left = deleteNode.left;
            }
        }
        //two children



    }


    public Node minNode(Node newNode){
        System.out.println("dsf");
        Node mNode = newNode;
        while (mNode.left != null) {
            System.out.println("dsf");
            mNode = mNode.left;
        }
        return mNode;
    }

//	public Node maxNode(Node newNode){
//		Node mNode = newNode;
//		while (mNode.getRight() != null) {
//            mNode = mNode.getRight();
//        }
//		return mNode;
//	}


    public void inorder()
    {
        inorder(root);
    }
    void inorder(Node r)
    {
        if(r == null){
            return;
        }

        inorder(r.getLeft());
        System.out.print(r.getKey() +" ");
        inorder(r.getRight());

    }
    public Node searchNode(String key){
        Node currNode = root;
        while (currNode != null && currNode.getKey() != key) {
            if (key.compareTo(currNode.getKey())<0) {
                currNode = currNode.getLeft();
            } else {
                currNode = currNode.getRight();
            }
        }
        return currNode;
    }


}

