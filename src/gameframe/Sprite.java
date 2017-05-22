package gameframe;

import org.daw1.*;
import java.awt.*;

public abstract class Sprite implements Dibujable {

    double x;
    double y;
    private double anchura;
    private double altura;
    private boolean eliminado;

    public Sprite(double x, double y, double anchura, double altura) {
        this.x = x;
        this.y = y;
        this.anchura = anchura;
        this.altura = altura;
        this.eliminado = false;
    }
    


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean ColisionaCon(Sprite otro) {
        Rectangle rectThis = new Rectangle((int) (x - anchura / 2), (int) (y - altura / 2),
                (int) anchura, (int) altura
        );
        Rectangle rectOtro = new Rectangle((int) (otro.getX() - otro.getAnchura() / 2),
                (int) (otro.getY() - otro.getAltura() / 2),
                (int) otro.getAnchura(), (int) otro.getAltura()
        );
        return rectThis.intersects(rectOtro);
    }

    public boolean isEliminado() {
        return eliminado;
    }

    public void eliminar() {
        this.eliminado = true;
    }

}
