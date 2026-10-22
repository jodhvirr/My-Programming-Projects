import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        BST tree = new BST();

        JFrame frame = new JFrame("BST Visualizer");
        TreeVisualizer panel = new TreeVisualizer(tree);

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Input panel
        JPanel inputPanel = new JPanel();
        JTextField inputField = new JTextField(5);
        JButton insertButton = new JButton("Insert");
        JButton inorderButton = new JButton("Inorder Traverse");

        inputPanel.add(new JLabel("Value:"));
        inputPanel.add(inputField);
        inputPanel.add(insertButton);
        inputPanel.add(inorderButton);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        // Button actions
        insertButton.addActionListener(e -> {
            try {
                int val = Integer.parseInt(inputField.getText());
                tree.insert(val);
                inputField.setText("");
                panel.repaint(); // Update GUI
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "Enter a valid integer!");
            }
        });

        inorderButton.addActionListener(e -> {
            System.out.print("Inorder traversal: ");
            tree.inOrder(tree.getRoot());
            System.out.println();
        });

        frame.setVisible(true);
    }
}
