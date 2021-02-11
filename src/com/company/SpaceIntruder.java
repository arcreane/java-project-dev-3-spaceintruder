package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SpaceIntruder extends JFrame  {

    public static void main(String[] args) {
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
        panel.setLayout(boxlayout);
        panel.setBackground(Color.BLACK);
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));
        JButton jb1 = new JButton("Start");
        JButton jb2 = new JButton("Score");
        JButton jb3 = new JButton("Exit");

        jb3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        } );
        jb1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                EventQueue.invokeLater(() -> {
                    frame.getContentPane().removeAll();
                    initUI(frame);
                });
            }
        } );
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private static void initUI(JFrame frame) {
        Board board = new Board();
        frame.add(board);
        frame.setTitle("Space Intruder");
        frame.setSize(Commons.BOARD_WIDTH, Commons.BOARD_HEIGHT);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        board.requestFocus();
    }
}
