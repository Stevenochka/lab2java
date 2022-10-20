import java.util.Scanner;

public class lab2 {
    public static void main(String[] args){

        Point3d[] points = new Point3d[3];
        double[] coords = new double[3];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){
                char coord;
                if      (j == 0)    coord = 'x';
                else if (j == 1)    coord = 'y';
                else                coord = 'z';
                System.out.print("Введите координату " + coord + " точки " + (i + 1) + ": ");
                coords[j] = scanner.nextDouble();
            }
            points[i] = new Point3d(coords[0], coords[1], coords[2]);
        }
        if(points[0].compare(points[1]) || points[0].compare(points[2]) || points[1].compare(points[2])) {
            System.out.println("Одна из точек совпадает с другой!");
            return;
        }

        double area = computeArea(points[0], points[1], points[2]);
        if(area == 0){
            System.out.println("Точки лежат на одной прямой!");
            return;
        }
        System.out.println("Площадь треугольника: " + area);
    }

    public static double computeArea(Point3d point1, Point3d point2, Point3d point3){
        double a = point1.distanceTo(point2);
        double b = point1.distanceTo(point3);
        double c = point2.distanceTo(point3);
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}