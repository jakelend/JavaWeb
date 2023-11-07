public class Negozio 
{
   public static void main(String[] args) 
   {
      // Creazione del cliente 
      Cliente c1 = new Cliente("Luca", "luca@gmail.com");

      // Creazione di un ogetto 
      Giocattolo g1 = new Giocattolo("Nerf pistola", 30.40, 4, 2);

      // Creazione dell'inventario 
      Inventario inventario = new Inventario();

      inventario.addGiocattolo(g1);
      System.out.println(inventario);


   }
}
