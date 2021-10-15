package se.jonas;

public class Matratt {

    private String namn;
    private String pris;
    private String typ;
    private String kcal;
    private String menyVal;

    public Matratt(String namn, String pris, String typ, String kcal) {
        super();

        setnamn(namn);
        setpris(pris);
        settyp(typ);
        setkcal(kcal);

    }

    public void setnamn(String namn) {
        this.namn = namn;

    }

    public void setpris(String pris){
        this.pris = pris;
    }

    public void settyp(String typ){
        this.typ = typ;
    }

    public void setkcal(String kcal){
        this.kcal=kcal;
    }
    

    public String getMatratt() {
        sattIhopMeny();
        return menyVal;
    }

    public void sattIhopMeny(){
        menyVal ="--------" + "\n" + namn + ": " + pris + " SEK" + 
        "\n" + typ + "\n" +
        kcal + " kcal" + 
        "\n" + "--------";
    }

}
