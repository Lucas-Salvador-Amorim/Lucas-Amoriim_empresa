public class Filme {
    private int codigo;
    private String nome;
    private double valor;
    private boolean disponivel;


    public void setCodigo(int codigo){
        this.codigo=codigo;

    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getNome(){
        return this.nome;
    }
    public void setValor(double valor){
        this.valor=valor;
    }

    public double getValor(){
        return this.valor;
    }
    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
    public boolean isDisponivel(){
        return disponivel;
    }

    public void mostra(){
        System.out.println("o codigo é: " + this.codigo);
        System.out.println("o nome do filme é: " + this.nome);
        System.out.println("o valor do filme é: " + this.valor);
        System.out.println("Está disponivel?: " +this.disponivel);
    }
}

