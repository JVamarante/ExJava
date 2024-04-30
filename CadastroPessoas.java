import java.util.ArrayList;
class CadastroPessoas {
    private ArrayList<Pessoa> pessoas = new ArrayList<>();

    public void cadastrarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa cadastrada com sucesso!");
    }

    public void listarPolimorficos() {
        for (Pessoa p : pessoas) {
            if (p instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) p;
                System.out.println("Nome: " + pf.getNome() + ", Idade: " + pf.getIdade() + ", Tipo: Pessoa Física, CPF: " + pf.getCpf());
            } else if (p instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) p;
                System.out.println("Nome: " + pj.getNome() + ", Idade: " + pj.getIdade() + ", Tipo: Pessoa Jurídica, CNPJ: " + pj.getCnpj());
            }
        }
    }
}