// Importo la classe per utilizzare L'arrayList per la gestione dei Giocattoli 
import java.util.ArrayList;
import java.util.List;

public class Inventario 
{
   // Lista di giocattoli da memorizzare all'interno del programma 
   List<Giocattolo> vetGiocattoli;

   // Alloco l'arraylist 
   public Inventario()
   {
      // Creo un arrayList di giocattoli
      vetGiocattoli = new ArrayList<Giocattolo>();
   }

   // Metodo per insierire un giocattolo all'interno dell'inventario
   public void addGiocattolo(Giocattolo giocattolo)
   {
      // Controllo se non sia vuoto 
      if (vetGiocattoli.isEmpty()) 
      {
         // Se vuoto inserisoc il giocattolo 
         vetGiocattoli.add(giocattolo);
      }
      else
      {
         // Flag controllo del giocattolo se presente 
         boolean flag = true;

         // Ricerco all'interno dell'invetario il giocattolo se è già presente 
         for(int i = 0; i < vetGiocattoli.size() && flag; i++)
         {
            // Controllo se l'elemento corrente sia uguale a quello che si vuole inserire 
            if (giocattolo.getNome().equals(vetGiocattoli.get(i).getNome())  
               && (giocattolo.getId() == vetGiocattoli.get(i).getId())) 
            {
               // Incremento la quantita dell'elemnto presente nell'inventario 
               vetGiocattoli.get(i).setQuantita(giocattolo.getQuantita());

               // modifica del flag 
               flag = false;
            }
         }

         // Controllo se il giocattolo già è presente 
         if (flag) 
         {
            vetGiocattoli.add(giocattolo);
         }
      }
   }

   // Metodo per modificare il giocattolo 
   public void modificaGiocattolo(String nome, double prezzo, int eta, String nomeN, double prezzoN, int etaN)
   {
      // Ricerco il giocattolo 
      // Flag controllo del giocattolo se presente 
      boolean flag = true;

      // Ricerco all'interno dell'invetario il giocattolo se è già presente 
      for(int i = 0; i < vetGiocattoli.size() && flag; i++)
      {
         // Controllo se è il giocattolo che si vuole modificare 
         if (vetGiocattoli.get(i).getNome().equals(nome) && vetGiocattoli.get(i).getPrezzo() == prezzo
            && vetGiocattoli.get(i).getEta() == eta)
         {
            // Modifico i parametri dell'oggetto
            vetGiocattoli.get(i).setNome(nomeN);
            vetGiocattoli.get(i).setPrezzo(prezzoN);
            vetGiocattoli.get(i).setEta(etaN);

            System.out.println("Giocattolo Modificato");
            flag = false;
         }
      }

      // Controllo del flag 
      if (flag) 
      {
         System.out.println("Il Giocattolo non è presente nell'inventario");
      }
   }

   // Elimina di un giocattolo 
   public void eliminaGiocattolo(String nome, double prezzo, int eta)
   {
      // Ricerco il giocattolo 
      // Flag controllo del giocattolo se presente 
      boolean flag = true;

      // Ricerco all'interno dell'invetario il giocattolo se è già presente 
      for(int i = 0; i < vetGiocattoli.size() && flag; i++)
      {
         // Controllo se è il giocattolo che si vuole modificare 
         if (vetGiocattoli.get(i).getNome().equals(nome) && vetGiocattoli.get(i).getPrezzo() == prezzo
            && vetGiocattoli.get(i).getEta() == eta)
         {
            // Rimozione dell'ogetto
            vetGiocattoli.remove(i);

            System.out.println("Giocattolo Eliminato");
            flag = false;
         }
      }

      // Controllo del flag 
      if (flag) 
      {
         System.out.println("Il Giocattolo non è presente nell'inventario");
      }
   }

   // Stampo l'inventario 
   public void stampaInvetario()
   {
      for(int i = 0; i < vetGiocattoli.size(); i++)
      {
         System.out.println("Nome: " + vetGiocattoli.get(i).getNome() + " Prezzo: " + vetGiocattoli.get(i).getPrezzo() + 
         " Eta' consigliata: " + vetGiocattoli.get(i).getEta() + " Quantita: " + vetGiocattoli.get(i).getQuantita()); 
      }
   }

}
