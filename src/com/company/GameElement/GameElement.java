package com.company.GameElement;

import java.awt.Image;

public class GameElement {

    private boolean m_bVisible;
    private Image image;
    private boolean m_bDying;

    int m_iX;
    int m_iY;
    int m_iVelocity;

    public GameElement() {

        m_bVisible = true;
    }

    public void die() {

        m_bVisible = false;
    }

    public boolean isVisible() {

        return m_bVisible;
    }

    protected void setVisible(boolean p_bVisible) {

        this.m_bVisible = p_bVisible;
    }

    public void setImage(Image image) {

        this.image = image;
    }

    public Image getImage() {

        return image;
    }

    public void setX(int p_iX) {

        this.m_iX = p_iX;
    }

    public void setY(int p_iY) {

        this.m_iY = p_iY;
    }

    public int getY() {

        return m_iY;
    }

    public int getX() {

        return m_iX;
    }

    public void setDying(boolean p_bDying) {

        this.m_bDying = p_bDying;
    }

    public boolean isDying() {

        return this.m_bDying;
    }
}
