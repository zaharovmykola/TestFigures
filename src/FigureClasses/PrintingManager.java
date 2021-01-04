package FigureClasses;

import java.util.Map;

class PrintingManager {

    static void printingResults (Map<Integer, Figure> figures) {
        figures.forEach((key, value) -> System.out.println(value));
    }
}
