package FigureClasses.figures;

class Figure {

    private String kind;
    private String space;
    private String color;

    public Figure(String kind, String space, String color) {
        this.kind = kind;
        this.space = space;
        this.color = color;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setSpace(String space) {
        this.space = space;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public String getSpace() {
        return space;
    }

    public String getColor() {
        return color;
    }

}
