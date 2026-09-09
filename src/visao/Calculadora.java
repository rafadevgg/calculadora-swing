package visao;

import javax.swing.JFrame;
import java.awt.*;

public class Calculadora extends JFrame {

    public Calculadora() {
        organizarLayout();

        setVisible(true);
        setSize(232, 322);
//        setUndecorated(true); // removendo barra do SO
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }

    private void organizarLayout() {
        setLayout(new BorderLayout());
        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 60));
        add(display, BorderLayout.NORTH);
        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }

}
