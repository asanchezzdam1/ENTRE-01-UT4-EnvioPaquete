
/**
 * Write a description of class TestEnvio here.
 * 
 * @author - Aimar Sanchez
 * @version (a version number or a date)
 */
public class TestEnvio
{
    /**
     * Main para hacer pruebas
     */
    public static void main(String[] args){
        //Creacion de paquetes
        Paquete paquete1 = new Paquete();
        Paquete paquete2 = new Paquete(40,60,40);
        //creacion de envio
        Envio envio = new Envio();
        //Añadir paquetes
        envio.addPaquete(paquete1);
        envio.addPaquete(paquete2);
        //muestra el envio
        envio.print();
        //Se crea la dimension del paquete 3
        Dimension dimension = new Dimension(50,50,70);
        Paquete paquete3 = new Paquete(dimension,13);
        //Se añade el paquete 3 al envio
        envio.addPaquete(paquete3);
        //Se muestra el envio
        envio.print();
        //Se crea la clonacion del paquete 2 y se añade al envio
        envio.addPaquete(paquete2.obtenerCopia());
        
    }
}
