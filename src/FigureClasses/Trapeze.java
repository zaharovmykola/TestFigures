package FigureClasses;

class Trapeze extends Figure {

    private String height;

    public Trapeze(String kind, String space, String color, String height) {
        super(kind, space, color);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Фигура: " + getKind() +
                ", площадь: " + getSpace() +
                " кв. ед., высота: " + height +
                " ед., цвет: " + getColor();
    }
}
