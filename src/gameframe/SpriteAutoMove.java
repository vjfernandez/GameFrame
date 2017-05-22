
package gameframe;

public class SpriteAutoMove extends SpriteBitmap implements Movible {
    private double iX;
    private double iY;

    public SpriteAutoMove(String filename, double x, double y, double anchura, double altura) {
        super(filename, x, y, anchura, altura);
        this.iX = 0;
        this.iY = 0;
    }

    
    public double getiX() {
        return iX;
    }

    public void setiX(double iX) {
        this.iX = iX;
    }

    public double getiY() {
        return iY;
    }

    public void setiY(double iY) {
        this.iY = iY;
    }

    @Override
    public void mover() {
        setX(getX() + iX);
        setY(getY() + iY);
    }
    
    
}
