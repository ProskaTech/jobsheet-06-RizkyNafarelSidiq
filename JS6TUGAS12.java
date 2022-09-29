/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js6.tugas1.pkg2;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */

import javax.swing.JOptionPane;

public class JS6TUGAS12 {
    public static void main(String[] args) {
        int angka1;
        int angka2;
        int angka3;

 
    angka1= Integer.parseInt (JOptionPane.showInputDialog("masukan angka1:"));
    angka2= Integer.parseInt(JOptionPane.showInputDialog("masukan angka2:"));
    angka3= Integer.parseInt(JOptionPane.showInputDialog("masukan angka3:"));
    double hasil=(angka1+angka2+angka3)/3;
    
  
     if(hasil>=60)
     {
         JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah = \n"+ hasil +" :-)");
     }
     else
        {
            JOptionPane.showMessageDialog(null,"Rata-Rata Anda Adalah = \n"+ hasil +" :-)");
            
            
        }
    }
    
}
