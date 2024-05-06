public class TiposOperadores {
   // = declara
   // == igual
   // != diferente
   // / divisao
   // * multiplicacao
   // % modulo - resto da divisao
   // boolean - false ou true
   // new Date ()
   // ++ acrescenta em 1 unidade
   // -- decrementa em 1 unidade

   //    int divisao = 15 / 3;
   //    int modulo = 18 % 3;
   //    double resultado = (10 *5) + (20 / 4);
   public static void main(String[] args) {
      
      // String nomeCompleto = "LINGUAGEM " + "JAVA";
      // System.out.println(nomeCompleto);
       
      int numero = 5;
      // x repeticao
      // boolean variavel = true;
      // variavel = !variavel;
      // && = e
      // || = ou

      System.out.println(numero ++);
      System.out.println(numero);

      int a, b;
      a = 5;
      b =6;

      String resultado = a == b ? "verdadeiro" : "falso";
      
      System.out.println(resultado);

      boolean cond1 = true;
      boolean cond2 = false;
      
      if(cond1 && cond2){
         System.out.println("As duas cond são verdadeiras");
      }
      if(cond1 || cond2){
         System.out.println("Uma das cond é verdadeira");
      }
   }
}
