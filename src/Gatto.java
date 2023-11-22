public class Gatto extends Animale{
    private String colore;
    public Gatto(){}
    public Gatto(String nome, Integer eta ,String colore) {
        super(nome, eta);
        this.colore = colore;
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    @Override
    public void faiIlVerso(){
        System.out.println("Miao");
    }
}
