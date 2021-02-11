package com.company;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class SpaceIntruder extends JFrame  {

    public SpaceIntruder() {
        initUI();
    }

    private void initUI() {

        add(new Board());

        setTitle("Space Invaders");
        setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var ex = new SpaceIntruder();
            ex.setVisible(true);
        });
    }
}
