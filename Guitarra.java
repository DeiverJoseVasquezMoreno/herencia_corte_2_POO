public class Guitarra extends Instrumento implements Afinable {
    @Override
    public void tocar() {
        System.out.println("La guitarra está tocando.");
    }

    @Override
    public void afinar() {
        System.out.println("La guitarra está siendo afinada.");
    }
}
