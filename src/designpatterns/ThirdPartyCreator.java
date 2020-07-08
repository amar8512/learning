package designpatterns;

public class ThirdPartyCreator {

    public static Shape createInstances(String shapeType){
        Shape shape =null;
        switch(shapeType){
        case "Rectangle":
             shape  = new Rectangle();
            break;
        case "Triangle":
            shape = new Circle();
            break;
        default:
            System.out.println("Please pass correct instances");
            break;
        }
    return shape;
    }

}
