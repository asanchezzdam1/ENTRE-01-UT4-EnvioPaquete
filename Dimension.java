
/**
 *  Representa una dimensión
 *  
 *  @author - Aimar Sanchez
 */
public class Dimension  
{
    private double alto;
    private double ancho;
    private double largo;

    /**
     * constructor  
     */
    public Dimension(double alto, double ancho, double largo)    {
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;

    }   

    /**
     * accesor para  el alto
     */
    public double getAlto()    {
        return alto;
    }

    /**
     * accesor para  el ancho
     */
    public double getAncho()    {
        return ancho;
    }

    /**
     * accesor para  el largo
     */
    public double getLargo()    {
        return largo;
    }

    /**
     * Devuelve una copia exacta al objeto actual
     */
    public Dimension obtenerCopia() {
        return new Dimension(alto, ancho, largo);
    }

    /**
     * Repesentación textual de la dimensión
     * (leer enunciado)
     */
    public String toString() {
        // Muestra el alto del paquete
        String alt = String.format("%20s%10.2f%s", "El Alto es: ", alto, "cm \n");
        // Muestra el ancho del paquete
        String anc = String.format("%20s%10.2f%s", "El Ancho es: ", ancho, "cm \n");
        // Muestra el lago del paquete
        String lar = String.format("%20s%10.2f%s", "El Largo es: ", largo, "cm \n");
        String todo = alt + anc + lar;
        return todo;

    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Dimension
     */
    public void print() {
        System.out.println(this.toString());
    }

    
}
