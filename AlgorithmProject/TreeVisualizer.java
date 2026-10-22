import java.awt.*;
import javax.swing.*;

public class TreeVisualizer extends JPanel {
private BST tree;

    public TreeVisualizer(BST tree) {
        this.tree = tree;
    }

@Override
protected void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        drawTree(g, tree.getRoot(), getWidth()/2, 50, getWidth()/4);
    }

    private void drawTree(Graphics g, BSTNode node, int x, int y, int xOffset) {
        if (node == null) 
        {
            return;
        }

         g.setColor(Color.BLUE);
        g.fillOval(x-15, y-15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(node.value), x-6, y+4);

        g.setColor(Color.BLACK);
        if (node.left != null) {
            g.drawLine(x, y, x-xOffset, y+50);
            drawTree(g, node.left, x-xOffset, y+50, xOffset/2);
        }
        if (node.right != null) {
            g.drawLine(x, y, x+xOffset, y+50);
            drawTree(g, node.right, x+xOffset, y+50, xOffset/2);
        }
    }
}


