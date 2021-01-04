package FigureClasses;

class PrintingManager {

    static void printingResults (String [][] figures) {
        for (int k = 0; k < figures.length ; k++) {
            System.out.println("Фигура: " + figures[k][0] + figures[k][1] + figures[k][2] + figures[k][3]);
        }
    }
}
