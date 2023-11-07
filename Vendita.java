public class Vendita 
{
   // Memorizzo l'oggetto memorizzato dal cliente 
   private int idGiocattolo;
   // Memorizzo il cliente che ha effettuato l'acquisto 
   private int idCliente;
   // la quantità dell'oggetto che è stato compratro 
   private int quantita;

   // Costruttore 
   public Vendita(int idGiocattolo, int idCliente, int quantita)
   {
      this.idCliente = idCliente;
      this.idGiocattolo = idGiocattolo;
      this.quantita = quantita;
   }

   
   // Getter e setter dei attributi 
   public int getIdCliente()
   {
      return idCliente;
   }
   public int getIdGiocattolo()
   {
      return idGiocattolo;
   }
   public int getQuantita()
   {
      return quantita;
   }
   public void setIdCliente(int idCliente)
   {
      this.idCliente = idCliente;
   }
   public void setIdGiocattolo(int idGiocattolo)
   {
      this.idGiocattolo = idGiocattolo;
   }
   public void setQuantita(int quantita)
   {
      this.quantita = quantita;
   }
}
