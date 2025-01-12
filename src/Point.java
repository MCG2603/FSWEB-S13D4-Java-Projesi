public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x=x;
        this.y=y;

    }
    public double distance(){
        return Math.sqrt((this.x*this.x)+(this.y*this.y));
    }
    public double distance(Point p){
        return Math.sqrt(((this.x-p.x)*(this.x-p.x))+((this.y-p.y)*(this.y-p.y)));
    }
    public double distance(int a,int b){
        return Math.sqrt(((this.x-a)*(this.x-a))+((this.y-b)*(this.y-b)));
    }
}
