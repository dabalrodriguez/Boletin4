
package boletin04;


public class Boletin04 {

    
    public static void main(String[] args) {
        
        //Instancio obxeto tipo Semaforo
        Semaforo semaforo1= new Semaforo();
        String valor = semaforo1.dameCor();
        semaforo1.ponCor("verde");
        System.out.println("A cor é: "+ semaforo1.dameCor());
        
       
        
        
    }
    
}
