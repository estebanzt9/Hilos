package javaapplication2;
public class JavaApplication2 {

  public static void main(String[] args) {
  
         musica hilo2 = new musica();
         proceso2 hilo1 =new proceso2();
          
         hilo1.start();
         hilo2.start();
      
    }
    
}
