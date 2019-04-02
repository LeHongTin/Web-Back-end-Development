package Exercise.MoveablePoint;

public class Point {
    public float x = 0.0f;
    public float y = 0.0f;

    public Point(){
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY(){
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    public void setXY(float x, float y ){
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "A Point with x = " + this.x + " y = " + this.y;
    }
}
