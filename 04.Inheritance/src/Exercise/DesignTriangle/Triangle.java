package Exercise.DesignTriangle;

public class Triangle extends Shape {
    public float size1 = 1f;
    public float size2 = 1f;
    public float size3 = 1f;

    public Triangle(){

    }

    public Triangle(float size1, float size2, float size3){
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public double getArea(){
        double p = (size1 + size2 + size3)/2;
        return Math.sqrt((p * ( p - size1 ) * ( p - size2 ) * ( p - size3 ) ));
    }

    public double getPrimeter(){
        return size1 + size2 + size3;
    }

    @Override
    public String toString() {
        return "A triangle with size1 = " + this.size1 + " size 2 = " + this.size2 + " size3 = " + this.size3
                + " for " + super.toString();
    }
}

