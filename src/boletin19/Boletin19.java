
package boletin19;

import javax.swing.JOptionPane;

/**
 * 
 * @author Pablite5
 * 
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Buzon b = new Buzon();
       String repetir;
       do{
           switch(Integer.parseInt(JOptionPane.showInputDialog("Elige la opción : \n1. Engade \n2.Numero de correos \n3. ¿Alguno sin leer? \n4.Muestra el primero sin leer \n5.Ver si un correo está sin leer \n6.Eliminar"))){
               case 1: b.engade(new Correo(JOptionPane.showInputDialog("El correo del lokamen es :")));
                   break;
               case 2: JOptionPane.showInternalMessageDialog(null, b.numeroDeCorreos());
                   break;
               case 3: JOptionPane.showMessageDialog(null, b.porLer());
                   break;
               case 4: JOptionPane.showMessageDialog(null, b.amosarPrimeiroNonLeido());
                   break;
               case 5: JOptionPane.showMessageDialog(null, b.amosa(Integer.parseInt(JOptionPane.showInputDialog("Inserte numero del correo:"))));
                   break;
               case 6: b.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Eliminar")));
               JOptionPane.showMessageDialog(null, "Borrado");
               break;
           }
       repetir= JOptionPane.showInputDialog("¿Desea repetir algo?");
       }while(repetir.equalsIgnoreCase("si"));
         }
    
}

















