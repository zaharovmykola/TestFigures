package FigureClasses;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

class FormingFiguresMap {

    static void formingArrayOfFigures () {
        int i = 0;
        double vitalCharacteristicOfFigure;
        int figuresCounter = ( new Random().nextInt(10) + 1 );

        Map<Integer, String> nameFigure = new LinkedHashMap<>();
        nameFigure.put(1, "квадрат");
        nameFigure.put(2, "треугольник");
        nameFigure.put(3, "круг");
        nameFigure.put(4, "трапеция");

        Map<Integer, String> colorFigure = new LinkedHashMap<>();
        colorFigure.put(1, "синий");
        colorFigure.put(2, "желтый");
        colorFigure.put(3, "красный");
        colorFigure.put(4, "черный");

        Map <Integer, Figure> figures = new LinkedHashMap<>();

        do {
            vitalCharacteristicOfFigure = Math.ceil((2.25 + (15.5 - 2.25)*(new Random().nextDouble()))*(Math.pow(10,2)))/(Math.pow(10,2));
            Figure figure = new Figure(nameFigure.get(( new Random().nextInt(4) + 1 )), colorFigure.get(( new Random().nextInt(4) + 1 )));

            switch (figure.getKind()) {
                case "квадрат":
                    figure.setSpace(Double.toString(Math.ceil((vitalCharacteristicOfFigure * vitalCharacteristicOfFigure) * (Math.pow(10, 2))) / (Math.pow(10, 2))));
                    Square square = new Square(figure.getKind(), figure.getSpace(), figure.getColor(), Double.toString(vitalCharacteristicOfFigure));
                    figures.put(i, square);
                    break;
                case "треугольник":
                    figure.setSpace(Double.toString((Math.ceil((vitalCharacteristicOfFigure * 3.5) * (Math.pow(10, 2))) / (Math.pow(10, 2)))));
                    Rectangle rectangle = new Rectangle(figure.getKind(), figure.getSpace(), figure.getColor(), Double.toString(vitalCharacteristicOfFigure));
                    figures.put(i, rectangle);
                    break;
                case "круг":
                    figure.setSpace(Double.toString((Math.ceil((3.14 * vitalCharacteristicOfFigure * vitalCharacteristicOfFigure) * (Math.pow(10, 2))) / (Math.pow(10, 2)))));
                    Circle circle = new Circle(figure.getKind(), figure.getSpace(), figure.getColor(), Double.toString(vitalCharacteristicOfFigure));
                    figures.put(i, circle);
                    break;
                case "трапеция":
                    figure.setSpace(Double.toString((Math.ceil((vitalCharacteristicOfFigure * vitalCharacteristicOfFigure * 1.5) * (Math.pow(10, 2))) / (Math.pow(10, 2)))));
                    Trapeze trapeze = new Trapeze(figure.getKind(), figure.getSpace(), figure.getColor(), Double.toString(vitalCharacteristicOfFigure));
                    figures.put(i, trapeze);
                    break;
            }
            i++;
        } while (i < figuresCounter);

        FigureClasses.PrintingManager.printingResults(figures);
    }
}