package com.company.sprite;

import javax.swing.ImageIcon;

public class Alien extends Sprite {

    private Bomb bomb;

    public Alien(int x, int y) {

        initAlien(x, y);
    }

    private void initAlien(int x, int y) {

        this.m_iX = x;
        this.m_iY = y;

        bomb = new Bomb(x, y);

        var alienImg = "src/images/AlienX3.png";
        var ii = new ImageIcon(alienImg);

        setImage(ii.getImage());
    }

    public void act(int direction) {

        this.m_iX += direction;
    }

    public Bomb getBomb() {

        return bomb;
    }

    public class Bomb extends Sprite {

        private boolean destroyed;

        public Bomb(int x, int y) {

            initBomb(x, y);
        }

        private void initBomb(int x, int y) {

            setDestroyed(true);

            this.m_iX = x;
            this.m_iY = y;

            var bombImg = "src/images/bomb.png";
            var ii = new ImageIcon(bombImg);
            setImage(ii.getImage());
        }

        public void setDestroyed(boolean destroyed) {

            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {

            return destroyed;
        }
    }
}
