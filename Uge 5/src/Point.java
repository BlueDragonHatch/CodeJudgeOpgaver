public class Point {

    int x;
    int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "(" + x + "," + y +")";
    } // returnerer en streng-repræsentation af punktet
    public boolean equals(Point p){
        return x == p.x && y == p.y;
    } // undersøger om to punkter er ens
    public void move(int dx, int dy){
        x += dx;
        y += dy;
    } // flytter punktet med dx, dy
}
