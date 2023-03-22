package programy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaneOsobowe {
    private JPanel jpPanelGlowny;
    private JTextField tfImie;
    private JLabel jlKomunikat;
    private JLabel jlImie;
    private JTextField tfNazwisko;
    private JLabel jlNazwisko;
    private JButton jbZatwierdz;

    public DaneOsobowe() {
        jbZatwierdz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imieStr = tfImie.getText();
                String nazwiskoStr = tfNazwisko.getText();
                jlKomunikat.setText("Witaj: " + imieStr + " " + nazwiskoStr);
            }
        });
    }

    JPanel getPanelGlowny(){
        return jpPanelGlowny;
    }
}
