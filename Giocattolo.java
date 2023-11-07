public class Giocattolo 
{
   // Proprietà dell'ogetto 
   private int id;
   private String nome;
   private double prezzo;
   private int eta;

   // Codice progressivo che aumenta ad ogni creazione di un singolo giocattolo 
   // La variabile ed il suo valore è condiviso con tutti gli oggetti, la varibaile 
   // può cambiare di valore 
   private static int num = 0;

   // Costruttore 
   // Inizializzo i campi dell'oggetto
   public Giocattolo(int id, String nome, double prezzo, int eta)
   {
      this.id = id;
      this.nome = nome; 
      this.prezzo = prezzo;
      this.eta = eta;
      this.num++;
   }

   // Getter e setter dei attributi 
   public int getId()
   {
      return id;
   }
   public String getNome()
   {
      return nome;
   }
   public double getPrezzo()
   {
      return prezzo;
   }
   public int getEta()
   {
      return eta;
   }
   public void setId(int id)
   {
      this.id = id;
   }
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setEta(int eta)
   {
      this.eta = eta;
   }
   public void setPrezzo(double prezzo)
   {
      this.prezzo = prezzo;
   }
}
