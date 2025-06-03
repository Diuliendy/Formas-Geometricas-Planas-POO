public class FiguraGeometricaPlana {
    protected double area;

    public void calcArea() {
        // Deve ser sobrescrito nas subclasses
    }

    public double mostraAreaComRetorno() {
        return this.area;
    }

    public double getArea() {
        return area;
    }
}