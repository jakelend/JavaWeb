import java.util.Scanner;

public class Negozio 
{
   public static void main(String[] args) 
   {
      // Scanner 
      Scanner input = new Scanner(System.in);

      // Creazione del cliente 
      Cliente c1 = new Cliente("Luca", "luca@gmail.com");

      // Creazione di un ogetto 
      Giocattolo g1 = new Giocattolo("Nerf pistola", 30.40, 4, 2);

      // Creazione dell'inventario 
      Inventario inventario = new Inventario();

      // Variabile per la scelta delle opzioni 
      int scelta = 0;
      do {
         System.out.println();
         System.out.println("Menu'");
         System.out.println("1 Per inserire un Giocattolo");
         System.out.println("2 Per modificare un ogetto");
         System.out.println("3 Per eliminare un ogetto");
         System.out.println("4 Per effettuare una vendita");
         System.out.println("5 Exit");
         System.out.print("Scelta: ");
         scelta = input.nextInt();

         
         
      } while (scelta != 5);
   }
}
