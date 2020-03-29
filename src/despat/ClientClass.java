package despat;

public class ClientClass {
    static   String shapeName;
    static  DrawShape drawShape;
    public static void main(String[] args) {
        shapeName ="Rectangle";
        drawShape = new DrawShape();
       Shape shape = ThirdPartyCreator.createInstances(shapeName);
       drawShape.setShape(shape);
        System.out.println(" "+drawShape.drawshape(shape));
    }
}
