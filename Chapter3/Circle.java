class Circle {
    double radius, diameter, area;

    public Circle() {
        radius = 1;
        diameter = radius * 2;
        area = Math.PI * (radius * radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
        diameter = radius * 2; 
        area = Math.PI * (radius * radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public double getArea() {
        return area;
    }
}