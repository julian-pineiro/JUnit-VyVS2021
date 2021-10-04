public class Auto {
    private int tanque;
    private int nafta;
    private int velocidad;

    public Auto(int tanque){
        this.tanque = tanque;
        this.nafta = tanque;
        this.velocidad = 0;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int acelerar(int i){
        System.out.println("Acelerando "+ i + " Km/h");
        return velocidad += i;
    }

    public void llenarTanque(){
        nafta = tanque;
    }

    public int getTanque(){
        return tanque;
    }

    public int getNafta(){
        return nafta;
    }

    public void consumir(int i){
        if (nafta>i) {
            nafta -= i;
            System.out.println("Quedan "+ nafta + " Litros");

        }else{
            System.out.println("Se agotó el tanque.");
            nafta=0;
        }
    }
}
