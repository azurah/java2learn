package pt.c03java.s01pacote.s02lista.bibliotecaLista;

public class ListaEstatistica extends Lista {
   private int maiorValor = 0;
   
   public ListaEstatistica(int tamanho) {
      super(tamanho);
   }

   public void adicionar(int item) {
      super.adicionar(item);
      maiorValor = (item > maiorValor) ? item : maiorValor;
   }
   
   public double soma() {
      double s = 0;
      for (int l = 0; l <= ultimo; l++)
         s += vlista[l];
      return s;
   }
   
   public double media() {
      return (ultimo >= 0)
            ? soma() / (ultimo+1) : 0;
   }

   public int maior() {
      return maiorValor;
   }
}
