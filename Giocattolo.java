public class Giocattolo 
{
   // Proprietà dell'ogetto 
   private String nome;
   private double prezzo;
   private int eta;
   private int quantita;

   // Codice progressivo che aumenta ad ogni creazione di un singolo giocattolo 
   // La variabile ed il suo valore è condiviso con tutti gli oggetti, la varibaile 
   // può cambiare di valore 
   private static int id = 0;

   // Costruttore 
   // Inizializzo i campi dell'oggetto
   public Giocattolo(int id, String nome, double prezzo, int eta, int quantita)
   {
      this.id++;
      this.nome = nome; 
      this.prezzo = prezzo;
      this.eta = eta;
      this.quantita = quantita;
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
   public int getQuantita()
   {
      return quantita;
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
   public void setQuantita(int quantita)
   {
      this.quantita += quantita;
   }
}
