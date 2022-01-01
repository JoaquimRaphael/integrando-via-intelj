import Model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
       /* int a = 5;
        int b = 3;
        System.out.println("Hello Word " + (a+ b));*/

        Gato gato = new Gato();
        System.out.println(gato);
            Livro livro  = new Livro();
        System.out.println(livro);

    }


}
  class Livro {
    private String nome;
    private Integer numeroPaginas;

      public Livro(String nome, Integer numeroPaginas) {
          this.nome = nome;
          this.numeroPaginas = numeroPaginas;
      }

      public Livro() {
          
      }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public Integer getNumeroPaginas() {
          return numeroPaginas;
      }

      public void setNumeroPaginas(Integer numeroPaginas) {
          this.numeroPaginas = numeroPaginas;
      }

      @Override
      public String toString() {
          return "Livro{" +
                  "nome='" + nome + '\'' +
                  ", numeroPaginas=" + numeroPaginas +
                  '}';
      }
  }