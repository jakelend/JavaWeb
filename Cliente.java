public class Cliente
{
   // Proprietà dell'ogetto 
   private String nome;
   private String indirizzoEmail;

   // Id gestito automaticamente 
   private static int id = 0;

   // Costruttore 
   // Inizializzo i campi dell'oggetto
   public Cliente(int id, String nome, String indirizzoEmail)
   {
      this.id++;
      this.nome = nome;
      this.indirizzoEmail = indirizzoEmail;
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
   public String getIndirizzoEmail()
   {
      return indirizzoEmail;
   }
   public void setId(int id)
   {
      this.id = id;
   }
   public void setNome(String nome)
   {
      this.nome = nome;
   }
   public void setIndirizzoEmail(String indirizzoEmail)
   {
      this.indirizzoEmail = indirizzoEmail;
   }
}
