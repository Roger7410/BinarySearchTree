public class Node {
    Node left, right;
    Word w;
    Node(Word data){
        this.w = data;
        left = null;
        right = null;
    }
    public void setKey(Word data){
        this.w = data;
    }

    public String getKey() {
        return w.getStr();
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }
    @Override public String toString(){
        return this.w.getStr();
    }
}

