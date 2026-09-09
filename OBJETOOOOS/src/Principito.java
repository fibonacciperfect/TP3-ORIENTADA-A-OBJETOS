public class Principito {
    private Flor florprincipito;
    public static void cuidar()
    {

    }
    public static void regar()
    {

    }
    public static void quitar()
    {

    }
    public static void explorar()
    {

    }
    public static void amar()
    {

    }

    public void ImprimirFlor (Flor florprincipito)
    {
        System.out.println("Actitud: " + florprincipito.getActitud());
        System.out.println("Apariencia: " + florprincipito.getApariencia());
        System.out.println("Estado: " + florprincipito.getEstado());
        System.out.println("Orugas: " + florprincipito.getOrugas());
    }


    public Flor getFlorprincipito() {
        return florprincipito;
    }
    public void setFlorprincipito(Flor florprincipito) {
        this.florprincipito = florprincipito;
    }
}
