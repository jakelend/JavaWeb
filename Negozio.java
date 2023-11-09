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
         System.out.println("2 Per modificare un Giocattolo");
         System.out.println("3 Per eliminare un Giocattolo");
         System.out.println("4 Per stampare tutti i Giocattoli");
         System.out.println("5 Exit");
         System.out.print("Scelta: ");
         scelta = input.nextInt();

         // Controllo della scelta del cliente 
         if (scelta == 1) 
         {
            // Richiedo di inseire il nome prezzo eta consigliata quantita
            System.out.print("Inserire il nome del giocattolo: ");    
            String nome = input.next();
            System.out.print("Inserire l'eta' consigliata del giocattolo: ");
            int eta = input.nextInt();
            // Richiedo il costo del giocattolo 
            System.out.print("Costo del giocattolo: ");
            double prezzo = input.nextDouble();
            System.out.print("Numero di giocattoli comprati: ");
            int quantita = input.nextInt();

            // Alloco l'oggetto e lo inserisco 
            Giocattolo g = new Giocattolo(nome, prezzo, eta, quantita);
            inventario.addGiocattolo(g);
         }
         else if (scelta == 2) 
         {
            // Richiedo di inseire il nome prezzo eta consigliata quantita
            System.out.print("Inserire il nome del giocattolo: ");    
            String nome = input.next();
            System.out.print("Inserire l'eta' consigliata del giocattolo: ");
            int eta = input.nextInt();
            // Richiedo il costo del giocattolo 
            System.out.print("Costo del giocattolo: ");
            double prezzo = input.nextDouble();

            // Richiedo di inseire il nome prezzo eta consigliata quantita
            System.out.print("Inserire il nome del giocattolo: ");    
            String nomeN = input.next();
            System.out.print("Inserire l'eta' consigliata del giocattolo: ");
            int etaN = input.nextInt();
            // Richiedo il costo del giocattolo 
            System.out.print("Costo del giocattolo: ");
            double prezzoN = input.nextDouble();
  
            inventario.modificaGiocattolo(nome, prezzo, eta, nomeN, prezzoN, etaN);
         }
         else if(scelta == 3)
         {
            // Richiedo di inseire il nome prezzo eta consigliata quantita
            System.out.print("Inserire il nome del giocattolo: ");    
            String nome = input.next();
            System.out.print("Inserire l'eta' consigliata del giocattolo: ");
            int eta = input.nextInt();
            // Richiedo il costo del giocattolo 
            System.out.print("Costo del giocattolo: ");
            double prezzo = input.nextDouble();
  
            inventario.eliminaGiocattolo(nome, prezzo, eta);
         }
         else if(scelta == 4)
         {
            inventario.stampaInvetario();
         }
      } while (scelta != 5);
   }
}
