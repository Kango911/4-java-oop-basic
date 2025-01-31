package com.example.task05;
/**
 * Точка в двумерном пространстве
 */
public class Point {

    private final double x;
    private final double y;

    /**
     * Конструктор, инициализирующий координаты точки
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public Point(double x, double y) {
        this.x  = x;
        this.y = y;
    }

    /**
     @@ -21,8 +25,7 @@ public Point(double x, double y) {
      * @return координату точки по оси X
     */
    public double getX() {
        return this.x;
    }

    /**
     @@ -31,8 +34,7 @@ public double getX() {
      * @return координату точки по оси Y
     */
    public double getY() {
        return this.y;
    }

    /**
     @@ -42,8 +44,8 @@ public double getY() {
      * @return расстояние от текущей точки до переданной
     */
    public double getLength(Point point) {
        return Math.sqrt(Math.pow((this.x - point.x), 2) +
                Math.pow((this.y - point.y),2));
    }
}