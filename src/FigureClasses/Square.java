package FigureClasses;

class Square extends Figure {

    private String side;

    public Square(String kind, String space, String color, String side) {
        super(kind, space, color);
        this.side = side;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Фигура: " + getKind() +
                ", площадь: " + getSpace() +
                " кв. ед., длина стороны: " + side +
                " ед., цвет: " + getColor();
    }
}
