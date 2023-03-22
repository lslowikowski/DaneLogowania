package programy;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	   DaneLogowania daneLogowania = new DaneLogowania();
	   JFrame oknoGlowne = new JFrame("Okno logowania");
	   oknoGlowne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   oknoGlowne.add(daneLogowania.getJpPanelGlowny());
	   oknoGlowne.setSize(400, 200);

	   oknoGlowne.setVisible(true);
    }
}
