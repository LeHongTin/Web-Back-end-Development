package Exercise.MoveablePoint;

public class MoveablePoint extends Point {
    public float xSpeed = 0f;
    public float ySpeed = 0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(){}

    public MoveablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed(){
        float[] array = new float[2];
        array[0] = xSpeed;
        array[1] = ySpeed;
        return array;
    }

    public void setSpeed(float xSpeed, float ySpeed){
    this.xSpeed = xSpeed;
    this.ySpeed = ySpeed;
    }
    @Override
    public String toString() {
        return "A point ( " + this.x + " , " + this.y + " ), Speed = ( " + this.xSpeed + " , " + this.ySpeed + ")";
    }
    public MoveablePoint move(){
        x += xSpeed;
        y += xSpeed;
        return this;
    }


}
