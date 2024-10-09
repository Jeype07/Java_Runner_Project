public class Camera {
    private int x; // on initialise la coordonnée x
    private int y; // de même pour y

    public Camera(int x, int y) { // constructeur de la classe Camera
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() { // permettra d'afficher "x,y"
        return x + "," + y;
    }
}