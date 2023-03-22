package programy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DaneLogowania {
    private JPanel jpPanelGlowny;
    private JTextField tfLogin;
    private JPasswordField tfHaslo;
    private JButton jbZaloguj;
    private JLabel jlKomunikat;
    private JLabel jlLogin;
    private JLabel jlHaslo;

    public DaneLogowania() {
        jbZaloguj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String loginStr = tfLogin.getText();
                String hasloStr = String.valueOf(tfHaslo.getPassword());
                if(hasloStr.equals("tajne")) {
                    jlKomunikat.setText("Witaj: " + loginStr);
                } else{
                    jlKomunikat.setText("Błedna nazwa użytkownika lub hasło");
                }
            }
        });
    }

    public JPanel getJpPanelGlowny() {
        return jpPanelGlowny;
    }
}
