// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Gatto gatto = new Gatto();
    Animale animale = new Animale();
    Siamese siamese = new Siamese("palla",2,"Bianco");

    animale.faiIlVerso();
    gatto.faiIlVerso();
    System.out.println(siamese.getColore());
    }
}