/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package js6tugas2;

/**
 *
 * // Created Rizky Nafarel Sidiq 21343071
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JS6TUGAS2 {
    public static void main(String[] args) {
        BufferedReader dataIn =new BufferedReader (new InputStreamReader (System.in));

        String angka="";

System.out.println("Masukkan angka dari 1-10");

try {
angka = dataIn.readLine();
}
catch
(IOException e){
System.out.println("invalid number!");
}
int i = Integer.parseInt(angka);

if (i == 1){
System.out.println("satu");
}
else if (i == 2){
System.out.println("dua");
}
else if (i == 3){
System.out.println("tiga");
}
else if (i == 4){
System.out.println("empat");
}
else if (i == 5){
System.out.println("lima");
}
else if (i == 6){
System.out.println("enam");
}
else if (i == 7){
System.out.println("tujuh");
}
else if (i == 8){
System.out.println("delapan");
}
else if (i == 9){
System.out.println("sembilan");
}
else if (i == 10){
System.out.println("sepuluh");
}
else {
System.out.println("Invalid number!");
}
}
        
        
    }
