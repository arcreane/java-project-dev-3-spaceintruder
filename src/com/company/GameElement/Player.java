package com.company.GameElement;

import com.company.Commons;

import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;

public class Player extends GameElement {

    private int m_iWidth;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {

        var playerImg = "src/images/PlayerShipx3.png";
        var ii = new ImageIcon(playerImg);
        m_iWidth = Commons.PLAYER_WIDTH;
        setImage(ii.getImage()) ;

        int START_X = 270;
        setX(START_X);

        int START_Y = Commons.GROUND-Commons.PLAYER_HEIGHT-2;
        setY(START_Y);
    }

    public void act() {

        m_iX += m_iVelocity;

        if (m_iX <= 2) {

            m_iX = 2;
        }

        if (m_iX >= (int)(Commons.BOARD_WIDTH - 1.25* m_iWidth)) {

            m_iX = (int)(Commons.BOARD_WIDTH - 1.25* m_iWidth);
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            m_iVelocity = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {

            m_iVelocity = 2;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {

            m_iVelocity = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {

            m_iVelocity = 0;
        }
    }
}
