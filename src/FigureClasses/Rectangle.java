package FigureClasses;

class Rectangle extends Figure {

    private String hypotenuse;

    public Rectangle(String kind, String space, String color, String hypotenuse) {
        super(kind, space, color);
        this.hypotenuse = hypotenuse;
    }

    public String getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(String hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    public String toString() {
        return "Фигура: " + getKind() +
                ", площадь: " + getSpace() +
                " кв. ед., гипотенуза: " + hypotenuse +
                " ед., цвет: " + getColor();
    }
}
