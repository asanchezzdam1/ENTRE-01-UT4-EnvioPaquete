import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Aimar Sanchez
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        dimension = new Dimension(40, 30, 50);
        peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        dimension = new Dimension(alto, ancho, largo);
        generador = new Random();
        peso = 2 + generador.nextInt(7);
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        this.peso = peso;
        this.dimension = dimension;
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double calcularVolumen() {
        double bolumenaKalkulatu = dimension.getAlto() * dimension.getLargo() * dimension.getAncho();
        return bolumenaKalkulatu;
    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double calcularPesoVolumetrico() {
        double calcularPesoVolumetrico = calcularVolumen() / 5000;
        return calcularPesoVolumetrico;
    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        double quePesoVolumetrico = calcularPesoVolumetrico();
        if(quePesoVolumetrico > peso){
            return quePesoVolumetrico;
        }
        else {
            return peso;
        }
    }

    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete obtenerCopia() {
        Paquete kopia = new Paquete(dimension, peso);
        return kopia;
    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        String aux ="";
        aux += String.format("%20s", "Descripcion del paquete: " + "\n");
        aux += String.format("%20s", "-------------------------" + "\n");
        aux += String.format("%20s%10.2f%10s", "El Alto es: ",dimension.getAlto(), "(cm)"+ "\n" );
        aux += String.format("%20s%10.2f%10s", "El Ancho es: ",dimension.getAncho(),"(cm)" + "\n");
        aux += String.format("%20s%10.2f%10s","El Largo es: ",dimension.getLargo(),"(cm)" + "\n");
        aux += String.format("%20s%10.2f%10s", "El Peso real es: ",peso,  "(kg)"+ "\n" );
        aux += String.format("%20s%10.2f%10s", "El Volumen es: ",calcularVolumen(),"(cm3)" + "\n");
        aux += String.format("%20s%10.2f%10s","El Peso volumetrico es: ",calcularPesoVolumetrico(),"(kg)");
        return aux;
    }

    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

}
