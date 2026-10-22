public class BST {
BSTNode root;

public void insert(int value)
{
    root = insertRec(root, value);
}

private BSTNode insertRec(BSTNode node, int value)
{
if(node == null)
{
    return new BSTNode(value);
}

else if(value < node.value)
{
    node.left = insertRec(node.left, value);
}

else if(value > node.value)
{
    node.right = insertRec(node.right, value);

}
return node;


}

public void inOrder(BSTNode node)
{
    if(node != null)
    inOrder(node.left);
    System.out.print(node.value + " ");
    inOrder(node.right);


}

public BSTNode getRoot()
{
    return root;
}

}