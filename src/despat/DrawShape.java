package despat;

public class DrawShape {

    private Shape shape;

    public void setShape(Shape shape){
        this.shape= shape;
    }

    public String drawshape(Shape shape){
       return this.shape.drawshape();
    }
}
