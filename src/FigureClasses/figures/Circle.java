package FigureClasses.figures;

class Circle extends Figure {
    private String radius;

    public Circle(String kind, String space, String color, String radius) {
        super(kind, space, color);
        this.radius = radius;
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Фигура: " + getKind() +
                " , площадь: " + getSpace() +
                " кв. ед., радиус: " + radius +
                " ед., цвет: " + getColor();
    }
}
