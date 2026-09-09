package visao;

import modelo.Memoria;
import modelo.MemoriaObserver;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel implements MemoriaObserver {

    private final JLabel label;

    public Display() {
        Memoria.getInstancia().addObserver(this);
        setBackground(new Color(46, 49, 50));
        label = new JLabel(Memoria.getInstancia().getTextoAtual());
        label.setForeground(Color.WHITE);
        label.setFont(new Font("courier", Font.PLAIN, 25));

        setLayout(new FlowLayout(FlowLayout.RIGHT, 8, 20));

        add(label);
    }

    @Override
    public void valorAlterado(String novoValor) {
        label.setText(novoValor);
    }
}
