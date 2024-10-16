// class Animal {
//     protected String sonido = "Sonido de animal";

//     public void hacerSonido() {
//         System.out.println(sonido);
//     }
// }

public class Gato extends Animal {
    public Gato() {
        super.sonido = "Miau";
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato maúlla.");
    }
}
