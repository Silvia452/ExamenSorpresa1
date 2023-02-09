import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
    private JPanel ventana;
    private JButton botón2Button1;
    private JButton botón1Button;

    public Menu(){
        botón2Button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(null, "Pulsado Botón 1");
            }
        });
        botón1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Pulsado Botón 2");
            }
        });

    }

    public JPanel getPanel() {
        return ventana;
    }

}
