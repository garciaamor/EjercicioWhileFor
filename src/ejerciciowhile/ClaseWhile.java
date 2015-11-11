package ejerciciowhile;

import javax.swing.JOptionPane;

public class ClaseWhile {
     
      
     
         public static float PonerNota1(){
        String res= JOptionPane.showInputDialog("Introduce la nota : ");
        float nota1= Float.parseFloat(res);
        return nota1;    
    }    
          
     public static void CalNotaMedia(){
         int i=0;
         float nota1;
         float nota2;
         float nota3;
         
         while (i<5){
             nota1=ClaseWhile.PonerNota1();
             nota2=ClaseWhile.PonerNota1();
             nota3=ClaseWhile.PonerNota1();
             JOptionPane.showMessageDialog(null, "La nota media del alumno es " + (nota1+nota2+nota3)/3);
             i++;
         }
     }
}