public class Box {
    private double width;
    private double height;
    private double depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    void type() {
        if (width == height && width == depth) {
            System.out.println("Куб");
        } else if ((width == 0 && height != 0 && depth != 0) ||
                  (width != 0 && height == 0 && depth != 0) ||
                  (width != 0 && height != 0 && depth == 0)) {
            System.out.println("Конверт");
        } else if (width != 0 && height != 0 && depth != 0) {
            System.out.println("Обычная коробка");
        } else {
            System.out.println("Введены некорpектные размеры");
        }
    }

    public static void main(String[] args) {
        Box mybox1 = new Box(0, 0, 5);
        Box mybox2 = new Box(0, 5, 2);
        Box mybox3 = new Box(1, 5, 0);
        mybox1.type();
        mybox2.type();
        mybox3.type();
    }
}




