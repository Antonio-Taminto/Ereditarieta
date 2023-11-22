public class Animale {
    private String nome;

    private Integer eta;

    public Animale(){

    }
    public Animale(String nome,Integer eta){
        this.nome = nome;
        this.eta = eta;


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getEta() {
        return eta;
    }

    public void setEta(Integer eta) {
        this.eta = eta;
    }


    public void faiIlVerso(){
    System.out.println("Verso generico");
    }
}
