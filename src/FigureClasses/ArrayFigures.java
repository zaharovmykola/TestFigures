package FigureClasses;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

class ArrayFigures {
    static void formingArrayOfFigures () {
        int i = 0;
        int coounter = 0;
        int typeFigure;
        double vitalCharacteristicOfFigure;
        int figuresCounter = ( new Random().nextInt(10) + 1 );

        Map<Integer, String> nameFigure = new LinkedHashMap<>();
        nameFigure.put(1, "квадрат, ");
        nameFigure.put(2, "треугольник, ");
        nameFigure.put(3, "круг, ");
        nameFigure.put(4, "трапеция, ");

        Map<Integer, String> colorFigure = new LinkedHashMap<>();
        colorFigure.put(1, "цвет: синий");
        colorFigure.put(2, "цвет: желтый");
        colorFigure.put(3, "цвет: красный");
        colorFigure.put(4, "цвет: черный");

        String [][] figures = new String[figuresCounter][4];

        do {
            vitalCharacteristicOfFigure = Math.ceil((2.25 + (15.5 - 2.25)*(new Random().nextDouble()))*(Math.pow(10,2)))/(Math.pow(10,2));
            typeFigure = ( new Random().nextInt(4) + 1 );
            figures[i][0] = nameFigure.get(typeFigure);
            if (typeFigure == 1) {
                figures[i][1] = "площадь: " + (Math.ceil((vitalCharacteristicOfFigure*vitalCharacteristicOfFigure)*(Math.pow(10,2)))/(Math.pow(10,2))) + " кв. ед., ";
                figures[i][2] = "длина стороны: " + vitalCharacteristicOfFigure + " ед., ";
            } else if (typeFigure == 2) {
                figures[i][1] = "площадь: " + (Math.ceil((vitalCharacteristicOfFigure*3.5)*(Math.pow(10,2)))/(Math.pow(10,2))) + " кв. ед., ";
                figures[i][2] = "гипотенуза: " + vitalCharacteristicOfFigure + " ед., ";
            } else if (typeFigure == 3) {
                figures[i][1] = "площадь: " + (Math.ceil((3.14*vitalCharacteristicOfFigure*vitalCharacteristicOfFigure)*(Math.pow(10,2)))/(Math.pow(10,2))) + " кв. ед., ";
                figures[i][2] = "радиус: " + vitalCharacteristicOfFigure + " ед., ";
            } else if (typeFigure == 4) {
                figures[i][1] = "площадь: " + (Math.ceil((vitalCharacteristicOfFigure*vitalCharacteristicOfFigure*1.5)*(Math.pow(10,2)))/(Math.pow(10,2))) + " кв. ед., ";
                figures[i][2] = "высота: " + vitalCharacteristicOfFigure + " ед., ";
            }
            figures[i][3] = colorFigure.get( ( new Random().nextInt(4) + 1 ) );
            i++;
            coounter++;
        } while (coounter < figuresCounter);

        FigureClasses.PrintingManager.printingResults(figures);
    }
}
