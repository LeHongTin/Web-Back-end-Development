package Exercise.Point2dAndPoint3d;

public class Point3D extends Point2D {
    public float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ(){
        float[] array = new float[3];
        array[0] = x;
        array[1] = y;
        array[2] = z;
        return array;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "A point3D with z = " + this.z + " for " + super.toString() ;
    }
}
