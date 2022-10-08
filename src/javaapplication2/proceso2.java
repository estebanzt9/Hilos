package javaapplication2;
import static java.lang.Thread.sleep;
import java.util.Scanner;
public class proceso2 extends Thread {

 Scanner dato = new Scanner(System.in);
 String nombre;
 
    
@Override
	public void run(){
                
 System.out.println("Ingrese el nombre del atleta :");
 nombre = dato.next();
 for(int c=1;c<=30;c++){
 System.out.print(c + " km ");
 }
 try{
 sleep(5500); 
 }catch(InterruptedException e){
 }
 System.out.println("\n Llego a la meta " + nombre );
 }    
}

