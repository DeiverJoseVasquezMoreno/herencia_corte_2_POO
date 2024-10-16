public class Main {
    public static void main(String[] args) {
        ClaseHija hija = new ClaseHija();
        hija.protegido();

        Animal animal = new Gato();
        animal.hacerSonido();

        Vehiculo v = new Avion(); // Polimorfismo
        v.mover();
    }
}
