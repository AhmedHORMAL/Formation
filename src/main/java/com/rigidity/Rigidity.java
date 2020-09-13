package com.rigidity;

public class Rigidity {
    public static void main(String[] args) throws Exception {
        Rectangle rectangle=new Rectangle(3,3);
        Shape[] shapes={rectangle};
        ShapeHelper.reportShapesSize(shapes);
    }
}

class ShapeHelper {
    private static double getShapeArea(Shape shape) throws Exception {
        if (shape instanceof Rectangle) {
            return ((Rectangle) shape).getHeight() * ((Rectangle) shape).getWeight();
        }

        throw new Exception("Not supported shape");
    }

    public static void reportShapesSize(Shape[] shapes) throws Exception {
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                double area = getShapeArea(shape);
                System.out.println("com.rigidity.Rectangle's area is" + area);
            }
        }
    }
}

class Shape {
}

class Rectangle extends Shape {
    private double height;
    private double weight;

    public Rectangle(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
