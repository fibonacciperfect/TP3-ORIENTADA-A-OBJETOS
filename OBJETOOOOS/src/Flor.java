public class Flor {
    private String actitud;
    private String apariencia;
    private String estado;
    private int orugas;


    public Flor() 
    {

    }

    public Flor(String actitud, String apariencia, String estado, int orugas) 
    {
        this.actitud = actitud;
        this.apariencia = apariencia;
        this.estado = estado;
        this.orugas = orugas;
    }

    public static void agradecer() // metodo, el cual es un comportamiento de mi clase flor
    {

    }

    public String getActitud() //obtiene (lee) el valor de un atributo, es el def de un string
    {
        return actitud;
    }
    
  
    public void setActitud(String actitud)//es un método que se usa para asignar o modificar el valor de un atributo de forma controlada
    {
        this.actitud = actitud;
    }

    public String getApariencia() 
    {
        return apariencia;
    }

    public void setApariencia(String apariencia) 
    {
        this.apariencia = apariencia;
    }

    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public int getOrugas() {
        return orugas;
    }

    public void setOrugas(int orugas) {
        this.orugas = orugas;
    }    
}