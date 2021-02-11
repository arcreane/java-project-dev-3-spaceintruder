package com.company.GameElement;

import javax.swing.ImageIcon;

public class Shot extends GameElement {

    public Shot() {
    }

    public Shot(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        var shotImg = "src/images/shot.png";
        var ii = new ImageIcon(shotImg);
        setImage(ii.getImage());

        setX(x);

        setY(y);
    }
}
