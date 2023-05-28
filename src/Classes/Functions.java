
package Classes;

import javax.swing.JOptionPane;

public class Functions {
    
    public boolean checkWorkers(int chasis, int carroceria, int motor, int ruedas, int accesorios, int max, int ensamblador){
        int suma = chasis + carroceria + motor + ruedas + accesorios + ensamblador;
        if (suma == max) {
            JOptionPane.showMessageDialog(null, "no puede haber mas de "+max+" trabajadores");
            return false;
        }
        return true;
    };
    
}
