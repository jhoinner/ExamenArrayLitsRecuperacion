
package examenarraylitsrecuperacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JhoinnerConstanteBallestas
 */
public class ExamenArrayLitsRecuperacion {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner l = new Scanner(System.in);
        ArrayList<String> nomb = new ArrayList<String>();
        ArrayList<Float> tiempo = new ArrayList<Float>();
        ArrayList<Float> velocidad = new ArrayList<Float>();
        int mejor=0,op = 1;
        float vac=0;
        
        while (op != 0){
            System.out.println("ingrese nombre del estudiante");
            nomb.add(l.next());
            System.out.println("Ingrese la velocidad del estudiant");
            op = l.nextInt();
            if(op != 0){
                velocidad.add((float)op);
                tiempo.add(100 / velocidad.get(velocidad.size()-1));
                vac = vac + tiempo.get(velocidad.size()-1);
            }
        }
        vac = vac / tiempo.size();
        
       
        
    }
    
}
