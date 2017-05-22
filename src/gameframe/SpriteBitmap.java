/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameframe;

import org.daw1.StdDraw;

/**
 *
 * @author victor
 */
public class SpriteBitmap extends Sprite {
    String filename;

    public SpriteBitmap(String filename, double x, double y, double anchura, double altura) {
        super(x, y, anchura, altura);
        this.filename = filename;
    }
    
    @Override
    public void dibujar() {
        StdDraw.picture(getX(), getY(), filename, getAnchura(), getAltura());
        //StdDraw.rectangle(getX(), getY(), getAnchura() / 2 , getAltura() / 2);
    }
    
}
