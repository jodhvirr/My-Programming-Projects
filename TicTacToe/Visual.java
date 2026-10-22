import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Visual extends JFrame{

    public Visual()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3,3));
        this.add(panel);
        this.setSize(800,800);
        this.setVisible(true);
        JButton button = new JButton();
        panel.add(button);
        button.addActionListener(new ActionListener() {
        

            
        @Override
        public void actionPerformed(ActionEvent e) {

            IO.println("Button Clicked!");

            
        }
        });



    }
}