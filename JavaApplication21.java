/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;
import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
/**
/**
 *
 * @author Lenovo
 */
public class JavaApplication21 {

    
    public static int XOR1(int a, int b) {
       
       return((a & ~b) | (~a & b));
    }
    public static int  XOR2(int a, int b) {
       
     return(~(~a&~(a&b))&~(b&~(a&b)));
    }
    public static int XOR3(int a, int b) {
       
       return((a | b) & ~(b & a));
    }
    public static int XOR4(int a, int b) {
       
      return((~a | ~b) & (a | b));
    }
       
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
    // int a=10;
    // int b=20;
    int a=Integer.parseInt(args[0]); 
    int b=Integer.parseInt(args[1]); 
    XOR1(a,b);
    int x1= XOR1(a,b);
     int x2 =XOR2(a,b);
    int x3= XOR3(a,b);
     int x4= XOR4(a,b);
     FileOutputStream fos = new FileOutputStream("atsakymas.csv");
     PrintWriter pw = new PrintWriter(fos);
     StringBuilder sb = new StringBuilder();
   pw.println("Vardas Pavarde Grupe , Pradiniai duomenys , Naudotos logines sekos, Gauti rezultatai atlikus operacijas ");
    pw.println("Karol Ravdo ISF18/2" + "," + a + " " + b + "," + " NOT AND OR " + "," +  x1 );
    pw.println("Karol Ravdo ISF18/2" + "," + a + " " + b + "," + " NAND " + "," +  x2 );
    pw.println("Karol Ravdo ISF18/2" + "," + a + " " + b + "," + " NOT AND OR " + "," +  x3 );
    pw.println("Karol Ravdo ISF18/2" + "," + a + " " + b + "," + " NOT AND OR " + "," +  x4 );

     pw.close();
    System.out.println("file written do csv file");
    
}
}
