/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zombie1;

/**
 *
 * @author jeisson
 */
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Nivel1 extends JPanel implements ActionListener, MouseListener {

    //private final int initial_X=
    int x;
    int y;
    private Timer timer;
    private int a = 2;
    private final Color color;
    //private ArrayList<Circulo> circulos;

    public Nivel1() {
        this.addMouseListener(this);
        timer = new Timer( a, this);
        timer.start();
        this.color = Color.BLUE;
       //this.circulos = new ArrayList<>();
        //llenarcirculos();
    }

   /* public void llenarcirculos() {
        for (int i = 0; i < 200; i++) {
            this.circulos.add(new Circulo(x, y));
        }
    }*/

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Colisiones", 600, 30);
        g.drawString(": xxx", 670, 30);
        g.drawRoundRect(x, x, 30, 30, 30, 30);
        g.drawRect(x + 10, 320, 60, 100);
       /* for (int i = 0; i < 200; i++) {
            int x = this.circulos.getX();
            int y = this.circulos.getY();
            this.circulos.get().setX(this.x);
            g.drawRect(x + 500, y + 360, 60, 100);
        }*/
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 1;
        repaint();
    }

    @Override
    public Rectangle getBounds() {
        //Dimension del carro
        return new Rectangle(x + 10, 320, 120, 60);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Point mp = e.getPoint();
        if (getBounds().contains(mp)) {
            this.timer.stop();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
