public class PessoaFisica extends Pessoa{
    @Override
    public String toString(){
        return "Nome:" +getNome() + ",idade" +getIdade() + ", Tipo: Pessoa Fisica";
    }
}
