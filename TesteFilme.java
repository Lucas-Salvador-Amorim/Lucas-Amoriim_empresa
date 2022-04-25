public class TesteFilme {
    public static void main(String[] args) {
        Filme f=new Filme();
        f.setCodigo(1);
        f.setNome("A era do gelo");
        f.setValor(12);
        f.isDisponivel();
         
        f.mostra();

      //  Filme n=new Filme();
        f.setCodigo(2);
        f.setNome("Os Vingadores");
        f.setValor(15);
        f.isDisponivel();
         
        f.mostra();
    }

}
