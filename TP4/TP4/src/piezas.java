public abstract class piezas 
{
    private String color;
    private String velocidad;
    private String comportamiento;
    private String movimiento;
//----------------------------------------------------------------------------------------------------------
    public piezas()
    {

    }
//----------------------------------------------------------------------------------------------------------
    public piezas(String color, String velocidad, String comportamiento, String movimiento) {
        this.color = color;
        this.velocidad = velocidad;
        this.comportamiento = comportamiento;
        this.movimiento = movimiento;
    }
//----------------------------------------------------------------------------------------------------------
    public abstract void mover();
//----------------------------------------------------------------------------------------------------------
    public String getColor() {
        return color;
    }
//----------------------------------------------------------------------------------------------------------
    public void setColor(String color) {
        this.color = color;
    }
//----------------------------------------------------------------------------------------------------------
    public String getVelocidad() {
        return velocidad;
    }
//----------------------------------------------------------------------------------------------------------
    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
//----------------------------------------------------------------------------------------------------------
    public String getComportamiento() {
        return comportamiento;
    }
//----------------------------------------------------------------------------------------------------------
    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
//----------------------------------------------------------------------------------------------------------
    public String getMovimiento() {
        return movimiento;
    }
//----------------------------------------------------------------------------------------------------------
    public void setMovimiento(String movimiento) {
        this.movimiento = movimiento;
    }

    // En piezas.java o Main.java
    public static void imprimirPiezas(piezas[] arreglo) {
        int cont = 1;
        for (piezas p : arreglo) {
            if (p != null) {
                System.out.println(cont + ". " + p.toString());
                cont++;
            }
        }
        System.out.println("----------------------------------------------");
}

    @Override
    public String toString() {
        return getClass().getSimpleName() + " " + getColor() + 
            " (Velocidad: " + getVelocidad() + 
            ", Comportamiento: " + getComportamiento() + 
            ", Movimiento: " + getMovimiento() + ")";
}
//----------------------------------------------------------------------------------------------------------
}
// las clases abstract no pueden ser instanciadas, es decir, no se puede crear un objeto de una clase abstracta.
// no puede tener implementaciones de metodos.